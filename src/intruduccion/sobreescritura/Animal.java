package intruduccion.sobreescritura;

class Animal {

    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {

    @Override
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}
