package Uri;

import java.util.Scanner;

public class Uri1159 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int soma = 0;
		
		while (X != 0) {
			
			if (X % 2 == 0) {
				soma = X + (X + 2) + (X + 4) + (X + 6) + (X + 8);
				
			}
			
			 
			else {
				soma = (X + 1) + (X + 3) + (X + 5) + (X + 7) + (X + 9);
				 
			}
			
			System.out.println(soma);
			
			X = sc.nextInt();
		}
		
		
		
		
		sc.close();

	}

}
