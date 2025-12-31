package Uri;

import java.util.Scanner;

public class Uri1018 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, resto, n100, n50, n20, n10, n5, n2, n1;
		
		N = sc.nextInt();
		
		n100 = N / 100;
		System.out.printf("%d Nota(s) de R$ 100,00 %n", n100);
		resto = N % 100;
		
		n50 = resto / 50;
		System.out.printf("%d Nota(s) de R$ 50,00 %n", n50);
		resto = resto % 50;
		
		n20 = resto / 20;
		System.out.printf("%d Nota(s) de R$ 20,00 %n", n20);
		resto = resto % 20;
		
		n10 = resto / 10;
		System.out.printf("%d Nota(s) de R$ 10,00 %n", n10);
		resto = resto % 10;
		
		n5 = resto / 5;
		System.out.printf("%d Nota(s) de R$ 5,00 %n", n5);
		resto = resto % 5;
		
		n2 = resto /2;
		System.out.printf("%d Nota(s) de R$ 2,00 %n", n2);
		resto = resto % 2;
		
		
		n1 = resto / 1;
		System.out.printf("%d Nota(s) de R$ 1,00 %n",  n1);
	
		
		sc.close();
	}

}
