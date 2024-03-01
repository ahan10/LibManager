package org.team4.model.items;

public class Book extends Item{
    private String genere;
    private int noOfPages;
    private String author;
    private long ISBN;
    private String publisherName;
    private String edition;

    public Book(Item item, String genre, int noOfPages, String author, long ISBN, String publisherName, String edition) {
        super(item);
        this.genere = genre;
        this.noOfPages = noOfPages;
        this.author = author;
        this.ISBN = ISBN;
        this.publisherName = publisherName;
        this.edition = edition;
    }
}
