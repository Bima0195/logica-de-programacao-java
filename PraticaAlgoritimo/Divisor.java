package PraticaAlgoritimo;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int div = 0;

		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}

		}

		sc.close();

	}
}
