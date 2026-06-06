package intruduccion.herencia;

public class Main {

	public static void main(String[] args) {
	ejercicio1();
	}
	
	public static void ejercicio1(){
		
		//Caso de pruba para probar el metodo "mostrar"
		Persona p1 = new Persona("Juan", 20);
		Docente doc1 = new Docente ("Felipe", 21, "Ingeniería");
		Estudiante est1 = new Estudiante("Sofia", 19, 10985);
		
		p1.mostrar();
		doc1.mostrar();
		est1.mostrar();
		
	}
}