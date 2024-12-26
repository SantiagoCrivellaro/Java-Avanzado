package Threads;

// al extender, se convierte en un hilo
public class Threads extends Thread {

    
    public void run () {
        System.out.println("Hilo ejecutandose en clase Threads");
    }
    // Estados de un hilo - Nuevo - Ejecutando - parado - muerto


    // Si usamos la Palabra synchronized podemos indicar que solo 1 hilo pueda ejecutar un metodo o un bloque.

     public synchronized void Incrementar() {
        // Codigo que se ejecuta solo x un hilo
    }



    }
