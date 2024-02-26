package apiStream;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Felipe Peralta", "Diego Bravo", "Esteban Pizarro",
                        "Carlos Bravo", "Felipe Ronaldo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                // Igual que el filter
                .flatMap( user -> {
                    if (user.getNombre().equals("Felipe")){
                        return Stream.of(user); // Retorna un stream
                    }
                    return Stream.empty(); // Si no lo encuentra, retorna un vació
                });

        nombres.forEach(System.out::println);
    }
}
