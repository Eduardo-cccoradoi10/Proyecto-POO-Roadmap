package intruduccion.bases.arrays;

import java.util.Arrays;

public class ArraysEjemplo {

    public static void main(String[] args) {

        // 1. Declaración de arreglos
        int[] numbers;
        String[] names;
        double[] prices;

        // 2. Instanciación de arreglos
        numbers = new int[5];
        names = new String[3];

        // 3. Arreglo literal (inicialización directa)
        int[] literalArray = { 10, 20, 30, 40, 50 };

        // 4. Acceso a elementos por índice
        numbers[0] = 100;
        numbers[1] = 200;

        System.out.println("numbers[0] = " + numbers[0]);
        System.out.println("numbers[1] = " + numbers[1]);

        // 5. Longitud del arreglo
        System.out.println("Longitud de literalArray = " + literalArray.length);

        // 6. Recorrido con ciclo for tradicional
        System.out.println("\nRecorriendo con for:");
        for (int i = 0; i < literalArray.length; i++) {
            System.out.println("Índice " + i + ": " + literalArray[i]);
        }

        // 7. Recorrido con for-each
        System.out.println("\nRecorriendo con for-each:");
        for (int value : literalArray) {
            System.out.println(value);
        }

        // 8. Arreglo multidimensional (matriz)
        int[][] matrix = new int[2][3];
        matrix[0][1] = 99;

        System.out.println("\nMatriz:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 9. Insertar un elemento manualmente (desplazando elementos)
        int[] insertArray = new int[6];
        Arrays.fill(insertArray, -1); // llenar con -1 para ver cambios

        int insertIndex = 2;
        int newValue = 123;

        // Desplazar elementos hacia la derecha
        for (int i = insertArray.length - 1; i > insertIndex; i--) {
            insertArray[i] = insertArray[i - 1];
        }
        insertArray[insertIndex] = newValue;

        System.out.println("\nDespués de insertar: " + Arrays.toString(insertArray));

        // 10. Eliminar un elemento manualmente (desplazando elementos)
        int[] removeArray = { 1, 2, 3, 4, 5, 6 };
        int removeIndex = 3;

        for (int i = removeIndex; i < removeArray.length - 1; i++) {
            removeArray[i] = removeArray[i + 1];
        }

        System.out.println("Después de eliminar: " + Arrays.toString(removeArray));

        // 11. Encontrar mínimo y máximo
        int[] values = { 5, 9, 2, 7, 1, 8 };

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int v : values) {
            if (v < min) min = v;
            if (v > max) max = v;
        }

        System.out.println("\nMínimo = " + min);
        System.out.println("Máximo = " + max);

        // 12. Arrays.copyOf
        int[] copy1 = Arrays.copyOf(values, values.length);
        System.out.println("\nCopia con copyOf: " + Arrays.toString(copy1));

        // 13. Arrays.copyOfRange
        int[] copy2 = Arrays.copyOfRange(values, 1, 4);
        System.out.println("Copia con copyOfRange (1 a 3): " + Arrays.toString(copy2));

        // 14. Arrays.toString
        System.out.println("values como String: " + Arrays.toString(values));

        // 15. Arrays.sort
        Arrays.sort(values);
        System.out.println("values ordenado: " + Arrays.toString(values));

        // 16. Arrays.binarySearch
        int index = Arrays.binarySearch(values, 7);
        System.out.println("Índice del 7 = " + index);

        // 17. Arrays.equals
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {3, 2, 1};

        System.out.println("\na es igual a b? " + Arrays.equals(a, b));
        System.out.println("a es igual a c? " + Arrays.equals(a, c));
    }
}
