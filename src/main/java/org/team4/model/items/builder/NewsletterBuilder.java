package org.team4.model.items.builder;

import org.team4.model.items.Item;
import org.team4.model.items.Newsletter;

//Concrete builder for Newsletter
public class NewsletterBuilder extends ItemBuilder<Newsletter> {
 private String publisher;

 public NewsletterBuilder publisher(String publisher) {
     this.publisher = publisher;
     return this;
 }

 @Override
 public Newsletter build() {
     return new Newsletter(new Item(title, yearPublished), publisher);
 }
}

