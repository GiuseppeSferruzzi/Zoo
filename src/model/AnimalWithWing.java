package model;

import java.time.LocalDate;

public abstract class AnimalWithWing extends Animal{
    private double wingSpan;

    protected AnimalWithWing(String name, String favoriteFood, int age, LocalDate zooEntryDate, double weight, double height, double wingSpan) {
        super(name, favoriteFood, age, zooEntryDate, weight, height);
        this.wingSpan = wingSpan;
    }

    public double getWingspan() {
        return wingSpan;
    }

    public void setWingspan(double wingspan) {
        this.wingSpan = wingspan;
    }

}
