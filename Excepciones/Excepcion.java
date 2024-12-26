package Excepciones;

public class Excepcion {
    public int factorial (int num) {
        if (num < 0 ) {
            throw new ArithmeticException("No se puede calcular el factorial");
        }

        // Usamos nuestra Excepcion
        if ( num > 12) {
            throw new IntegerOverExcepcion("No se puede calcular un factorial tan grande");
        }
        int fact = 1;
        for (int i = 2; i <= num; i++)  {

            fact = fact * i;
        } 
        return fact;

        // Si queremos darle un toque nuestro, en lugar de lanzar una RuntimeException
        // Podemos crear nuestra propia excepcion
  }
}
