public class TestMatematicas {
	
	public static void main (String args[]) {
		
		int numero = 18;
		
		boolean resultadoUno = Matematicas.esPar(numero);
		System.out.println("El nº " + numero + " ¿Es par? " + resultadoUno); 
		
		boolean resultadoDos = Matematicas.esDivisiblePorTres(numero);
		System.out.println("El nº " + numero + " ¿es divisible por tres? " + resultadoDos);
		
		boolean resultadoTres = Matematicas.esDivisiblePorCinco(numero);
		System.out.println("El nº " + numero + " ¿es divisible por cinco? " + resultadoTres);
		
	}
}

