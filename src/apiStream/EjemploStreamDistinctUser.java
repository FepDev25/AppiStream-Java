package apiStream;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUser {
    public static void main(String[] args) {
        Stream<Usuario> nombresFiltrados = Stream.of("Felipe Peralta", "Diego Bravo", "Esteban Pizarro",
                        "Felipe Peralta", "Carlos Bravo", "Felipe Ronaldo", "Felipe Peralta")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();

        nombresFiltrados.forEach(System.out::println);
    }
}
