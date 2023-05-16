package Model;

import java.time.LocalDate;
import java.util.Date;

public class Animale {
    protected String nome;
    protected String ciboPreferito;
    protected int eta;
    protected LocalDate dataEntrataZoo;
    protected double peso;
    protected double altezza;

    public Animale(String nome, String ciboPreferito, int eta, LocalDate dataEntrataZoo, double peso, double altezza) {
        this.nome = nome;
        this.ciboPreferito = ciboPreferito;
        this.eta = eta;
        this.dataEntrataZoo = dataEntrataZoo;
        this.peso = peso;
        this.altezza = altezza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCiboPreferito() {
        return ciboPreferito;
    }

    public void setCiboPreferito(String ciboPreferito) {
        this.ciboPreferito = ciboPreferito;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public LocalDate getDataEntrataZoo() {
        return dataEntrataZoo;
    }

    public void setDataEntrataZoo(LocalDate dataEntrataZoo) {
        this.dataEntrataZoo = dataEntrataZoo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

}

