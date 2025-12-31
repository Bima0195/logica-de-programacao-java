import java.util.Scanner;
import java.util.Locale;

public class Aula18EntradaDeDados {
	
	public static void main (String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);
		
		System.out.println("Voce digitou: " + x);
		
		String a;
		int y;
		double z;
		
		a = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
	
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(y);
		System.out.println(z);
		
		
		
		
		sc.close(); 
		
	}

}
