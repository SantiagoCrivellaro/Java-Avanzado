package Patrones_De_Diseño.Singleton;

public class Configuracion {
    private String baseurl;
    private int timeout;
    
    private static Configuracion instance;

    private Configuracion() {
        this.baseurl = "https://github.com/SantiagoCrivellaro";
        this.timeout = 5000; // En milisegundos 
        }

        public static Configuracion  getInstance() {
            if (instance == null) {
                instance = new Configuracion();
             } 
             
                return instance;
            
        }

        // Metodos para acceder

        public String getUrl() {
            return baseurl;
        }

        public int getTime() {
            return timeout;
        }
    }
