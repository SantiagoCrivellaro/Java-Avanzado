package Patrones_De_Diseño;

import java.lang.module.Configuration;

import Patrones_De_Diseño.Singleton.Configuracion;

public class main {
    public static void main(String[] args) {
        
    Configuracion config1= Configuracion.getInstance();

    System.out.println("la url es" + config1.getUrl());
    System.out.println("el time out es : " + config1.getTime());

    Configuracion config2 = Configuracion.getInstance();
    
    System.out.println("La url de otra parte es :" + config1.getUrl()); // Siempre devuelve la misma url
    
    System.out.println("Son la misma instancia?" + (config1==config2)); // True
   
    }
}
