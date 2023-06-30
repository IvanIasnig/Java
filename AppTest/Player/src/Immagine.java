public class Immagine extends Media implements Visuale {
	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
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

	public void show() {
		System.out.println(titolo + " " + "*".repeat(luminosita));
	}
}
