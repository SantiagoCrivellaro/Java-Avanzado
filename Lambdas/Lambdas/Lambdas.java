package Lambdas;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambdas {

    public static void main(String[] args) {

        // Usando el mismo ejemplo de el Stream


        // Creamos una List, inmutable.
        List<Integer> nums = List.of(1,2,3,4,5,6);

        List<Integer> numPares = nums.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n * 2)
        .collect(Collectors.toList());

        // n -> n % 2 == 0 es un lambda, son funciones anonimas.
        // Siendo (n) el parametro (->) el que separa y (n % 2 == 0) la logica
        numPares.forEach(System.out::println);
 }

}