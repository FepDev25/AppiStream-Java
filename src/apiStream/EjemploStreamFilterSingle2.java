package apiStream;

import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {
        Usuario usuario = Stream.of("Felipe Peralta", "Diego Bravo", "Esteban Pizarro",
                        "Carlos Bravo", "Felipe Ronaldo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(usuarioAux -> System.out.println(usuarioAux.getNombre() + ": " + usuarioAux.getId()))
                .filter(u -> u.getId() == 7)
                // A la primera coincidencia, se sale. Si no hay coincidencias, retorna el "orELseGet"
                .findFirst().orElseGet( () -> new Usuario("Usuario", "Auxiliar") );

        System.out.println(usuario);
    }
}
