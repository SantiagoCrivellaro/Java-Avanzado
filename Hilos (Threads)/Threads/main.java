package Threads;

public class main {
    public static void main(String[] args) {

        Threads proceso = new Threads();

        // Esto ejecuta el hilo de run()
        proceso.start();

        
        
       Thread proceso2 = new  Thread(new ThreadsRunnable());
       proceso2.start();


    }
}
