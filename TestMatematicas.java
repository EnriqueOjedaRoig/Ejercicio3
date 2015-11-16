
import java.util.Scanner;

public class TestMatematicas {
	
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce un numero: "); 
		int numero = in.nextInt();
		boolean par = Matematicas.esPar(numero);
		System.out.println("Es "+par); 
		
		boolean divisible3 = Matematicas.esDivisiblePorTres(numero);
		System.out.println("Es divisible por 3?: "+divisible3); 
		
		boolean divisible5 = Matematicas.esDivisiblePorCinco(numero);
		System.out.println("Es divisible por 5?: "+divisible5); 
	}
}

