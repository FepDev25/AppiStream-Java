package apiStream;

import java.util.ArrayList;
import java.util.Objects;

public class Usuario {

    private ArrayList<Factura> facturas = new ArrayList<>();
    private String nombre;
    private String apellido;
    private int id;
    public static int idContador = 0;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++Usuario.idContador;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void addFactura(Factura factura) {
        factura.setUser(this);
        this.facturas.add(factura);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
