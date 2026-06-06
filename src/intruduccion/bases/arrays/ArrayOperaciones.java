package intruduccion.bases.arrays;

public class ArrayOperaciones {
	
	// Sumar todos los elementos
    public static int suma(int[] arr) {
        int suma = 0;

        for (int num : arr) {
            suma += num;
        }

        return suma;
    }

    // Promedio
    public static double promedio(int[] arr) {
        return (double) suma(arr) / arr.length;
    }

    // Buscar el número mayor
    public static int maximo(int[] arr) {
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    // Buscar el número menor
    public static int minimo(int[] arr) {
        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    // Buscar si existe un número
    public static boolean contiene(int[] arr, int valor) {

        for (int num : arr) {
            if (num == valor) {
                return true;
            }
        }

        return false;
    }


}