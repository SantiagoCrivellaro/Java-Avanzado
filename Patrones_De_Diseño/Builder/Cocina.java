package Patrones_De_Diseño.Builder;

public class Cocina {
    private PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza construirPizza() {
        builder.construirMasa();
        builder.construirSalsa();
        builder.construirRelleno();
        return builder.obtenerPizza();
    }
 }
