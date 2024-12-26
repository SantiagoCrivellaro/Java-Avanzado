package Patrones_De_Diseño.Builder;

public class Main {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();

        PizzaBuilder hawaianBuilder = new PizzaHawaianaBuilder();

        cocina.setBuilder(hawaianBuilder);
        Pizza pizza = cocina.construirPizza();

        System.out.println(pizza);
    }
}
