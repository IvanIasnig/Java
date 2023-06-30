public class Audio extends Media implements Riproducibile {
    protected int durata;
    protected int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void play() {
        for(int i = 0; i < durata; i++){
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void abbassaVolume() {
        volume--;
    }
}
