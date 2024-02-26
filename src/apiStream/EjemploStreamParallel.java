package apiStream;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Karen", "Peralta"));
        usuarios.add(new Usuario("Pablo", "Escobar"));
        usuarios.add(new Usuario("Paz", "Peralta"));
        usuarios.add(new Usuario("Miriam", "Cordero"));
        usuarios.add(new Usuario("Jefferson", "Santos"));
        usuarios.add(new Usuario("Nube", "Peralta"));
        usuarios.add(new Usuario("Ramiro", "Bustos"));
        usuarios.add(new Usuario("Diego", "Peralta"));
        usuarios.add(new Usuario("Felipe", "Peralta"));

        long t1 = System.currentTimeMillis();
        String felipes = usuarios.stream()
                .parallel() // Realiza las comparaciones de todos los nombres a la vez, en diferentes hilos
                .map(Usuario::getNombre)
                .peek(n -> System.out.println("Nombre Thread: " + Thread.currentThread().getName() + " - " + n))
                .flatMap( nombre -> {

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (nombre.equals("Felipe")){
                    return Stream.of(nombre);
                }
                return Stream.empty();
        }).findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (t2-t1));
        System.out.println("felipes = " + felipes);
    }
}
