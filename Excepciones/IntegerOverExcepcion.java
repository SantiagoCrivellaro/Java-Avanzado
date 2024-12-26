package Excepciones;

// Puede extender de Exception para que sea chequeada
public class IntegerOverExcepcion extends RuntimeException {


    public IntegerOverExcepcion() {

    }   
    
    public IntegerOverExcepcion(String message) {
        super(message);
    }

    public IntegerOverExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public IntegerOverExcepcion(Throwable cause) {
        super(cause);
    }
 
    
}
