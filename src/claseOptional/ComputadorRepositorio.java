package claseOptional;

import java.util.*;

public class ComputadorRepositorio implements Repositorio<Computador>{
    private List<Computador> dataSource;
    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador pros = new Procesador("I9-9880H", new Fabricante("Intel"));
        Computador asus = new Computador("XYZ", "Asus ROG");
        asus.setProcesador(pros);
        this.dataSource.add(asus);
        this.dataSource.add(new Computador("MVK", "MacBook Air"));
        this.dataSource.add(new Computador("MVK", "MacBook Pro"));

    }

    @Override
    public Optional<Computador>  filtrar(String nombre) {
        return this.dataSource.stream().filter(pc -> pc.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }
}
