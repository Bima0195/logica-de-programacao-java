package PraticaAlgoritimo;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num01 = sc.nextInt();
		int num02 = sc.nextInt();
		int num03 = sc.nextInt();

		if (num01 < num02 && num01 < num03) {
			System.out.println(num01);

		}

		else if (num02 < num03) {
			System.out.println(num02);
		}

		else {
			System.out.println(num03);
		}

		sc.close();
	}

}
