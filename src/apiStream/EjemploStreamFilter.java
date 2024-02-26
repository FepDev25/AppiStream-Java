package apiStream;

import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {
        // Filtra lo que se le pida
        Stream<Usuario> nombresFiltrados = Stream.of("Felipe Peralta", "Diego Bravo", "Esteban Pizarro",
                        "Carlos Bravo", "Felipe Ronaldo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("Felipe"));

        List<Usuario> filtrados = nombresFiltrados.toList();
        filtrados.forEach(System.out::println);
    }
}
