package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int item01 = sc.nextInt();
		int item02 = sc.nextInt();

		double x = 0;

		switch (item01) {

		case 1:
			double cachorroquente = 4.00;
			x = cachorroquente * item02;
			break;

		case 2:
			double xsalada = 4.50;
			x = xsalada * item02;
			break;

		case 3:
			double xbacon = 5.00;
			x = xbacon * item02;
			break;
			
		case 4:
			double torradasimples = 2.00;
			x = torradasimples * item02;
			break;

		case 5:
			double refrigerante = 1.50;
			x = refrigerante * item02;
			break;

		default:
			
			System.out.println("valor invalido");
			break;

		}

		System.out.printf("TOTAL: R$%.2f%n", x);
		sc.close();
	}

}
