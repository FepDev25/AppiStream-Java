package apiStream;

import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Felipe", "Diego", "Esteban", "Carlos")
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
       //  nombres.forEach(System.out::println);

        List<String> nombresList = nombres.toList();

        System.out.println();

        nombresList.forEach(System.out::println);
    }
}
