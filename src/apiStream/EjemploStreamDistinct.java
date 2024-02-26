package apiStream;

import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {
        // Elimina los repetidos
       Stream<String> nombres = Stream.of("Bryan Reyes", "Felipe Peralta", "Diego Bravo", "Felipe Peralta",
                "Felipe Peralta", "Felipe Peralta", "Bryan Reyes", "Edge Hazard", "Felipe Peralta")
               .distinct();

       nombres.forEach(System.out::println);
    }
}
