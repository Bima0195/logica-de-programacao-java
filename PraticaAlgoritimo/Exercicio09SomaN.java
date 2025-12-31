package PraticaAlgoritimo;

import java.util.Scanner;

public class Exercicio09SomaN {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma =0;
		
		for(int i=1; i<=N; i++) {
			 soma = soma + i;			
		}
		
		System.out.println(soma);
		
		
		sc.close();
	}

}
