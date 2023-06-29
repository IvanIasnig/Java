package giorno4settimana1;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente operaio1 = new Dipendente("001", Dipendente.Dipartimento.PRODUZIONE);
        Dipendente operaio2 = new Dipendente("002", Dipendente.Dipartimento.PRODUZIONE);
        Dipendente impiegato = new Dipendente("003", Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente dirigente = new Dipendente("126", Dipendente.stipendioBase * 2, 30, Dipendente.Livello.DIRIGENTE, Dipendente.Dipartimento.VENDITE);

        operaio1.promuovi();
        impiegato.promuovi();

        operaio1.stampaDatiDipendente();
        System.out.println("-------------------------------------");
        operaio2.stampaDatiDipendente();
        System.out.println("-------------------------------------");
        impiegato.stampaDatiDipendente();
        System.out.println("-------------------------------------");
        dirigente.stampaDatiDipendente();
        System.out.println("-------------------------------------");

        double sommaStipendi = Dipendente.calcolaPaga(operaio1, 5) + Dipendente.calcolaPaga(operaio2, 5) + Dipendente.calcolaPaga(impiegato, 5) + Dipendente.calcolaPaga(dirigente, 5);
        System.out.println("La somma di tutti gli stipendi, compresi gli straordinari, è: " + sommaStipendi);
    }
}
