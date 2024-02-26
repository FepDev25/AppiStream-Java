package apiStream;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {
        long contar = Stream.of("Felipe Peralta", "", "Esteban Pizarro",
                        "Carlos Bravo", "").filter(String::isEmpty).count();

        System.out.println(contar);



    }
}
