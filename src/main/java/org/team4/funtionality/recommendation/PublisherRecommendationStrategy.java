package org.team4.funtionality.recommendation;

import java.util.ArrayList;

import org.team4.maintaindb.MaintainBooks;
import org.team4.model.items.Book;
import org.team4.model.items.Item;

public class PublisherRecommendationStrategy extends Strategy {
	@Override
	public ArrayList<Book> getRecommendation(String publisher) {
		ArrayList<Item> books = MaintainBooks.getInstance().getAllBooks();
		ArrayList<Book> searchedBooks = new ArrayList<>();

		for (Item item: books) {
			if (searchedBooks.size() < 3) {
				Book book = (Book)item;
				if(book.getPublisher().equals(publisher)) {
					searchedBooks.add(book);
				}
			}
		}
		
		return searchedBooks;
	}
}