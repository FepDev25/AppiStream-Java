package apiStream;

import java.util.stream.Stream;

public class EjemploStreamCount {
    public static void main(String[] args) {
        // Cuenta
        long cantidad = Stream.of("Felipe Peralta", "Diego Bravo", "Esteban Pizarro",
                        "Carlos Bravo", "Felipe Ronaldo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .count();
        System.out.println(cantidad);

    }
}
