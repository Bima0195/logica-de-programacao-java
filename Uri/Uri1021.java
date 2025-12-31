package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1021 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		
		
		double N, valor, nota, resto;
		int inte;
		
		
		N = sc.nextDouble();
		
		System.out.println("Notas");
		
		valor = 100.00;
		nota = N / valor;
		inte = (int) nota;
		System.out.println(inte + " nota(s) de R$ 100.00");
		resto = N % valor;
		
		
		valor = 50.00;
		nota = resto / valor;
		inte = (int) nota;
		System.out.println(inte + " nota(s) de R$ 50.00");
		resto = N % valor;
		
		
		valor = 20.00;
		nota = resto / valor;
		inte = (int) nota;
		System.out.println(inte + " nota(s) de R$ 20.00");
		resto = N % valor;
		
		
		valor = 10.00;
		nota = resto / valor;
		inte = (int) nota;
		System.out.println(inte + " nota(s) de R$ 10.00");
		resto = N % valor;
		
		
		valor = 5.00;
		nota = resto / valor;
		inte = (int) nota;
		System.out.println(inte + " nota(s) de R$ 5.00");
		resto = N % valor;
		
		
		valor = 2.00;
		nota = resto / valor;
		inte = (int) nota;
		System.out.println(inte + " nota(s) de R$ 2.00");
		resto = N % valor;
		
		System.out.println(" ");
		System.out.println("Moedas");
		
		valor = 1.00;
		nota = resto % valor;
		System.out.println(nota);
		inte = (int) nota;
		System.out.println(inte + " moeda(s) de R$ 1.00");
		resto = resto % valor;
		System.out.println(resto);
		
		valor = 0.50;
		nota = resto / valor;
		inte = (int) nota;
		System.out.println(inte + " moeda(s) de R$ 0.50");
		resto = resto % valor;
		
		
		valor = 0.25;
		nota = resto / valor;
		inte = (int) nota;
		System.out.println(inte + " moeda(s) de R$ 0.25");
		resto = resto % valor;
			
		
		valor = 0.10;
		nota = resto / valor;
		inte = (int) nota;
		System.out.println(inte + " moeda(s) de R$ 0.10");
		resto = resto % valor;
		
		
		valor = 0.05;
		nota = resto / valor;
		inte = (int) nota;
		System.out.println(inte + " moeda(s) de R$ 0.05");
		resto = resto % valor;
			
		
		valor = 0.01;
		nota = resto / valor;
		inte = (int) nota;
		System.out.println(inte + " moeda(s) de R$ 0.01");
		resto = resto % valor;
		
		sc.close();
	}

}
