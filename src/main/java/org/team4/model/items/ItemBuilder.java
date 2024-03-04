package org.team4.model.items;

import java.util.Date;

//Abstract builder with common parameters
public abstract class ItemBuilder<T extends Item> {
 protected String title;
 protected int yearPublished;

 public ItemBuilder<T> title(String title) {
     this.title = title;
     return this;
 }

 public ItemBuilder<T> yearPublished(int yearPublished) {
     this.yearPublished = yearPublished;
     return this;
 }

 // Abstract build method to be implemented by concrete builders
 public abstract T build();
}
