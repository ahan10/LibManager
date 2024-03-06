package org.team4.model.items;

public class DVD extends Item{
    private String genre;
    private double duration;

    public DVD(Item item, String genre, double duration) {
        super(item);
        this.genre = genre;
        this.duration = duration;
    }

	public String getGenre() {
		return genre;
	}

	public double getDuration() {
		return duration;
	}
}
