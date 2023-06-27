package es_rettangoli;

public class Rettangoli {

    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5.3, 4.32);

        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Perimetro del rettangolo: " + rettangolo.calcolaPerimetro());
    }

}
