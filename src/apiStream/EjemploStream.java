package apiStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Felipe", "Diego", "Esteban", "Carlos");
        nombres.forEach(System.out::println);
        System.out.println();

        String [] arr = {"Felipe", "Diego", "Esteban", "Carlos"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);
        System.out.println();

        nombres = Stream.<String>builder().add("Felipe").add("Diego").add("Esteban").add("Carlos").build();
        nombres.forEach(System.out::println);
        System.out.println();

        List<String> lista = new ArrayList<>();
        lista.add("Felipe");
        lista.add("Diego");
        lista.add("Esteban");
        lista.add("Carlos");
        nombres = lista.stream();
        nombres.forEach(System.out::println);
    }
}
