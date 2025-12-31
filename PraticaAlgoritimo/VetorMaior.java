package PraticaAlgoritimo;

import java.util.Locale;
import java.util.Scanner;

public class VetorMaior {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		double[] vet = new double[N];
		
		for(int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();			
		}
		
		int pos =0;
		double maior =vet[0];
		for(int i=0; i<N; i++) {
			if(vet[i] > maior) {
				maior =vet[i];
				pos = i;
			}
			
		}
		System.out.println("Maior numero: " + maior);
		System.out.println("Posição: " + pos);
		
		
		System.out.println("Numeros Pares: ");
		double par = 0, cont = 0;
		for(int i=0; i<N; i++) {
			if(vet[i]%2==0) {
				System.out.print(" " + vet[i] + " ");
				cont++;			
				
			}
			
		}
		
		System.out.println(" ");
		System.out.println("Quantidade: " + cont);


		sc.close();
	}

}
