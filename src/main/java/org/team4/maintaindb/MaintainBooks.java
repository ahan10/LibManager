package org.team4.maintaindb;

import com.csvreader.CsvReader;
import org.team4.model.items.Book;
import org.team4.model.items.BookBuilder;
import org.team4.model.user.User;

import org.team4.model.items.Item;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class MaintainBooks {
    private static final String FILE_PATH = "database/books.csv";

    public MaintainBooks(){}

    public ArrayList<Book> getAllBooks(){
        ArrayList<Book> allBooks = new ArrayList<Book>();
        CsvReader reader = null;

        try {
            reader = new CsvReader(FILE_PATH);
            reader.readHeaders();
            while(reader.readRecord()){
               Book b = ((BookBuilder) new BookBuilder()
                       .title(reader.get("title"))
                       .yearPublished(Integer.parseInt(reader.get("yearPublished"))))
                       .noOfPages(Integer.parseInt(reader.get("noOfPages")))
                       .author(reader.get("author"))
                       .ISBN(reader.get("ISBN"))
                       .publisher(reader.get("publisherName"))
                       .edition(reader.get("edition"))
                       .genre(reader.get("genre")) // parse int
                       .build();

               allBooks.add(b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return allBooks;
    }
}
