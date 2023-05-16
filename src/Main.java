import Controller.ControllerZoo;
import Model.Eagle;
import Model.Lion;
import Model.Tiger;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Lion l1 = new Lion("Pippo", "bambini", 12,LocalDate.of(1991,12,21),50,3,1.5);
        Lion l2 = new Lion("Pluto", "bambine", 15,LocalDate.of(1981,9,4),60,4,1);

        Tiger t1 = new Tiger("Tigrotto", "cani", 9,LocalDate.of(1998,2,7),40,3,2);
        Tiger t2 = new Tiger("Shere", "scimmie", 10,LocalDate.of(2000,4,8),45,2.5,1);

        Eagle a1 = new Eagle("Quila", "topi", 3,LocalDate.of(2005,5,12),8,1,2);
        Eagle a2 = new Eagle("Quilo", "serpenti", 4,LocalDate.of(2005,1,15),10,1.5,2.5);

        ControllerZoo controllerZoo = new ControllerZoo();

        controllerZoo.addLion(l1);
        controllerZoo.addLion(l2);
        controllerZoo.addTiger(t1);
        controllerZoo.addTiger(t2);
        controllerZoo.addEagle(a1);
        controllerZoo.addEagle(a2);

        /*
        System.out.println(controllerZoo.leoneAlto().getName());
        System.out.println(controllerZoo.leoneBasso().getName());

        System.out.println(controllerZoo.tigreAlto().getName());
        System.out.println(controllerZoo.tigreBasso().getName());

        System.out.println(controllerZoo.aquilaAlto().getName());
        System.out.println(controllerZoo.aquilaBasso().getName());
         */

        System.out.println(controllerZoo.getAnimalWithLongestTail().getName());
        System.out.println(controllerZoo.getEagleWithLargestWingspan().getName());
    }
}