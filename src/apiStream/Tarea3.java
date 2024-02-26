package apiStream;

import java.util.Arrays;

public class Tarea3 {
    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"},
                {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}};
        Arrays.stream(lenguajes)
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);

    }
}