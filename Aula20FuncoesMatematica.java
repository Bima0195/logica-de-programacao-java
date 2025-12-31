
import java.util.Scanner;
import java.util.Locale;

public class Aula20FuncoesMatematica {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	      double largura, comprimento, area, precoMetro, valorTerreno;
	      
	      
	      System.out.println("Informe as medidas do terreno");
	      
	      System.out.printf("largura: ");
	      largura = sc.nextDouble();
	      System.out.printf("comprimento: ");
	      comprimento = sc.nextDouble();
	      
	      //Calculo da area.
	      area = largura * comprimento;
	      System.out.printf("Area do terreno é: %.2fm²%n", area);
	      
	      System.out.print("Informe o preço do m²: ");
	      precoMetro = sc.nextDouble();
	      
	    //Calculo do valor do terreno
	      valorTerreno = precoMetro * area;
	      System.out.printf("O valor do terrerro é de: R$%.2f", valorTerreno);
	     
	     
	   
	     
	      sc.close();
	      
	      
	      
	      	
	      
	      
	      
	      /*   
	      System.out.print("Digite o valor de a: ");
	      a = sc.nextDouble();
	      
	      System.out.print("Digite o valor de b: ");
	      b = sc.nextDouble();
	      
	      System.out.print("Digite o valor de c: ");
	      c = sc.nextDouble();
	      
	      delta = Math.pow(b, 2.0) - 4*a*c;
	      System.out.println("Delta é = " + delta);
	      
	      
	      x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
	      System.out.println(x1);
	      
	      x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
	      System.out.println(x2);*/
	      
	      
	      
	      
	      
	      
	      
	   /* x = sc.nextDouble();
	      y = sc.nextDouble();
	      z = sc.nextDouble();
	      
	      A = Math.sqrt(x);
	      B = Math.sqrt(y);
	      C = Math.sqrt(z);
	      
	      System.out.printf("Raiz de %.1f é: %.1f%n", x, A);
	      System.out.printf("Raiz de %.1f é: %.1f%n", y, B);
	      System.out.printf("Raiz de %.1f é: %.1f%n", z, C);
	      
	      A = Math.pow(x, y);
	      B = Math.pow(y, z);
	      C = Math.pow(z, x);
	      
	      System.out.printf("O valor de %.1f elevado a %.1f é: %.1f%n", x, y, A);
	      System.out.printf("O valor de %.1f elevado a %.1f é: %.1f%n", y, z, B);
	      System.out.printf("O valor de %.1f elevado a %.1f é: %.1f%n", z, x, C);
	      
	      A = Math.abs(x);
	      B = Math.abs(y);
	      C = Math.abs(z);
	      
	      System.out.println("Valor absoluto de " + x + " = " + A);
	      System.out.println("Valor absoluto de " + y + " = " + B);
	      System.out.println("Valor absoluto de " + z + " = " + C);
	      
	      
		sc.close();*/
	}

}
