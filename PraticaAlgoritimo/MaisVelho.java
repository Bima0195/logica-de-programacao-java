package PraticaAlgoritimo;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] idade = new int[N];
		String[] nome = new String[N];
		
		for(int i=0; i<N; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();			
		}
		
		int maior = 0;
		String velho = null;
		for(int i=0; i<N; i++) {
			if(maior < idade[i]) {	
				maior = idade[i];
				velho = nome[i];
			}
		}
		
		System.out.println("Pessoa mais velha:" + velho);
		
		
		
		sc.close();
	}

}
