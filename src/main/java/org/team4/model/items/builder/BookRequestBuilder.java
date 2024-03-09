package org.team4.model.items.builder;

import org.team4.model.items.BookRequest;

public class BookRequestBuilder {
	 private String email;
	 private String title;
	 private String author;
	 private String ISBN;
	 private int edition;
	 private String booktype;

	
	 public BookRequestBuilder email(String email) {
	     this.email = email;
	     return this;
	 }
	 
	 public BookRequestBuilder title(String title) {
	     this.title = title;
	     return this;
	 }
	 
	 public BookRequestBuilder author(String author) {
	     this.author = author;
	     return this;
	 }
	 
	 public BookRequestBuilder ISBN(String ISBN) {
	     this.ISBN = ISBN;
	     return this;
	 }
	 
	 public BookRequestBuilder edition(int edition) {
	     this.edition = edition;
	     return this;
	 }

	 public BookRequestBuilder booktype(String booktype) {
	     this.booktype = booktype;
	     return this;
	 }
	
	 public BookRequest build() {
	     return new BookRequest(email, title, author, ISBN, edition, booktype);
	 }
}
