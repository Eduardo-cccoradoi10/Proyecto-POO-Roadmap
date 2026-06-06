package intruduccion.bases.arrays;

public class ArrayBasico {

	public static void main(String[] args) {
		int[] numeros = {5, 8, 2, 10, 3};

		System.out.println("Suma: " + ArrayOperaciones.suma(numeros));
		System.out.println("Promedio: " + ArrayOperaciones.promedio(numeros));
		System.out.println("Mayor: " + ArrayOperaciones.maximo(numeros));
		System.out.println("Menor: " + ArrayOperaciones.minimo(numeros));

	}
	
	
	
}