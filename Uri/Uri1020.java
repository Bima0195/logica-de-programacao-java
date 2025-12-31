package Uri;

	import java.util.Scanner;
	
	public class Uri1020 {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int N, resultado , ano = 365, dias = 30, resto;
			
			N = sc.nextInt();
			
			resultado = N / ano;
			System.out.println(resultado + " ano(s)");
			resto = N % ano;
			
			resultado = resto / dias;
			System.out.println(resultado + " mes(s)");
			
			
			resto = resto % dias;
			System.out.println(resto + " dias(s)");
			
			
			sc.close();
		}
	
	}
	
	
	
	//Resolução do professor
	
	/*import java.util.Scanner;

	//nao esqueca de mudar o nome da classe para Main
	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int N, anos, meses, dias, resto;
			
			N = sc.nextInt();
			
			anos = N / 365;
			resto = N % 365;
			meses = resto / 30;
			dias = resto % 30;
			
			System.out.println(anos + " ano(s)");
			System.out.println(meses + " mes(es)");
			System.out.println(dias + " dia(s)");
			
			sc.close();
		}
	}*/
