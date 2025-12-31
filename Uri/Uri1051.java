package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1051 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if (salario >= 0.0 && salario <= 2000.0) {
			System.out.println("Isento");
		}

		else 
			if (salario <= 4500.00){
			
		}
			
		
		sc.close();
	}
}
