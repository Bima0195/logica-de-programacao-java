package Uri;

import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora01 = sc.nextInt();
		int hora02 = sc.nextInt();
		
		int x = 0;
		
		if (hora01 > hora02) {
			x = 24 - hora01 + hora02;
			//System.out.printf("O JOGO DUROU %d HORA(S)", x);
			
		}
		
		else  {
			x = hora02 - hora01;
			//System.out.printf("O JOGO DUROU %d HORA(S)", x);
			
		}
		
		
			System.out.printf("O JOGO DUROU %d HORA(S)%n", x);
		
		
		
		sc.close();
	}

}
