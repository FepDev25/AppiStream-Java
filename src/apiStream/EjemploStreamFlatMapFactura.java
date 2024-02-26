package apiStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Felipe", "Peralta");
        Usuario usuario2 = new Usuario("Carlos", "Peralta");

        usuario1.addFactura(new Factura("Celulares"));
        usuario1.addFactura(new Factura("Papas"));
        usuario1.addFactura(new Factura("Muebles"));
        usuario1.addFactura(new Factura("Licores"));

        usuario2.addFactura(new Factura("Tortas"));
        usuario2.addFactura(new Factura("Bebidas"));
        usuario2.addFactura(new Factura("Vegetales"));

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2);
        usuarios.stream()
                .flatMap(user -> user.getFacturas().stream())
                .forEach(factura -> System.out.println(factura.getDescripción()
                        .concat(" " + factura.getUser().toString())));

        System.out.println();

        usuarios.stream()
                .map(Usuario::getFacturas)
                .flatMap(Collection::stream)
                .forEach(factura -> System.out.println(factura.getDescripción()
                .concat(" " + factura.getUser().toString())));;
    }

}
