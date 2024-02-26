package apiStream;

import java.util.stream.Stream;

public class EjemploStreamMap2 {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Felipe Peralta", "Diego Bravo", "Esteban Pizarro", "Carlos Bravo")
                .map(nombre -> {
                    Usuario u = new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]);
                    System.out.println("Nuevo usuario: " + u.getNombre() + " " + u.getApellido());
                    return u;
        });
        nombres.forEach(System.out::println);

        System.out.println();

        // Simplificado:
        Stream<Usuario> nombresSimplificado = Stream.of("Felipe Peralta", "Diego Bravo", "Esteban Pizarro", "Carlos Bravo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]));
        nombresSimplificado.forEach(System.out::println);

    }
}
