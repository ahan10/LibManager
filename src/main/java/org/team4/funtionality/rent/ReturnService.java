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
import java.util.concurrent.TimeUnit;

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
            long overdueDays = (new Date().getTime() - rentedItem.getDueDate().getTime()) / (24 * 60 * 60 * 1000);
            boolean isLost = false;

            if (overdueDays > 0) {
                double penalty = rentalService.calculatePenaltyForItem(user.getEmail(), item.getISBN());

                if (overdueDays > 15) {
                    double totalAmount = penalty + item.getPrice();

                    String itemTitle = item.getTitle();

                    int choice = JOptionPane.showConfirmDialog(null,
                            "This item is over 15 days overdue and considered lost. Please pay penalty of $" + penalty +
                                    " plus the price of the item (" + itemTitle + ") which is $" + totalAmount +
                                    ". Do you want to proceed with the payment?", "Item Lost", JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE);

                    if (choice == JOptionPane.YES_OPTION) {
                        boolean paidTotalAmount = handlePenaltyPayment(user, totalAmount);
                        if (paidTotalAmount) {
                            rentMaintain.returnRentedItem(user.getEmail(), item.getISBN());
                            JOptionPane.showMessageDialog(null, "Amount paid for the lost item: " + itemTitle);

                            try {
                                rentMaintain.update();
                                System.out.println("Database updated successfully.");
                            } catch (Exception e) {
                                System.out.println("Failed to update database: " + e.getMessage());
                                return false;
                            }
                            return true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Unable to process payment.");

                            return false;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Payment pending for the lost item: " + itemTitle);
                        return false;
                    }
                } else {
                    int choice = JOptionPane.showConfirmDialog(null, "This item is overdue and has a penalty of $" + penalty + ". Do you want to proceed with the payment?", "Penalty Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                    if (choice != JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "Please pay penalty to return item");
                        return false;
                    }

                    boolean paidPenalty = handlePenaltyPayment(user, penalty);
                    if (!paidPenalty) {
                        JOptionPane.showMessageDialog(null, "Unable to process payment.");
                        return false;
                    }
                    JOptionPane.showMessageDialog(null, "Penalty paid. Proceeding with return.");
                }
            }

            if (!isLost) {
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
            }

            try {
                rentMaintain.update();
                System.out.println("Database updated successfully.");
                JOptionPane.showMessageDialog(null, "Item returned successfully!");
                return true;
            } catch (Exception e) {
                System.out.println("Failed to update database: " + e.getMessage());
                return false;
            }
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

public Item findItemByISBN(String isbn) {

        Book book = maintainBooks.searchExactBookByISBN(isbn);
        if (book != null) {
            return book;
        }

        DVD dvd = maintainDVD.searchExactDVDByISBN(isbn);
        if (dvd != null) {
            return dvd;
        }

        Magazine magazine = maintainMagazine.searchExactMagazineByISBN(isbn);
        if (magazine != null) {
            return magazine;
        }

        return null;
    }



}

