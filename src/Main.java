import java.sql.Date;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Leone l1 = new Leone("Pippo", "bambini", 12,LocalDate.of(1991,12,21),50,3,1.5);
        Leone l2 = new Leone("Pluto", "bambine", 15,LocalDate.of(1981,9,4),60,4,1);

        Tigre t1 = new Tigre("Tigrotto", "cani", 9,LocalDate.of(1998,2,7),40,3,2);
        Tigre t2 = new Tigre("Shere", "scimmie", 10,LocalDate.of(2000,4,8),45,2.5,1);

        Aquila a1 = new Aquila("Quila", "topi", 3,LocalDate.of(2005,5,12),8,1,2);
        Aquila a2 = new Aquila("Quilo", "serpenti", 4,LocalDate.of(2005,1,15),10,1.5,2.5);

        GestioneZoo gestioneZoo = new GestioneZoo();

        gestioneZoo.addLeone(l1);
        gestioneZoo.addLeone(l2);
        gestioneZoo.addTigre(t1);
        gestioneZoo.addTigre(t2);
        gestioneZoo.addAquila(a1);
        gestioneZoo.addAquila(a2);

        System.out.println(gestioneZoo.leoneAlto().getNome());
        System.out.println(gestioneZoo.leoneBasso().getNome());

        System.out.println(gestioneZoo.tigreAlto().getNome());
        System.out.println(gestioneZoo.tigreBasso().getNome());

        System.out.println(gestioneZoo.aquilaAlto().getNome());
        System.out.println(gestioneZoo.aquilaBasso().getNome());

        System.out.println(gestioneZoo.animaleConCodaLunga().getNome());
        System.out.println(gestioneZoo.aquilaConMaggioreAperturaAlare().getNome());
    }
}