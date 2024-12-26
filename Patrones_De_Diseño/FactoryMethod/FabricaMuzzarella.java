package Patrones_De_Diseño.FactoryMethod;

public class FabricaMuzzarella extends FabricaDePizzas {
    public Pizza crearPizza() {
        return new PizzaMuzzarella();
    }
}