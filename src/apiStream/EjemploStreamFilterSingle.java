package apiStream;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {
        Stream<Usuario> nombresFiltrados = Stream.of("Felipe Peralta", "Diego Bravo", "Esteban Pizarro",
                        "Carlos Bravo", "Felipe Ronaldo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("Felipe"));

        Optional<Usuario> primerFiltro = nombresFiltrados.findFirst();
        System.out.println(primerFiltro.orElse(new Usuario("Jon","Roe")).getNombre());

        if (primerFiltro.isPresent()){
            System.out.println("Presente: " + primerFiltro.get().getNombre());
        } else {
            System.out.println("Ausente");
        }
    }
}
