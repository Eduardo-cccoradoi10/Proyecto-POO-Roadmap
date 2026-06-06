package intruduccion.sobreescritura;


public class Main {
    public static void main(String[] args) {

        // Overloading
        Calculadora calc = new Calculadora();
        System.out.println(calc.sumar(2, 3));        // 5
        System.out.println(calc.sumar(2, 3, 4));     // 9
        System.out.println(calc.sumar(2.5, 3.5));    // 6.0

        // Overriding
        Animal miAnimal = new Animal();
        miAnimal.hacerSonido();

        Perro miPerro = new Perro();
        miPerro.hacerSonido();
    }
}
