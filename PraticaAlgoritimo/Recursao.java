package PraticaAlgoritimo;

import java.util.Locale;
import java.util.Scanner;

public class Recursao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int [] vet = new int [N];
		int x = 0;
		
		
		if (N != 1) {
			x = vet[N] - 1;
		}
		System.out.println(x);
		
	
		sc.close();
	}

}
