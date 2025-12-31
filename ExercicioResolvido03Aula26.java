import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido03Aula26 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome01, nome02;
		int x , y;
		double media;
		
		System.out.print("Informe o primero nome: ");
		nome01 = sc.next();
		sc.nextLine();
		System.out.print("Infome a idade: ");
		x = sc.nextInt();
		sc.nextLine();
		System.out.print("Informe o segundo nome: ");
		nome02 = sc.next();
		System.out.print("Informe a idade: ");
		y = sc.nextInt();
		
		media = (double) (x + y) / 2;
		System.out.printf("A idade média de %s e %s e de %.1f anos ", nome01, nome02,media);
		
		sc.close();

	}

}
