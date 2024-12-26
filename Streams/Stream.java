import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.sound.sampled.SourceDataLine;

public class Stream {

    public static void main(String[] args) {
        
    
    List<Integer> numeros = new ArrayList<>();

    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);
    numeros.add(6);
    numeros.add(7);
    numeros.add(8);

    // la lista numeros, no se modifica.
    List<Integer> numPares = numeros.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n * 2)
        .collect(Collectors.toList());

        // Imprime
    numPares.forEach(System.out::println);

    // Sin Stream :


    for (int n : numeros) {
    if (n % 2 == 0) { // Filtrar los pares
        numPares.add(n * 2); // Multiplicar por 2 y agregar a la lista
    }
    }

System.out.println(numPares); // [4, 8, 12]
    
    
}
}
