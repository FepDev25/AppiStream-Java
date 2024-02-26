package claseOptional;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        // Evita el NullPointerException
        String nombre = "Felipe";
        Optional<String> optional = Optional.of(nombre);
        System.out.println("optional = " + optional);

        if (optional.isPresent()){
            System.out.println("Optional presente");
        } else{
            System.out.println("Ausente");
        }
        System.out.println(optional.isEmpty());

        optional.ifPresent(System.out::println);

        nombre = null;
        optional = Optional.ofNullable(nombre); // Acepta nulos
        System.out.println("optional = " + optional);

        optional.ifPresentOrElse(System.out::println, () -> System.out.println("No presente"));

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("optionalEmpty = " + optionalEmpty);
    }
}
