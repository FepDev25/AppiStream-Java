package apiStream;

import java.util.stream.Stream;

public class EjemploStreamAnyMatch {
    public static void main(String[] args) {
        // Retorna un booleano si encuentra su búsqueda
        boolean existe = Stream.of("Felipe Peralta", "Diego Bravo", "Esteban Pizarro",
                        "Carlos Bravo", "Felipe Ronaldo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId() == 9);
        System.out.println(existe);

        boolean existe2 = Stream.of("Felipe Peralta", "Diego Bravo", "Esteban Pizarro",
                        "Carlos Bravo", "Felipe Ronaldo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.hashCode() == new Usuario("Felipe", "Peralta").hashCode());
        System.out.println(existe2);
    }
}
