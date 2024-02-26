package apiStream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Felipe", "Peralta"));
        usuarios.add(new Usuario("Karen", "Peralta"));
        usuarios.add(new Usuario("Pablo", "Escobar"));
        usuarios.add(new Usuario("Paz", "Peralta"));
        usuarios.add(new Usuario("Miriam", "Cordero"));
        usuarios.add(new Usuario("Jefferson", "Santos"));
        usuarios.add(new Usuario("Nube", "Peralta"));
        usuarios.add(new Usuario("Ramiro", "Bustos"));
        usuarios.add(new Usuario("Felipe", "Pollo"));
        usuarios.add(new Usuario("Diego", "Peralta"));

        usuarios.stream()
                .map(user -> user.getNombre().concat(" ").concat(user.getApellido()))
                .forEach(nombre -> System.out.println("Nombre completo: " + nombre));

        Stream <String> felipes = usuarios.stream()
                .flatMap( user -> {
                if (user.getNombre().equals("Felipe")){
                    return Stream.of(user.getNombre() + " " + user.getApellido() + " es un Felipe");
                }
                return Stream.empty();
        });
        felipes.forEach(System.out::println);


        System.out.println("usuarios = " + usuarios);
    }
}
