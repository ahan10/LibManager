package org.team4.funtionality.rent;
import org.team4.maintaindb.MaintainBooks;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainRent;
import org.team4.model.items.Book;
import org.team4.model.user.User;
import java.util.Date;
import java.util.List;
import org.team4.model.items.RentedItem;

public class RentalService {
    private static final int MAX_RENTALS_PER_USER = 10;


    private MaintainRent rentmaintain= MaintainDatabase.getInstance().getrenterDatabase();
    private MaintainBooks maintainDB= MaintainDatabase.getInstance().getBookDatabase();


    public boolean rentBook(User user, Book book) throws Exception {
        if (canRentBook(user, book)) {
            maintainDB.decreaseNumberOfCopies(book);
            RentedItem rental = new RentedItem(book.getISBN(), new Date());
            rentmaintain.addNewRentedItem(user.getEmail(), book.getISBN(), new java.sql.Date(new java.util.Date().getTime()));
            rentmaintain.update();
            return true;
        }
        return false;
    }
    public boolean canRentBook(User user, Book book) {
        if (!book.isRentable() || book.getQuantity() < 1)
            return false;
        int userRentalCount = getRentalCountForUser(user.getEmail());
        if (rentmaintain.isAlreadyRentedByUser(user.getEmail(), new RentedItem(book.getISBN(),null))){
            return false;
        }
        return rentmaintain.getNumberOfItemsRentedByUser(user.getEmail())< MAX_RENTALS_PER_USER ;

    }
        public int getRentalCountForUser(String userEmail) {
        int userRentals = rentmaintain.getNumberOfItemsRentedByUser(userEmail);  // getRentalsForuser ( csv reader )
        return userRentals;
    }


}
