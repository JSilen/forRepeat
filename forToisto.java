import java.util.Scanner;

public class forToisto {
	public static void main(String[] args) {
		
		Scanner lukija = new Scanner(System.in);

		System.out.print("Anna kokonaisluku: ");
		int luku = lukija.nextInt();

		if (luku <= 0) {
			System.out.println("Et antanut positiivista kokonaislukua.");
			return;
		}

		for (int i = luku; i >= 0; i--) {
			System.out.println(i);
		}
	}
}