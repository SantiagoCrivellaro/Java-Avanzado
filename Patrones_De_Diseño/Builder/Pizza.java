package Patrones_De_Diseño.Builder;

public class Pizza {
    private String masa;
    private String salsa;
    private String relleno;

    public Pizza(String masa, String salsa, String relleno) {
        this.masa = masa;
        this.salsa = salsa;
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "Masa :" + masa + "Salsa :" + salsa + "Relleno :" + relleno;
        
    }
}
