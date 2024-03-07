package org.team4.funtionality.rent;
import org.team4.model.items.Book;
import org.team4.model.user.User;
import java.util.Date;
import java.util.List;

public class RentalService {
    private static final int MAX_RENTALS_PER_USER = 10;
    private static final String RENTALS_FILE_PATH = "database/rentals.csv";

    public boolean rentBook(User user, Book book) {
        if (canRentBook(user, book)) {
            book.setQuantity(book.getQuantity() - 1);
            RentItem rental = new RentItem(user.getEmail(), book.getTitle(), new Date());
//            writeRentalInfo(rental); maintaindb to write info
            return true;
        }
        return false;
    }
    private boolean canRentBook(User user, Book book) {
        if (!book.isRentable() || book.getQuantity() < 1)
            return false;
        int userRentalCount = getRentalCountForUser(user.getEmail());
        return userRentalCount < MAX_RENTALS_PER_USER;

    }
    public int getRentalCountForUser(String userEmail) {
        List<RentItem> userRentals = getRentalsForUser(userEmail);  // getRentalsForuser ( csv reader )
        return userRentals.size();
    }

}
