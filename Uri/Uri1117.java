package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1117 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double nota01 = sc.nextDouble();
		double media = 0;
		
		while (nota01 < 0 || nota01 > 10) {
			System.out.println("nota invalida");
			
			nota01 = sc.nextInt();
						
		}
		
		double nota02 = sc.nextDouble();
		while (nota02 < 0 && nota02 > 10) {
			System.out.println("nota invalida");
			
			nota02 = sc.nextInt();			
		}
		
	
		
		media = (nota01 + nota02) / 2;
		System.out.printf("media = %.2f%n", media);

		
			
			
			
			sc.close();
		}
	
	}
