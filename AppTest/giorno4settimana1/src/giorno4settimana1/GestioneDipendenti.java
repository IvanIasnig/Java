package giorno4settimana1;

public class GestioneDipendenti {
    public static void main(String[] args) {
        Dipendente operaio1 = new Dipendente("1", Dipendente.Dipartimento.PRODUZIONE);
        Dipendente operaio2 = new Dipendente("2", Dipendente.Dipartimento.PRODUZIONE);
        Dipendente impiegato = new Dipendente("3", Dipendente.stipendioBase, 30, Dipendente.Livello.IMPIEGATO, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente dirigente = new Dipendente("4", Dipendente.stipendioBase * 2, 30, Dipendente.Livello.DIRIGENTE, Dipendente.Dipartimento.VENDITE);

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
