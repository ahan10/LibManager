package org.team4.funtionality.rent;
import org.team4.maintaindb.*;
import org.team4.model.items.*;
import org.team4.model.user.User;

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
        if (rentedItems != null) {
            for (RentedItem rentedItem : rentedItems) {
                if (rentedItem.getISBN().equals(item.getISBN())) {

                    if (rentedItem.getDueDate().before(new Date())) {

                        double penalty = rentalService.calculatePenalty(user.getEmail());

                        if (!handlePenaltyPayment(user, penalty)) { // ahan's method to process penalty or something similar
                            System.out.println("Unable to process return due to unpaid penalty.");
                            return false;
                        }
                    }

                    if (rentMaintain.returnRentedItem(user.getEmail(), item.getISBN())) {
                        increaseItemQuantity(item);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void increaseItemQuantity(Item item) {
        try {
            if (item instanceof Book) {
                maintainBooks.increaseNumberOfCopies((Book) item);
            } else if (item instanceof DVD) {
                maintainDVD.increaseNumberOfCopies((DVD) item);
            } else if (item instanceof Magazine) {
                maintainMagazine.increaseNumberOfCopies((Magazine) item);
            } else {
                throw new Exception("Unsupported item type for return.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to increase quantity of the returned item.");
        }
    }

    private boolean handlePenaltyPayment(User user, double penalty) {

        System.out.println("User " + user.getEmail() + " has to pay a penalty of $" + penalty);

        return true;
    }
}
