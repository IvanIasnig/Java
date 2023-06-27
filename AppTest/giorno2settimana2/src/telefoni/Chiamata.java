package telefoni;

public class Chiamata {
    private final int numeroChiamato;
    private final int durata;

    public Chiamata(int numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public int getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }
}



