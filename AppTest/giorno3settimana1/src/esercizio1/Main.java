package esercizio1;

public class Main {
    public static void main(String[] args) {
        String testString = "Ciao come va?";
        System.out.println("La stringa '" + testString + "' ha un numero di caratteri " + (stringaPariDispari(testString) ? "pari" : "dispari"));

        int testAnno = 2024;
        System.out.println("L'anno " + testAnno + " è " + (annoBisestile(testAnno) ? "" : "non ") + "bisestile.");
    }

    public static boolean stringaPariDispari(String input) {
        return input.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 400 == 0) {
            return true;
        } else if (anno % 100 == 0) {
            return false;
        } else {
            return anno % 4 == 0;
        }
    }
}
