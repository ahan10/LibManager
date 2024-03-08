package org.team4.model.items;

public class BookRequest {
	
    private String email;
    private String title;
    private String author;
    private String ISBN;
    private int edition;
    private String booktype;

    
    public BookRequest(String email, String title, String author, String ISBN, int edition, String booktype) {
    	this.email = email;
    	this.title = title;
    	this.author = author;
    	this.ISBN = ISBN;
    	this.edition = edition;
    	this.booktype = booktype;
    }

	public String getEmail() {
		return email;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getEdition() {
		return edition;
	}
    
	public String getBookType() {
		return booktype;
	}
}
