import java.time.LocalDate;
import java.util.Date;

public class Leone extends Animale {
    private double lunghezzaCoda;

    public Leone(String nome, String ciboPreferito, int eta, LocalDate dataEntrataZoo, double peso, double altezza, double lunghezzaCoda) {
        super(nome, ciboPreferito, eta, dataEntrataZoo, peso, altezza);
        this.lunghezzaCoda = lunghezzaCoda;
    }

    public double getLunghezzaCoda() {
        return lunghezzaCoda;
    }

    public void setLunghezzaCoda(double lunghezzaCoda) {
        this.lunghezzaCoda = lunghezzaCoda;
    }
}
