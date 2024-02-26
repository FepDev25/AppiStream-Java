package apiStream;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {
        // Elimina los repetidos
       Stream<String> nombres = Stream.of("Bryan Reyes", "Felipe Peralta", "Diego Bravo", "Felipe Peralta",
                "Felipe Peralta", "Felipe Peralta", "Bryan Reyes", "Edge Hazard", "Felipe Peralta")
               .distinct();

       String resultado = nombres.reduce("resultado = ", (a,b) -> a + ", " +b);
        System.out.println(resultado);
    }
}
