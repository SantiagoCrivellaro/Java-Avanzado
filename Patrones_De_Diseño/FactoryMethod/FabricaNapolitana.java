package Patrones_De_Diseño.FactoryMethod;

public class FabricaNapolitana extends FabricaDePizzas {
    public Pizza crearPizza() {
        return new PizzaNapolitana();
    }
}