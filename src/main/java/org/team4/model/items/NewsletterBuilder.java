package org.team4.model.items;

//Concrete builder for Newsletter
public class NewsletterBuilder extends ItemBuilder<Newsletter> {
 private String publisher = "DefaultPublisher";

 public NewsletterBuilder publisher(String publisher) {
     this.publisher = publisher;
     return this;
 }

 @Override
 public Newsletter build() {
     return new Newsletter(new Item(title, yearPublished), publisher);
 }
}

