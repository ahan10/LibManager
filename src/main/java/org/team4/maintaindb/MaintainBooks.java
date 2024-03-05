package org.team4.maintaindb;

import com.csvreader.CsvReader;
import org.team4.model.items.Book;
import org.team4.model.items.BookBuilder;
import org.team4.model.user.User;

import org.team4.model.items.Item;
import org.team4.model.items.PurchasableItemDecorator;
import org.team4.model.items.RentableItemDecorator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


public class MaintainBooks {
    private static final String FILE_PATH = "database/books.csv";

    public MaintainBooks(){}

    public static ArrayList<Item> getAllBooks(){
        ArrayList<Item> allBooks = new ArrayList<>();
        CsvReader reader = null;

        try {
            reader = new CsvReader(FILE_PATH);
            reader.readHeaders();
            while(reader.readRecord()){
                Item b = ((BookBuilder) new BookBuilder()
                        .title(reader.get("title"))
                        .yearPublished(Integer.parseInt(reader.get("yearPublished"))))
                        .noOfPages(Integer.parseInt(reader.get("noOfPages")))
                        .author(reader.get("author"))
                        .ISBN(reader.get("ISBN"))
                        .publisher(reader.get("publisherName"))
                        .edition(Integer.parseInt(reader.get("edition")))
                        .genre(reader.get("genre"))
                        .build();
                if(Boolean.parseBoolean(reader.get("isPurchaseable"))) {
                    PurchasableItemDecorator pb = new PurchasableItemDecorator(b);
                    b = pb.getItem();
                }
                if(Boolean.parseBoolean(reader.get("isRentable"))) {
                    RentableItemDecorator rb = new RentableItemDecorator(b);
                    b = rb.getItem();

                }

                allBooks.add(b);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return allBooks;
    }
    public static ArrayList<Book> searchBooks(String query) {
        ArrayList<Item> books = getAllBooks();
        ArrayList<Book> searchedBooks = new ArrayList<>();

        for (Item item: books) {
            if (item.getTitle().toLowerCase().contains(query.toLowerCase())) {
                Book book = (Book)item;
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }



}