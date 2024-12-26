package Optionals;

import java.util.Optional;

import javax.sound.sampled.SourceDataLine;

public class Optionals {

    public static void main(String[] args) {
        
        // Clases contenedoras que nos permiten manejar valores Nulos
        // Evitando el Error : NullPointedException

        // Creamos Optional con valor no nulo - Es mas usado cuando se cambie a futuro
        // o cuando sea obligatorio que todos los campos sean Optional de manera obligatoria

        Optional<String> nombre = Optional.of("Juan");
         System.out.println(nombre.get()); // Juan



        String nombreRecibido = null; // o puede ser Juan tambien

        // Se lo apropiamos a un Optional
        Optional<String> Nombre = Optional.ofNullable(nombreRecibido);

        // Si el nombre en nombreRecibido es null, imprime desconocido
        // Si el nombre es Juan, imprime "Juan"
        String nombreCompleto = Nombre.orElse("Desconocido");

        System.out.println(nombreCompleto);


        

        // Con condicion :

        Optional<String> condicion = Optional.ofNullable("Juan");
        condicion.ifPresent(n -> System.out.println("Hola," + n));

        // n tiene el valor contenido en el Optional


      
    }
}
