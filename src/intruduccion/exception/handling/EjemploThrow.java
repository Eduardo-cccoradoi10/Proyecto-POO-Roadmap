package intruduccion.exception.handling;

import java.util.Scanner;

public class EjemploThrow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese su edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            verificarEdad(edad);

            System.out.println("Edad válida: " + edad);

        } catch (NumberFormatException e) {

            System.out.println("Debe ingresar un número válido.");

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        }  finally {

            scanner.close();
            System.out.println("Programa finalizado.");

        }
    }

    public static void verificarEdad(int edad) {

        if (edad < 0) {

            throw new IllegalArgumentException("La edad no puede ser negativa.");

        }

    }
}