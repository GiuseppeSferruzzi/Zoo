package View;

import Controller.ControllerZoo;
import Utils.DataGenerator;

public class ViewData {
    public void displayData(){
        DataGenerator dataGenerator = new DataGenerator();
        ControllerZoo controllerZoo = new ControllerZoo(dataGenerator.generateLions(),dataGenerator.generateTigers(),dataGenerator.generateEagles());

        System.out.println("The tallest eagle is: "+controllerZoo.findTallest(controllerZoo.getEagles()).getName());
        System.out.println("The shortest eagle is: "+controllerZoo.findShortest(controllerZoo.getEagles()).getName());

        System.out.println("The animal with the longest tail is: "+controllerZoo.getAnimalWithLongestTail().getName());
        System.out.println("The eagle with the largest wingspan is: "+controllerZoo.getEagleWithLargestWingspan().getName());
    }
}
