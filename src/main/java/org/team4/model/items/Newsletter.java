package org.team4.model.items;

public class Newsletter {
	private String title;
	private String link;

	public Newsletter(String title, String link) {
		this.title = title;
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public String getLink() {
		return link;
	}
}
