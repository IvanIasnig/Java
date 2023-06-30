import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Media[] media = new Media[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di media (1 per Immagine, 2 per Audio, 3 per Video) per il media " + (i + 1) + ":");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci il titolo dell'immagine " + (i + 1) + ":");
                    String titoloImmagine = scanner.nextLine();
                    System.out.println("Inserisci la luminosità dell'immagine " + (i + 1) + ":");
                    int luminosita = scanner.nextInt();
                    scanner.nextLine();
                    media[i] = new Immagine(titoloImmagine, luminosita);
                    break;
                case 2:
                    System.out.println("Inserisci il titolo dell'audio " + (i + 1) + ":");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("Inserisci la durata dell'audio " + (i + 1) + ":");
                    int durataAudio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserisci il volume audio dell'audio " + (i + 1) + ":");
                    int volumeAudio = scanner.nextInt();
                    scanner.nextLine();
                    media[i] = new Audio(titoloAudio, durataAudio, volumeAudio);
                    break;
                case 3:
                    System.out.println("Inserisci il titolo del video " + (i + 1) + ":");
                    String titoloVideo = scanner.nextLine();
                    System.out.println("Inserisci la durata del video " + (i + 1) + ":");
                    int durataVideo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserisci il volume audio del video " + (i + 1) + ":");
                    int volumeVideo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserisci la luminosità del video " + (i + 1) + ":");
                    int luminositaVideo = scanner.nextInt();
                    scanner.nextLine();
                    media[i] = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                default:
                    System.out.println("Tipo di media non valido. Riprova.");
                    i--;
                    break;
            }
        }

        int scelta;
        do {
            System.out.println("Scegli un elemento da 1 a 5 (0 per terminare):");
            scelta = scanner.nextInt();
            if (scelta > 0 && scelta <= media.length) {
                Media m = media[scelta - 1];
                if (m instanceof Riproducibile) {
                    ((Riproducibile) m).play();
                } else if (m instanceof Immagine) {
                    ((Immagine) m).show();
                }
            }
        } while (scelta != 0);

        scanner.close();
    }
}



