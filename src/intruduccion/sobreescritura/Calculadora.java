package intruduccion.sobreescritura;

class Calculadora {

    // suma de 2 enteros
    int sumar(int a, int b) {
        return a + b;
    }

    // suma de 3 enteros
    int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // suma de doubles
    double sumar(double a, double b) {
        return a + b;
    }
}
