package apiStream;

public class Producto {
    private String nombre;
    private double  precio;
    private int cantidad;


    public Producto(String nombre, double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularImporte(){
        return this.cantidad * this.precio;
    }
}
