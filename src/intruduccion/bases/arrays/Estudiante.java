package intruduccion.bases.arrays;

class Estudiante {
    String nombre;
    double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " tiene nota: " + nota);
    }
}