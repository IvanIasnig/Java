package telefoni;

public class Main {
    public static void main(String[] args) {
        SIM sim = new SIM(334909787);
        sim.effettuaChiamata(new Chiamata(334909781, 10));
        sim.effettuaChiamata(new Chiamata(332909761, 5));
        sim.effettuaChiamata(new Chiamata(334939761, 15));
        sim.effettuaChiamata(new Chiamata(334919761, 20));
        sim.effettuaChiamata(new Chiamata(334907613, 8));
        sim.stampaDatiSim();
    }
}

