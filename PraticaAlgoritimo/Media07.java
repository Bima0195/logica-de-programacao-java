package PraticaAlgoritimo;

import java.util.Locale;
import java.util.Scanner;

public class Media07 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0.0;
		
		for(int i = 1; i<=10.0; i++) {
			double num = sc.nextDouble();
			soma = soma + num;
			
		}
		
		System.out.printf("Média: %.2f%n", soma/10.0);
		
		sc.close();
	}

}
