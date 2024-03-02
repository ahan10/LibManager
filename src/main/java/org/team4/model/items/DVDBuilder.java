package org.team4.model.items;

//Concrete builder for DVD
public class DVDBuilder extends ItemBuilder<DVD> {
 private String genre = "DefaultGenre";
 private double duration = 0.0;

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
     return new DVD(new Item (title, yearPublished), genre, duration);
 }
}
