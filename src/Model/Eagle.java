package Model;

import java.time.LocalDate;

public class Eagle extends Animal {
    private double wingspan;

    public Eagle(String name, String favoriteFood, int age, LocalDate zooEntryDate, double weight, double height, double wingspan) {
        super(name, favoriteFood, age, zooEntryDate, weight, height);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }
}
