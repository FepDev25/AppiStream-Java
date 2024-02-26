package claseOptional;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {
        ComputadorRepositorio pcRepo = new ComputadorRepositorio();
        Optional<Computador> pc = pcRepo.filtrar("MacBook Pro");
        pc.ifPresentOrElse(System.out::println, () -> System.out.println("No encontrado"));

        Optional<Computador> pc2 = pcRepo.filtrar("MacBook Pr");
        pc2.ifPresentOrElse(System.out::println, () -> System.out.println("No encontrado"));


    }
}
