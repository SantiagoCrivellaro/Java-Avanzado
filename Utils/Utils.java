package Utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.UUID;

public class Utils {

    public static void main(String[] args) {
        
        // Generador de numeros ramdon

        Random ramdom = new Random();

        int numeroRamdom = ramdom.nextInt(99);

        System.out.println(numeroRamdom);
       
        // Generar identificadores universales

        UUID identificador =  UUID.randomUUID();
        System.out.println(identificador);

        // Operaciones Matematicas :

        // Raiz
        double raiz = Math.sqrt(16);

        System.out.println(raiz);

        // Potencia
        double potencia = Math.pow(2,3); // 2 elevado a la 3
        System.out.println(potencia);

        // Fechas :

        // Fecha actual 
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);

        // Hora Actual
        LocalTime horaActual = LocalTime.now();
        System.out.println(horaActual);
    }
}
