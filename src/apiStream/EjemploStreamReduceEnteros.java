package apiStream;

import java.util.stream.Stream;

public class EjemploStreamReduceEnteros {
    public static void main(String[] args) {
        // Elimina los repetidos
       Stream<Integer> nombres = Stream.of(1,2,3,4,5,6,7);
       
       int suma = nombres.reduce(0, Integer::sum);
        System.out.println("suma = " + suma);
       
    }
}
