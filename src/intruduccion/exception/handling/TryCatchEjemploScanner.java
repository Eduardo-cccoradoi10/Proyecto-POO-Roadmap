package intruduccion.exception.handling;

import java.util.Scanner;

public class TryCatchEjemploScanner {
	
	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        try {

	            System.out.print("Ingrese el numerador: ");
	            int numerador = Integer.parseInt(scanner.nextLine());

	            System.out.print("Ingrese el denominador: ");
	            int denominador = Integer.parseInt(scanner.nextLine());

	            int resultado = numerador / denominador;

	            System.out.println("Resultado: " + resultado);

	        } 
	        catch (ArithmeticException e) {

	            System.out.println("Error matemático: no se puede dividir entre cero.");
	            System.out.println("Detalle técnico: " + e.getMessage());

	        } 
	        catch (NumberFormatException e) {//atrapa formato invalido (letras)

	            System.out.println("Error de formato: debe ingresar números válidos.");
	            System.out.println("Detalle técnico: " + e.getMessage());

	        } 
	        finally {

	            System.out.println("El programa ha terminado.");
	            scanner.close();

	        }
	    }
}