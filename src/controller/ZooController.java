package controller;

import model.*;

import java.util.*;
import java.util.stream.Collectors;


public class ZooController {
    private Map<Class<? extends Animal>, List<Animal>> animals;

    public ZooController() {
        this.animals = new HashMap<>();
    }

    public void addAnimal(Animal animal) {
        animals.computeIfAbsent(animal.getClass(), k -> new ArrayList<>()).add(animal);
    }

    private <T extends Animal> List<T> getAnimalsByClass(Class<T> clazz) {
        if (animals.get(clazz) != null) {
            return (List<T>) animals.get(clazz);
        }
        return animals.values().stream()
                .flatMap(Collection::stream)
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .collect(Collectors.toList());
    }

    private List<AnimalWithTail> getAllAnimalsWithTail() {
        return getAnimalsByClass(AnimalWithTail.class);
    }

    public List<AnimalWithWing> getAllAnimalsWithWing() {
        return getAnimalsByClass(AnimalWithWing.class);
    }

    public AnimalWithTail getAnimalWithLongestTail() {
        return getAllAnimalsWithTail().stream()
                .max(Comparator.comparing(AnimalWithTail::getTailLength))
                .orElse(null);
    }

    public AnimalWithWing getAnimalWithWidestWingspan() {
        return getAllAnimalsWithWing().stream()
                .max(Comparator.comparing(AnimalWithWing::getWingspan))
                .orElse(null);
    }

    public <T extends Animal> T getTallestAnimalByClass(Class<T> clazz) {
        return getAnimalsByClass(clazz).stream()
                .max(Comparator.comparing(Animal::getHeight))
                .orElse(null);
    }

    public <T extends Animal> T getShortestAnimalByClass(Class<T> clazz) {
        return getAnimalsByClass(clazz).stream()
                .min(Comparator.comparing(Animal::getHeight))
                .orElse(null);
    }

    public <T extends Animal> T getHeaviestAnimalByClass(Class<T> clazz) {
        return getAnimalsByClass(clazz).stream()
                .max(Comparator.comparing(Animal::getWeight))
                .orElse(null);
    }

    public <T extends Animal> T getLightestAnimalByClass(Class<T> clazz) {
        return getAnimalsByClass(clazz).stream()
                .min(Comparator.comparing(Animal::getWeight))
                .orElse(null);
    }
}
