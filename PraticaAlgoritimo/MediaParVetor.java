package PraticaAlgoritimo;

import java.util.Locale;
import java.util.Scanner;

public class MediaParVetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vet = new double[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}

		double soma = 0, media = 0;
		for (int i = 0; i < N; i++) {
			
			
			//soma = soma + vet[i];
			//media = soma / N;

		}

		System.out.println(media);

		for (int i = 0; i < N; i++) {
			if (media > vet[i]) {
				System.out.println(vet[i]);
			}
		}

		sc.close();
	}

}
