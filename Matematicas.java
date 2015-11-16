
public class Matematicas{
	
	public static boolean esPar(int numero){
	
		boolean cierto = false;
		
		if(numero%2 == 0){
			cierto = true;
		}
		
		return cierto;
	}

	public static boolean esDivisiblePorTres(int numero){
	
		boolean cierto = false;
		
		if(numero%3 == 0){
			cierto = true;
		}
		
		return cierto;
	}
	
	public static boolean esDivisiblePorCinco(int numero){
	
		boolean cierto = false;
		
		if(numero%5 == 0){
			cierto = true;
		}
		
		return cierto;
	}
	
}
