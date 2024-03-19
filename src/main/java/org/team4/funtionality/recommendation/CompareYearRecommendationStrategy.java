package org.team4.funtionality.recommendation;

import java.util.ArrayList;

import org.team4.maintaindb.MaintainBooks;
import org.team4.model.items.Book;
import org.team4.model.items.Item;

public class CompareYearRecommendationStrategy extends Strategy {
	@Override
	public ArrayList<Book> getRecommendation(String year) {
		ArrayList<Item> books = MaintainBooks.getInstance().getAllBooks();
		ArrayList<Book> searchedBooks = new ArrayList<>();

		for (Item item: books) {
			if (searchedBooks.size() < 3) {
				Book book = (Book)item;
				if(Math.abs(book.getYearPublished() - Integer.parseInt(year)) <= 3) {
					searchedBooks.add(book);
				}
			}
		}
		
		return searchedBooks;
	}


}