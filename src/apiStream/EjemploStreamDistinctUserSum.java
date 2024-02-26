package apiStream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUserSum {
    public static void main(String[] args) {
        IntStream largoNombres = Stream.of("Monserrat Peralta", "Diego Bravo", "Esteban Pizarro",
                        "Maria Gutierrez", "Carlos Bravo", "Felipe Ronaldo", "Marco Abril")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .mapToInt( user -> user.toString().replace(" ", "").length())
                .peek(System.out::println);


        IntSummaryStatistics statistics = largoNombres.summaryStatistics();
        System.out.println("Total: " + statistics.getSum());
        System.out.println("Menor longitud: " + statistics.getMin());
        System.out.println("Mayor longitud: " + statistics.getMax());
        System.out.println("Promedio: " + statistics.getAverage());
    }
}
