package Patrones_De_Diseño.Builder;
import Patrones_De_Diseño.Builder.Pizza;

public interface PizzaBuilder {
    
    void construirMasa();
    void construirSalsa();
    void construirRelleno();
    Pizza obtenerPizza();
}


