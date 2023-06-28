package esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;

        do {
            System.out.println("Inserisci una stringa (digita ':q' per uscire):");
            str = input.nextLine();
            for (char c : str.toCharArray()) {
                System.out.print(c + ",");
            }
            System.out.println();
        } while (!str.equals(":q"));

        input.close();
    }
}