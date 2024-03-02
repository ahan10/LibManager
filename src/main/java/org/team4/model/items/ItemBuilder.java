package org.team4.model.items;

import java.util.Date;

//Abstract builder with common parameters
public abstract class ItemBuilder<T extends Item> {
 protected String type;
 protected String title;
 protected Date yearPublished;

 public ItemBuilder<T> type(String type) {
     this.type = type;
     return this;
 }

 public ItemBuilder<T> title(String title) {
     this.title = title;
     return this;
 }

 public ItemBuilder<T> yearPublished(Date yearPublished) {
     this.yearPublished = yearPublished;
     return this;
 }

 // Abstract build method to be implemented by concrete builders
 public abstract T build();
}
