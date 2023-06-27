package com.example;

public class Rettangolo {
    // Proprietà di un rettangolo
    private double altezza;
    private double larghezza;

    // Costruttore della classe Rettangolo
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Metodo per calcolare l'area del rettangolo
    public double calcolaArea() {
        return this.altezza * this.larghezza;
    }

    // Metodo per calcolare il perimetro del rettangolo
    public double calcolaPerimetro() {
        return 2 * (this.altezza + this.larghezza);
    }

    public static void main(String[] args) {
        // Creazione di un nuovo oggetto Rettangolo
        Rettangolo rettangolo = new Rettangolo(5.0, 4.0);

        // Stampa dell'area e del perimetro del rettangolo
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Perimetro del rettangolo: " + rettangolo.calcolaPerimetro());
    }
}
