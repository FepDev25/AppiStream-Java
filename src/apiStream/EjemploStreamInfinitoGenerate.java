package apiStream;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamInfinitoGenerate {
    public static void main(String[] args) {
        Stream.generate(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(1); // Hace el procedimiento cada 1 segundo
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "Hola mundo";
        })
                .limit(15) // Limit de elementos
                .forEach(System.out::println);

        AtomicInteger contador = new AtomicInteger(0);
        Stream.generate(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return contador.getAndIncrement();
                })
                .limit(5) // Limit de elementos
                .forEach(System.out::println);
    }
}
