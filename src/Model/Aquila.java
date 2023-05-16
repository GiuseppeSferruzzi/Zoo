package Model;

import Model.Animale;

import java.time.LocalDate;

public class Aquila extends Animale {
    private double aperturaAlare;

    public Aquila(String nome, String ciboPreferito, int eta, LocalDate dataEntrataZoo, double peso, double altezza, double aperturaAlare) {
        super(nome, ciboPreferito, eta, dataEntrataZoo, peso, altezza);
        this.aperturaAlare = aperturaAlare;
    }

    public double getAperturaAlare() {
        return aperturaAlare;
    }

    public void setAperturaAlare(double aperturaAlare) {
        this.aperturaAlare = aperturaAlare;
    }
}
