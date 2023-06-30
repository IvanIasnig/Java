public class Video extends Audio implements Visuale {
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        luminosita--;
    }

    public void play() {
        for(int i = 0; i < durata; i++){
            System.out.println(titolo + " " + "!".repeat(volume) + "*".repeat(luminosita));
        }
        
    }
    
}
