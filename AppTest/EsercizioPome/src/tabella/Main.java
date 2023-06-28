package tabella;

public class Main {

	public static void main(String[] args) {
		
		int size = 10;
		
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j <= size; j++) {
				int prodotto = i *j;
				System.out.printf("%d \t",prodotto);
			}
			System.out.println();
		}
		
	}

}
