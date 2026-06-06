package intruduccion.passValueOrReference;


public class Main {
//el paso por referencia es simulado en java
    public static void cambiarNumero(int num) {
        num = 100; // intento cambiarlo
    }
    public static void depositar(Cuenta c) {
        c.saldo += 50; // modifico el objeto
    }

    public static void main(String[] args) {
        int numero = 10;

        cambiarNumero(numero);

        System.out.println("Numero: " + numero);
        //objeto
        Cuenta cuenta = new Cuenta(100);

        depositar(cuenta);

        System.out.println("Saldo: " + cuenta.saldo);
    }
    
}