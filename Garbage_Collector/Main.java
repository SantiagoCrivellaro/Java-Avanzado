package Garbage_Collector;

public class Main {
    public static void main(String[] args) {

        // El Garbage Collector se ejecuta automaticamente, pero igualmente podemos sugerir usarlo.
        
        String data = new String("Hola");

        data = null; // El objeto "Hola" ya no tiene referencia y puede ser recolectado por el GC
        System.gc(); // Sugerimos que se ejecute el GC
        System.out.println("Fin del programa");
    }
}
