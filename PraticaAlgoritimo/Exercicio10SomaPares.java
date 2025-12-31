package PraticaAlgoritimo;

import java.util.Scanner;

public class Exercicio10SomaPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N];
		
		
		for (int i= 0 ;i<N; i++) {
			vet[i] = sc.nextInt();
		
		}
		int soma = 0, cont = 0;;
		for(int i=0; i<N ;i++) {
			if (vet[i] %  2 == 0) {
				soma = soma + vet[i];
				cont = cont + 1; 
			}
			
		
			
		}
		
		System.out.println("Media dos numeros pares: " + soma / cont);


		sc.close();
	}

}
