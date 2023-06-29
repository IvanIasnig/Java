package giorno4settimana1;

public class Dipendente {
    public enum Livello {OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE}
    public enum Dipartimento {PRODUZIONE, AMMINISTRAZIONE, VENDITE}

    private static final double stipendioBase = 1000;
    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
        this.dipartimento = dipartimento;
    }

    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void stampaDatiDipendente() {
        System.out.println("Matricola: " + matricola);
        System.out.println("Stipendio: " + stipendio);
        System.out.println("Importo Ora Straordinaria: " + importoOrarioStraordinario);
        System.out.println("Livello: " + livello);
        System.out.println("Dipartimento: " + dipartimento);
    }

    public Livello promuovi() {
        switch (this.livello) {
            case OPERAIO:
                this.livello = Livello.IMPIEGATO;
                this.stipendio = stipendioBase * 1.2;
                break;
            case IMPIEGATO:
                this.livello = Livello.QUADRO;
                this.stipendio = stipendioBase * 1.5;
                break;
            case QUADRO:
                this.livello = Livello.DIRIGENTE;
                this.stipendio = stipendioBase * 2;
                break;
            case DIRIGENTE:
                System.out.println("Il dipendente è già un dirigente, non può essere promosso");
                break;
        }
        return this.livello;
    }

    public static double calcolaPaga(Dipendente d) {
        return d.getStipendio();
    }

    public static double calcolaPaga(Dipendente d, int oreStraordinario) {
        return d.getStipendio() + d.getImportoOrarioStraordinario() * oreStraordinario;
    }
}

