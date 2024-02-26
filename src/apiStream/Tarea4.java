package apiStream;

import java.util.*;

public class Tarea4 {
    public static void main(String[] args) {
        List <Producto> productos = new ArrayList<>();
        productos.add(new Producto("Escoba", 3.25, 2));
        productos.add(new Producto("Bebida", 0.50, 6));
        productos.add(new Producto("Carne", 5.25, 1));
        productos.add(new Producto("Arroz", 15.25, 3));
        productos.add(new Producto("Galletas", 1.75, 7));

        double total = productos.stream()
                .peek(producto -> System.out.println("Importe de " + producto.getNombre() + ": " + producto.calcularImporte()))
                .mapToDouble(Producto::calcularImporte)
                .sum();
        System.out.println("total = " + total);
    }
}