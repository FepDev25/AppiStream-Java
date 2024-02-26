package claseOptional;

import java.util.Objects;

public class EjemploMapFilter {
    public static void main(String[] args) {
        ComputadorRepositorio pcRepo = new ComputadorRepositorio();
        Fabricante fabricante = pcRepo.filtrar("Asus ROG")
                .map(Computador::getProcesador)
                .map(Procesador::getFabricante)
                .orElseGet(() -> new Fabricante("No ingresado"));
        System.out.println("fabricante = " + fabricante.getNombre());




    }

}
