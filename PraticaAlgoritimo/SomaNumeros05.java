package PraticaAlgoritimo;

import java.util.Scanner;

public class SomaNumeros05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int soma = 0;

		for (int i = 1; i <= 10; i++) {
			int num = sc.nextInt();

			soma = soma + num;
		}

		System.out.println("Soma total: " + soma);

		sc.close();
	}

}
