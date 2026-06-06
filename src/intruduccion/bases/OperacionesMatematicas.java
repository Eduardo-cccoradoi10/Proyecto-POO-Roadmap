package intruduccion.bases;

public class OperacionesMatematicas {

	public static void main(String[] args) {
		System.out.println("Suma: " + FuncionesMatematicas.suma(5, 3));
        System.out.println("Potencia: " + FuncionesMatematicas.potencia(2, 4));
        System.out.println("Raíz: " + FuncionesMatematicas.raizCuadrada(16));
        System.out.println("Seno: " + FuncionesMatematicas.seno(Math.PI / 2));
        System.out.println("Log base 10: " + FuncionesMatematicas.logaritmoBase10(100));
	}


	public static class FuncionesMatematicas {

	    // Operaciones básicas
	    public static double suma(double a, double b) {
	        return a + b;
	    }

	    public static double resta(double a, double b) {
	        return a - b;
	    }

	    public static double multiplicacion(double a, double b) {
	        return a * b;
	    }

	    public static double division(double a, double b) {
	        if (b == 0) {
	            throw new ArithmeticException("No se puede dividir entre cero");
	        }
	        return a / b;
	    }

	    // Potencias y raíces
	    public static double potencia(double base, double exponente) {
	        return Math.pow(base, exponente);
	    }

	    public static double raizCuadrada(double numero) {
	        return Math.sqrt(numero);
	    }

	    public static double raizCubica(double numero) {
	        return Math.cbrt(numero);
	    }

	    // Valor absoluto
	    public static double valorAbsoluto(double numero) {
	        return Math.abs(numero);
	    }

	    // Trigonometría (usa radianes)
	    public static double seno(double angulo) {
	        return Math.sin(angulo);
	    }

	    public static double coseno(double angulo) {
	        return Math.cos(angulo);
	    }

	    public static double tangente(double angulo) {
	        return Math.tan(angulo);
	    }

	    // Logaritmos
	    public static double logaritmoNatural(double numero) {
	        return Math.log(numero);
	    }

	    public static double logaritmoBase10(double numero) {
	        return Math.log10(numero);
	    }

	    // Redondeo
	    public static double redondear(double numero) {
	        return Math.round(numero);
	    }

	    public static double piso(double numero) {
	        return Math.floor(numero);
	    }

	    public static double techo(double numero) {
	        return Math.ceil(numero);
	    }

	    // Número aleatorio
	    public static double numeroAleatorio() {
	        return Math.random();
	    }
	}
}