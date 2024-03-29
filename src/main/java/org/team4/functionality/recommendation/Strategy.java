package org.team4.functionality.recommendation;

import java.util.ArrayList;
import org.team4.model.items.Book;

public abstract class Strategy {
	public abstract ArrayList<Book> getRecommendation(String query);
}
