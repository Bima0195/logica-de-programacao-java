	package Uri;
	
	import java.util.Scanner;
	
	public class Uri1049 {
	
		public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
	
			String tipo = sc.next();
			String especie = sc.next();
			String alimentacao = sc.next();
	
	if (tipo.equalsIgnoreCase("Vertebrado")) {
	            
	            if (especie.equalsIgnoreCase("Ave")) {
	                if (alimentacao.equalsIgnoreCase("Carnivoro")) {
	                    System.out.println("Aguia");
	                } else {
	                    System.out.println("Pomba");
	                }
	            } 
	            else if (especie.equalsIgnoreCase("Mamifero")) {
	                if (alimentacao.equalsIgnoreCase("Onivoro")) {
	                    System.out.println("Homem");
	                } else {
	                    System.out.println("Vaca");
	                }
	            }
	
	        } else if (tipo.equalsIgnoreCase("Invertebrado")) {
	            
	            if (especie.equalsIgnoreCase("Inseto")) {
	                if (alimentacao.equalsIgnoreCase("Hematofago")) {
	                    System.out.println("Pulga");
	                } else {
	                    System.out.println("Lagarta");
	                }
	            } 
	            else if (especie.equalsIgnoreCase("Anelideo")) {
	                if (alimentacao.equalsIgnoreCase("Hematofago")) {
	                    System.out.println("Sanguessuga");
	                } else {
	                    System.out.println("Minhoca");
	                }
	            }
	        }
	
	        sc.close();
	    }
	}
