package PraticaAlgoritimo;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num01 = sc.nextInt();
		int num02 = sc.nextInt();

		if (num01 > num02) {
			System.out.println(num01);

		}

		else {
			System.out.println(num02);
		}

		sc.close();
	}

}
