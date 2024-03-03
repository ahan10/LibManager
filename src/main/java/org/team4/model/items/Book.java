package org.team4.model.items;

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
}
