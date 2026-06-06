package intruduccion.bases.arrays;

public class Main {
	    public static void main(String[] args) {

	        // Creamos un array de estudiantes
	        Estudiante[] estudiantes = new Estudiante[3];

	        // Asignamos valores
	        estudiantes[0] = new Estudiante("Ana", 85);
	        estudiantes[1] = new Estudiante("Luis", 90);
	        estudiantes[2] = new Estudiante("Carlos", 70);

	        // Recorremos el array
	        for (int i = 0; i < estudiantes.length; i++) {
	            estudiantes[i].mostrarInfo();
	        }

	        // Ejemplo extra: calcular promedio
	        double suma = 0;
	        for (Estudiante e : estudiantes) {
	            suma += e.nota;
	        }

	        double promedio = suma / estudiantes.length;
	        System.out.println("Promedio: " + promedio);
	    }
	}