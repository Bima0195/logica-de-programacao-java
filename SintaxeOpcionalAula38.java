import java.util.Scanner;

public class SintaxeOpcionalAula38 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int minuto = sc.nextInt();
		
		double conta = 50.00;
		
		if (minuto > 100) {
			conta += (minuto - 100) * 2;
			System.out.printf("Valor da conta: R$%.2f%n", conta);
		}
		
		else {
			System.out.printf("Valor da conta: R$%.2f%n", conta);
		}
		

	
		
		
		sc.close();
	}

}
