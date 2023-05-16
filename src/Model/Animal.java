package Model;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected String favoriteFood;
    protected int age;
    protected LocalDate zooEntryDate;
    protected double weight;
    protected double height;

    public Animal(String name, String favoriteFood, int age, LocalDate zooEntryDate, double weight, double height) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
        this.zooEntryDate = zooEntryDate;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getZooEntryDate() {
        return zooEntryDate;
    }

    public void setZooEntryDate(LocalDate zooEntryDate) {
        this.zooEntryDate = zooEntryDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}

