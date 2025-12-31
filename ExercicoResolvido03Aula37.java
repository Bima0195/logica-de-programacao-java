import java.util.Scanner;

public class ExercicoResolvido03Aula37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A < B && A < C) {
			System.out.printf("MENOR = %d", A);			
		}
		
		else if( B < C) {
			System.out.printf("MENOR = %d", B);
		}
		
		else {
			System.out.printf("MENOR = %d", C);
		}
		

		sc.close();
	}
	
}
