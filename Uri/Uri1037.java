package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double X = sc.nextDouble();

		for (int i = 0; X >= 0; i++) {

			if (X >= 0 && X <= 25.00) {
				System.out.println("Intervalo [0,25]");

			}

			else if (X <= 50) {
				System.out.println("Intervalo (25,50]");
			}

			else if (X >= 75 && X <= 100) {
				System.out.println("Intervalo (75,100]");

			}

			X = sc.nextDouble();
		}

		System.out.println("Fora de intervalo");

		sc.close();
	}

}
