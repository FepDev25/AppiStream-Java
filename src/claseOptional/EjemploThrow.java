package claseOptional;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

public class EjemploThrow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ComputadorRepositorio pcRepo = new ComputadorRepositorio();
        Computador pc = pcRepo.filtrar("MacBook Pro").orElseThrow();
        System.out.println("pc = " + pc);

        Computador pc2 = pcRepo.filtrar("MacBook Pro").orElseThrow(IllegalStateException::new);
        System.out.println("pc2 = " + pc2);

        try {

            System.out.println("Ingrese el nombre del documento: ");
            String archivo = s.nextLine();

            String extension = Optional.ofNullable(archivo)
                    .filter(a -> a.contains("."))
                    .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                    .orElseThrow();

            System.out.println("extension = " + extension);
        } catch (NoSuchElementException ex){
            System.out.println("El archivo no tiene extension");
        }
    }
}
