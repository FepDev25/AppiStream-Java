package claseOptional;

public class Computador {
    private String modelo;
    private String nombre;
    private Procesador procesador;

    public Computador(String modelo, String nombre) {
        this.modelo = modelo;
        this.nombre = nombre;
    }

    public Computador(String modelo, String nombre, Procesador procesador) {
        this.modelo = modelo;
        this.nombre = nombre;
        this.procesador = procesador;
    }

    public Computador() {
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "modelo='" + modelo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
