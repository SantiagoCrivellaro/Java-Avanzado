package Patrones_De_Diseño.Builder;

public class PizzaHawaianaBuilder implements PizzaBuilder {
    private String masa;
    private String salsa;
    private String relleno;

    @Override
    public void construirMasa() {
        masa = "Suave";
    }

    @Override
    public void construirSalsa() {
        salsa = "dulce";
    }

    @Override
    public void construirRelleno() {
        relleno = "jamon y queso";
    }

    @Override
    public Pizza obtenerPizza() {
        return new Pizza(masa,salsa,relleno);
    }

}