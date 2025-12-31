package Uri;

import java.util.Scanner;

public class Uri1047 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horainicio = sc.nextInt();
		int minutoinicio = sc.nextInt();
		int horafim = sc.nextInt();
		int minutofim = sc.nextInt();

		int inicio = horainicio * 60 + minutoinicio;
		int fim = horafim * 60 + minutofim;

		int duracao;

		if (inicio == fim) {
			duracao = 24 * 60;
		} else if (inicio > fim) {
			duracao = (fim + 1440) - inicio;
		} else {
			duracao = fim - inicio;
		}

		int horas = duracao / 60;
		int minutos = duracao % 60;

		System.out.println("O JOGO DUROU " + horas + " HORAS E " + minutos + " MINUTOS(S)");

		sc.close();
	}

}
