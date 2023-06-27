package es_rettangoli;

public class Rettangolo {

    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return this.altezza * this.larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (this.altezza + this.larghezza);
    }

}
