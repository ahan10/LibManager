package org.team4.model.items;

import java.util.Objects;

public class Book extends Item{

	private String genre;
    private int noOfPages;
    private String author;
    private long ISBN;
    private String publisher;
    private String edition;

    public Book(Item item, String genre, int noOfPages, String author, long ISBN, String publisherName, String edition) {
        super(item);
        this.genre = genre;
        this.noOfPages = noOfPages;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisherName;
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                ", noOfPages=" + noOfPages +
                ", author='" + author + '\'' +
                ", ISBN=" + ISBN +
                ", publisher='" + publisher + '\'' +
                ", edition='" + edition + '\'' +
                '}';
    }
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(ISBN, author, edition, genre, noOfPages, publisher);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return ISBN == other.ISBN && Objects.equals(author, other.author) && Objects.equals(edition, other.edition)
				&& Objects.equals(genre, other.genre) && noOfPages == other.noOfPages
				&& Objects.equals(publisher, other.publisher);
	}
    
}
