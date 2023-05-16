package Model;

import java.time.LocalDate;

public class Lion extends Animal {
    private double tailLength;

    public Lion(String name, String favoriteFood, int age, LocalDate zooEntryDate, double weight, double height, double tailLength) {
        super(name, favoriteFood, age, zooEntryDate, weight, height);
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
}
