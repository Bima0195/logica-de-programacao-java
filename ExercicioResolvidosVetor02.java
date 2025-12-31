import java.util.Scanner;

public class ExercicioResolvidosVetor02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] vet = new int[N];
		
		for(int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
		}
		
		int soma=0; 
		double media=0;
		for(int i=0; i<N; i++) {
			System.out.println(vet[i]);
			soma = soma + vet[i];
			media = (double) soma / N;
			
		}
		
		System.out.println("Soma do Veto: "+ soma);
		System.out.printf("Média do vetor: %.2f%n", media);
		
		sc.close();
	}

}
