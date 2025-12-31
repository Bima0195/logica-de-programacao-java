package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1048 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double reajuste = 0, percentual =0, novosalario =0;
		
		
		
		
		if (salario <= 400.00) {
			percentual = 15;
		}
		
		else if (salario <= 800.00) {
			percentual = 12;
		}
		
		else if (salario <= 1200.00) {
			percentual = 10;
			
		}
		
		else if (salario <= 2000.00) {
			percentual = 7;
			
		}
		
		else {
			percentual = 4;
		}
		
		reajuste = salario * percentual / 100;
		novosalario = reajuste + salario;
		
			System.out.printf("Novo salario: %.2f%n", novosalario);
			System.out.printf("Reajuste ganho: %.2f%n" 	, reajuste);
			System.out.printf("Em percentual: %.0f%% \n", percentual);
						
		
		sc.close();
	}

}
