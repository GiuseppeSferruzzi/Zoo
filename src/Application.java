import controller.ZooController;
import model.*;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        testZoo();
    }

    private static void testZoo() {

        ZooController zooController = new ZooController();

		zooController.addAnimal(new Lion("Pippo", "bambini", 12, LocalDate.of(1991,12,21),50,3,1.5));
        zooController.addAnimal(new Lion("Pluto", "bambine", 15,LocalDate.of(1981,9,4),60,4,1));

        zooController.addAnimal(new Tiger("Tigrotto", "cani", 9,LocalDate.of(1998,2,7),40,3,2));
        zooController.addAnimal(new Tiger("Shere", "scimmie", 10,LocalDate.of(2000,4,8),45,2.5,1));

        zooController.addAnimal(new Eagle("Quila", "topi", 3,LocalDate.of(2005,5,12),8,1,2));
        zooController.addAnimal(new Eagle("Quilo", "serpenti", 4,LocalDate.of(2005,1,15),10,1.5,2.5));


		AnimalWithTail animalWithLongestTail = zooController.getAnimalWithLongestTail();
		System.out.println("Animal with longest tail: " + animalWithLongestTail.getName());

		AnimalWithWing animalWithWidestWingspan = zooController.getAnimalWithWidestWingspan();
		System.out.println("Animal with widest wingspan: " + animalWithWidestWingspan.getName());

		Tiger tallestTiger = zooController.getTallestAnimalByClass(Tiger.class);
		System.out.println("Tallest tiger: " + tallestTiger.getName());

		Tiger shortestTiger = zooController.getShortestAnimalByClass(Tiger.class);
		System.out.println("Shortest tiger: " + shortestTiger.getName());

		Lion tallestLion = zooController.getTallestAnimalByClass(Lion.class);
		System.out.println("Tallest lion: " + tallestLion.getName());

		Lion shortestLion = zooController.getShortestAnimalByClass(Lion.class);
	    System.out.println("Shortest lion: " + shortestLion.getName());

		Eagle tallestEagle = zooController.getTallestAnimalByClass(Eagle.class);
		System.out.println("Tallest eagle: " + tallestEagle.getName());

		Eagle shortestEagle = zooController.getShortestAnimalByClass(Eagle.class);
		System.out.println("Shortest eagle: " + shortestEagle.getName());

		Tiger heaviestTiger = zooController.getHeaviestAnimalByClass(Tiger.class);
		System.out.println("Heaviest tiger: " + heaviestTiger.getName());

		Tiger lightestTiger = zooController.getLightestAnimalByClass(Tiger.class);
	    System.out.println("Lightest tiger: " + lightestTiger.getName());

	    Lion heaviestLion = zooController.getHeaviestAnimalByClass(Lion.class);
		System.out.println("Heaviest lion: " + heaviestLion.getName());

	    Lion lightestLion = zooController.getLightestAnimalByClass(Lion.class);
	    System.out.println("Lightest lion: " + lightestLion.getName());

	    Eagle heaviestEagle = zooController.getHeaviestAnimalByClass(Eagle.class);
	    System.out.println("Heaviest eagle: " + heaviestEagle.getName());

	    Eagle lightestEagle = zooController.getLightestAnimalByClass(Eagle.class);
		System.out.println("Lightest eagle: " + lightestEagle.getName());
	}
}