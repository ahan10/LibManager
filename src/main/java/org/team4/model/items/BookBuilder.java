package org.team4.model.items;


//Concrete builder for Book
public class BookBuilder extends ItemBuilder<Book> {
 protected String genre = "DefaultGenre";
 protected int noOfPages = 0;
 protected String author = "DefaultAuthor";
 protected long ISBN = 0L;
 protected String publisher = "DefaultPublisher";
 protected String edition = "DefaultEdition";

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

 public BookBuilder ISBN(long ISBN) {
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
