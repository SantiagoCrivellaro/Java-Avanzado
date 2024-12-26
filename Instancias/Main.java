package Instancias;

import java.util.PropertyResourceBundle;

 class Animal {}

 class Perro extends Animal {}


public class Main {
    
    public static void main(String[] args) {
        Perro miAnimal = new Perro();

        // Comprobar si "miAnimal" es un objeto de "Perro"
        System.out.println(miAnimal instanceof Perro);

        // Comprobar si "miAnimal" es un objeto de "Animal"

        System.out.println(miAnimal instanceof Animal);

    


    }
}
