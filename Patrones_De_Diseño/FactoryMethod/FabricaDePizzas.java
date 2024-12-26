package Patrones_De_Diseño.FactoryMethod;

public abstract class FabricaDePizzas {
    public abstract Pizza crearPizza(); // Metodo Factory

    public void ordenarPizza() {
        Pizza pizza = crearPizza();
        pizza.Preparar();
    
    }
}
