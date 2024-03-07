package org.team4.maintaindb;

import com.csvreader.CsvReader;
import org.team4.model.items.Book;
import org.team4.model.items.builder.BookBuilder;

import org.team4.model.items.Item;
import org.team4.model.items.decorator.PurchasableItemDecorator;
import org.team4.model.items.decorator.RentableItemDecorator;
import java.util.ArrayList;


public class MaintainBooks {
	private static MaintainBooks instance;
	
	public ArrayList<Item> books;
	
    private static final String FILE_PATH = "database/books.csv";

    private MaintainBooks(){
    	this.books = new ArrayList<Item>();
    	try {
			this.load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Failed to Initialize Book Database");
		}
    	
    }
    
    public static MaintainBooks getInstance() {
		if (instance == null) {
			// Extra check for Multi-threaded applications
			synchronized (MaintainBooks.class) {
				if (instance == null) {
					instance = new MaintainBooks();
				}
			}
		}
		
		return instance;
	}

    public void load() throws Exception{
		CsvReader reader = new CsvReader(FILE_PATH);
		reader.readHeaders();

		while (reader.readRecord()) {
			Item newBook = ((BookBuilder) new BookBuilder()
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
                PurchasableItemDecorator purchasableDecorator = new PurchasableItemDecorator(newBook);
                newBook = purchasableDecorator.getItem();
            }
            if(Boolean.parseBoolean(reader.get("isRentable"))) {
                RentableItemDecorator rentableDecorator = new RentableItemDecorator(newBook);
                newBook = rentableDecorator.getItem();

            }
            
            books.add(newBook);
		}
	}
    
    public ArrayList<Item> getAllBooks(){
    	try {
			load();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return this.books;

    }
    public ArrayList<Book> searchBooks(String query) {
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