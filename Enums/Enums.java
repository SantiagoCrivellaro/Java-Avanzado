package Enums;

public class Enums {
    // Los enums son palabras claves para representar conjuntos de datos de tipo constante

    // Los dias de la semana, no van a cambiar, entonces :

    enum DiaSemana {
        LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
    }

    public static void main(String[] args) {
        
        DiaSemana semana = DiaSemana.DOMINGO;

        System.out.println(semana); // Domingo

        DiaSemana mejorDia = DiaSemana.SABADO;

        System.out.println("el mejor dia de la semana es :" + mejorDia);

        for(DiaSemana dia : DiaSemana.values()) {
            System.out.println("los dias de la semana son? " + dia);
        }
    }
}
