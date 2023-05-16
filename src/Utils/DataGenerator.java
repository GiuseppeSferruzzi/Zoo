package Utils;
import Model.Eagle;
import Model.Lion;
import Model.Tiger;
import java.time.LocalDate;
import java.util.ArrayList;

public class DataGenerator {
    public ArrayList<Lion> generateLions(){
        ArrayList<Lion> lions = new ArrayList<>();
        Lion l1 = new Lion("Pippo", "bambini", 12, LocalDate.of(1991,12,21),50,3,1.5);
        Lion l2 = new Lion("Pluto", "bambine", 15,LocalDate.of(1981,9,4),60,4,1);
        lions.add(l1);
        lions.add(l2);
        return lions;
    }
    public ArrayList<Tiger> generateTigers(){
        ArrayList<Tiger> tigers = new ArrayList<>();
        Tiger t1 = new Tiger("Tigrotto", "cani", 9,LocalDate.of(1998,2,7),40,3,2);
        Tiger t2 = new Tiger("Shere", "scimmie", 10,LocalDate.of(2000,4,8),45,2.5,1);
        tigers.add(t1);
        tigers.add(t2);
        return tigers;
    }
    public ArrayList<Eagle> generateEagles(){
        ArrayList<Eagle> eagles = new ArrayList<>();
        Eagle a1 = new Eagle("Quila", "topi", 3,LocalDate.of(2005,5,12),8,1,2);
        Eagle a2 = new Eagle("Quilo", "serpenti", 4,LocalDate.of(2005,1,15),10,1.5,2.5);
        eagles.add(a1);
        eagles.add(a2);
        return eagles;
    }




}
