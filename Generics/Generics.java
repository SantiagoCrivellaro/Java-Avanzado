package Generics;

public class Generics <T> {
    private T contenido;

    public void poneralgo(T contenido) {
        this.contenido = contenido;
    }

    public T obteneralgo(){
        return contenido;
    }


        public static void main(String[] args) {

        Generics<String> CajaString = new Generics<String>(); 
        CajaString.poneralgo("Bienvenido!");
        String contenido = CajaString.obteneralgo();

        // El contenido que pasemos, puede ser de cualquier tipo de dato.
        // Nos evitamos el casteo de datos.
        

        Generics<Integer> CajaInt = new Generics<Integer>();
        CajaInt.poneralgo(15);
       Integer numero = CajaInt.obteneralgo();

        System.out.println("El contenido es :" + contenido);
        System.out.println("El contenido es :" + numero);

    }
}