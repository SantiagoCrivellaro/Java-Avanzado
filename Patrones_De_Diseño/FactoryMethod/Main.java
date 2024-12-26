package Patrones_De_Diseño.FactoryMethod;

public class Main {
    
    public static void main(String[] args) {
        FabricaDePizzas fabricamuzza = new FabricaMuzzarella();
        fabricamuzza.ordenarPizza(); // Preparando Pizza Muzzarella


        FabricaDePizzas fabricaNapo = new FabricaNapolitana();
        fabricaNapo.ordenarPizza(); // Preparando la Pizza napolitana

    }    

}

