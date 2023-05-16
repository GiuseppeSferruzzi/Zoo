package Controller;

import Model.Animal;
import Model.Eagle;
import Model.Lion;
import Model.Tiger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ControllerZoo {
    private List<Lion> lions;
    private List<Tiger> tigers;
    private List<Eagle> eagles;

    public ControllerZoo() {
        this.lions = new ArrayList<>();
        this.tigers = new ArrayList<>();
        this.eagles = new ArrayList<>();
    }

    public void addLion(Lion lion){
        lions.add(lion);
    }

    public void addTiger(Tiger tiger){
        tigers.add(tiger);
    }

    public void addEagle(Eagle eagle){
        eagles.add(eagle);
    }

    /* Da Modificare con generic
    public Lion leoneAlto() {
        return lions.stream().max(Comparator.comparing(Lion::getHeight)).orElse(null);
    }

    public Lion leoneBasso() {
        return lions.stream().min(Comparator.comparing(Lion::getHeight)).orElse(null);
    }

    public Tiger tigreAlto() {
        return tigers.stream().max(Comparator.comparing(Tiger::getHeight)).orElse(null);
    }

    public Tiger tigreBasso() {
        return tigers.stream().min(Comparator.comparing(Tiger::getHeight)).orElse(null);
    }

    public Eagle aquilaAlto() {
        return eagles.stream().max(Comparator.comparing(Eagle::getHeight)).orElse(null);
    }

    public Eagle aquilaBasso() {
        return eagles.stream().min(Comparator.comparing(Eagle::getHeight)).orElse(null);
    }*/


    public Animal getAnimalWithLongestTail() {
        Lion lionWithLongestTail = lions.stream().max(Comparator.comparing(Lion::getTailLength)).orElse(null);
        Tiger tigerWithLongestTail = tigers.stream().max(Comparator.comparing(Tiger::getTailLength)).orElse(null);

        if(lionWithLongestTail.getTailLength() > tigerWithLongestTail.getTailLength()){
            return lionWithLongestTail;
        }else{
            return tigerWithLongestTail;
        }
    }

    public Eagle getEagleWithLargestWingspan() {
        return eagles.stream().max(Comparator.comparing(Eagle::getWingspan)).orElse(null);
    }
}
