package Uri;

import java.util.Scanner;


public class Uri1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h, m , s;
		int N = sc.nextInt();
		
		h = (int) N / 3600;
		m =  N % 3600 / 60;
		s = N % 60;
		
		
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		System.out.printf("%d:%d:%d", h, m, s);
		
	
	
		
		sc.close();

	}

}
