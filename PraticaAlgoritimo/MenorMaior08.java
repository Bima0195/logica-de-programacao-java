package PraticaAlgoritimo;

import java.util.Scanner;

public class MenorMaior08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int maior = num, menor = num;

		for (int i = 1; i <= 9; i++) {
			num = sc.nextInt();

			if (num > maior) {
				maior = num;

			} else if (num < menor) {
				menor = num;

			}
		}

		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);

		sc.close();

	}

}
