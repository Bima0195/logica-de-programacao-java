package Uri;

import java.util.Scanner;


public class Uri1115 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		

		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("Primeiro");
			}

			else if (X > 0 && Y < 0) {
				System.out.println("Quarto");

			} else if (X < 0 && Y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Segundo");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}

		sc.close();
	}

}
