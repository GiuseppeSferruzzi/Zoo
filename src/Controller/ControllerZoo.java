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

    public ControllerZoo(List<Lion> lions, List<Tiger> tigers, List<Eagle> eagles) {
        this.lions = lions;
        this.tigers = tigers;
        this.eagles = eagles;
    }

    public List<Lion> getLions() {return lions;}
    public List<Tiger> getTigers() {return tigers;}
    public List<Eagle> getEagles() {return eagles;}

    public void addLion(Lion lion){
        lions.add(lion);
    }
    public void addTiger(Tiger tiger){
        tigers.add(tiger);
    }
    public void addEagle(Eagle eagle){
        eagles.add(eagle);
    }

    public <T extends Animal> T findTallest(List<T> animals) {
        return animals.stream().max(Comparator.comparing(Animal::getHeight)).orElse(null);
    }
    public <T extends Animal> T findShortest(List<T> animals) {
        return animals.stream().min(Comparator.comparing(Animal::getHeight)).orElse(null);
    }

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
