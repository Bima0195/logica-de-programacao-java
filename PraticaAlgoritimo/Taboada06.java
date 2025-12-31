package PraticaAlgoritimo;

import java.util.Scanner;

public class Taboada06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int produto = num * i;
			
			System.out.println(i + " x " + num + ": " + produto);
			
		}

		
		sc.close();
	}

}
