package org.team4.funtionality.rent;
import org.team4.controller.purchase.PurchaseController;
import org.team4.maintaindb.*;
import org.team4.model.items.*;
import org.team4.model.user.User;
import org.team4.view.purchase.Payment;
import org.team4.view.purchase.PurchaseFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.List;

public class ReturnService {

    private MaintainRent rentMaintain = MaintainDatabase.getInstance().getrenterDatabase();
    private MaintainBooks maintainBooks = MaintainDatabase.getInstance().getBookDatabase();
    private MaintainDVD maintainDVD = MaintainDatabase.getInstance().getDVDDatabase();
    private MaintainMagazine maintainMagazine = MaintainDatabase.getInstance().getMagazineDatabase();
    private RentalService rentalService = new RentalService();

    public boolean returnItem(User user, Item item) {

        List<RentedItem> rentedItems = rentMaintain.getAllRenters().get(user.getEmail());
        if (rentedItems == null) {
            System.out.println("No rented items found for user.");
            return false;
        }

        for (RentedItem rentedItem : rentedItems) {
            if (!rentedItem.getISBN().equals(item.getISBN())) {
                continue;
            }

            if (rentedItem.getDueDate().before(new Date())) {
                double penalty = rentalService.calculatePenaltyForItem(user.getEmail(), item.getISBN());

//                pay penalty yes or no
//                        yes or if no return not possible

                boolean paidPenalty = handlePenaltyPayment(user, penalty);
                if (!paidPenalty) {
                    System.out.println("Unable to process return due to unpaid penalty.");
                    return false;
                }
                System.out.println("Penalty paid, proceeding with return.");
            }

            boolean isReturned = rentMaintain.returnRentedItem(user.getEmail(), item.getISBN());
            if (!isReturned) {
                System.out.println("Failed to return rented item in database.");
                return false;
            }

            boolean increased = increaseItemQuantity(item);
            if (!increased) {
                System.out.println("Failed to increase item quantity.");
                return false;
            }

            try {
                rentMaintain.update();
                System.out.println("Database updated successfully.");
            } catch (Exception e) {
                System.out.println("Failed to update database: " + e.getMessage());
                return false;
            }

            return true;
        }

        System.out.println("Item with given ISBN not found in rented items.");
        return false;
    }


    private boolean increaseItemQuantity(Item item) {
        try {
            if (item instanceof Book) {
                maintainBooks.increaseNumberOfCopies((Book) item);
            } else if (item instanceof DVD) {
                maintainDVD.increaseNumberOfCopies((DVD) item);
            } else if (item instanceof Magazine) {
                maintainMagazine.increaseNumberOfCopies((Magazine) item);
            } else {
                System.out.println("Unsupported item type for return.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Failed to increase quantity of the returned item: " + e.getMessage());
            return false;
        }
        return true;
    }


    private boolean handlePenaltyPayment(User user, double penalty) {
        System.out.println("User " + user.getEmail() + " has to pay a penalty of $" + penalty);

        Payment payment = new Payment(penalty, user);

        return payment.isSuccess();
    }
}

