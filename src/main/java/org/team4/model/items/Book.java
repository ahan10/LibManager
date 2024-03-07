package org.team4.model.items;

import java.util.Objects;

public class Book extends Item{

	private String genre;
    private int noOfPages;
    private String author;
    private String ISBN;
    private String publisher;
    private int edition;
    private boolean hasHardCopy;
    private boolean hasSoftCopy;
    private float price;

    public Book(Item item, String genre, int noOfPages, String author, String ISBN, String publisherName, int edition, boolean hasHardCopy, boolean hasSoftCopy, float price) {
        super(item);
        this.genre = genre;
        this.noOfPages = noOfPages;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisherName;
        this.edition = edition;
        this.hasHardCopy = hasHardCopy;
        this.hasSoftCopy = hasSoftCopy;
        this.price = price;
    }
    
	public String getGenre() {
		return genre;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getEdition() {
		return edition;
	}
	
	public boolean hasHardCopy() {
		return hasHardCopy;
	}
	
	public boolean hasSoftCopy() {
		return hasSoftCopy;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
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
