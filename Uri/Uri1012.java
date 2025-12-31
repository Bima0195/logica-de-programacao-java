package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		TRIANGULO = A * C / 2.0;
		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
		
		CIRCULO = 3.14159 * Math.pow(C, 2);
		System.out.printf("CIRCULO: %.3f%n", CIRCULO);
		
		TRAPEZIO = (A + B) * C / 2;
		System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
		
		QUADRADO = Math.pow(B, 2);
		System.out.printf("QUADRADO: %.3f%n", QUADRADO);
		
		RETANGULO = A * B;
		System.out.printf("RETANGULO: %.3f%n", RETANGULO);
		
		sc.next();
		
	}

}
