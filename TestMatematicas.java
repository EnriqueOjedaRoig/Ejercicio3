
import java.util.Scanner;

public class TestMatematicas {
	
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce un numero: "); 
		int numero = in.nextInt();
		boolean par = Matematicas.esPar(numero);
		System.out.println("Es "+par); 
	}
}

