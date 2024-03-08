package org.team4.model.items.builder;

import org.team4.model.items.DVD;
import org.team4.model.items.Item;

//Concrete builder for DVD
public class DVDBuilder extends ItemBuilder<DVD> {
 private String genre;
 private double duration;

 public DVDBuilder genre(String genre) {
     this.genre = genre;
     return this;
 }

 public DVDBuilder duration(double duration) {
     this.duration = duration;
     return this;
 }

 @Override
 public DVD build() {
     return new DVD(new Item(title, yearPublished, quantity, price, ISBN, false, false), genre, duration);
 }
}
