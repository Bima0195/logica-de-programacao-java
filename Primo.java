import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int primo = 0;

    for (int i = 1; i <= x; i++) {
        if (x % i == 0) {
            primo = primo + 1;
        }
    }

    if (primo == 2) {
        System.out.println("primo");
    } else {
        System.out.println("não primo");
    }

    sc.close();
    }
}
		
		


	