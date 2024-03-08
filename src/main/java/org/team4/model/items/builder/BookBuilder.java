package org.team4.model.items.builder;


import org.team4.model.items.Book;
import org.team4.model.items.Item;

//Concrete builder for Book
public class BookBuilder extends ItemBuilder<Book> {
 protected String genre;
 protected int noOfPages;
 protected String author;
 protected String ISBN;
 protected String publisher;
 protected int edition;
 protected boolean hasHardCopy;
 protected boolean hasSoftCopy;

 public BookBuilder genre(String genre) {
     this.genre = genre;
     return this;
 }

 public BookBuilder noOfPages(int noOfPages) {
     this.noOfPages = noOfPages;
     return this;
 }

 public BookBuilder author(String author) {
     this.author = author;
     return this;
 }

 public BookBuilder publisher(String publisher) {
     this.publisher = publisher;
     return this;
 }

 public BookBuilder edition(int edition) {
     this.edition = edition;
     return this;
 }
 
 public BookBuilder hasHardCopy(boolean hasHardCopy) {
	 this.hasHardCopy = hasHardCopy;
	 return this;
 }
 
 public BookBuilder hasSoftCopy(boolean hasSoftCopy) {
	 this.hasSoftCopy = hasSoftCopy;
	 return this;
 }

 @Override
 public Book build() {
     return new Book(new Item(title, yearPublished, quantity, price, ISBN, false, false), genre, noOfPages, author, publisher, edition, hasHardCopy, hasSoftCopy);
 }
}
