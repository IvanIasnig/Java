package telefoni;

import java.util.ArrayList;
import java.util.List;

public class SIM {

    private final int numero;
    private double credito;
    private final List<Chiamata> registroChiamate;

    public SIM(int numero) {
        this.numero = numero;
        this.credito = 10;
        this.registroChiamate = new ArrayList<>();
    }

    public void effettuaChiamata(Chiamata chiamata) {
        if (this.registroChiamate.size() >= 5) {
            this.registroChiamate.remove(0);
        }
        this.registroChiamate.add(chiamata);
    }

    public void stampaDatiSim() {
        System.out.println("Numero SIM: " + numero);
        System.out.println("Credito: " + credito);
        System.out.println("Ultime 5 chiamate:");
        for (Chiamata chiamata : registroChiamate) {
            System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() + ", durata: " + chiamata.getDurata() + " minuti");
        }
    }
}