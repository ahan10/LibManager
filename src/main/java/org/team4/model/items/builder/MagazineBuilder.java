package org.team4.model.items.builder;

import org.team4.model.items.Item;
import org.team4.model.items.Magazine;

//Concrete builder for Newsletter
public class MagazineBuilder extends ItemBuilder<Magazine> {
 private String publisher;
 private int issueNumber;


 public MagazineBuilder publisher(String publisher) {
     this.publisher = publisher;
     return this;
 }

 public MagazineBuilder issueNumber(int issueNumber) {
     this.issueNumber = issueNumber;
     return this;
 }
 
 @Override
 public Magazine build() {
     return new Magazine(new Item(title, yearPublished, quantity, price, ISBN, false, false), publisher, issueNumber);
 }
}

