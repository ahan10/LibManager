package org.team4.model.items;

public class Newsletter {
	private String title;
	private String link;
	private double price;

	public Newsletter(String title, String link, double price) {
		this.title = title;
		this.link = link;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getLink() {
		return link;
	}

	public double getPrice(){
		return price;
	}
}
