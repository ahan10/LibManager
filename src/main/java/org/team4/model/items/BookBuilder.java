package org.team4.model.items;


//Concrete builder for Book
public class BookBuilder extends ItemBuilder<Book> {
 protected String genre;
 protected int noOfPages;
 protected String author;
 protected String ISBN;
 protected String publisher;
 protected String edition;

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

 public BookBuilder ISBN(String ISBN) {
     this.ISBN = ISBN;
     return this;
 }

 public BookBuilder publisher(String publisher) {
     this.publisher = publisher;
     return this;
 }

 public BookBuilder edition(String edition) {
     this.edition = edition;
     return this;
 }

 @Override
 public Book build() {
     return new Book(new Item(title, yearPublished), genre, noOfPages, author, ISBN, publisher, edition);
 }
}
