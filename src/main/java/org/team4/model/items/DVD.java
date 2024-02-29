package org.team4.model.items;

public class DVD extends Item{
    private String genere;
    private double duration;

    public DVD(Item item, String genere, double duration) {
        super(item);
        this.genere = genere;
        this.duration = duration;
    }
}
