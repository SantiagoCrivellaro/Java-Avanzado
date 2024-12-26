package Threads;


// Otra manera de crear un hilo
public class ThreadsRunnable implements Runnable {

    // otra manera de crear un hilo.

    // Se usa para casos mas complejos
    @Override
    public void run() {
        System.out.println("Hilo ejecutandose usando Runnable");
    }

}
