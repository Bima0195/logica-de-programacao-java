package Uri;

import java.util.Scanner;
import java.util.Locale;

public class Uri1005 {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double MEDIA;
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		MEDIA = (A * 3.5 + B * 7.5) / 11.0;
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		
	
		
	}

}
