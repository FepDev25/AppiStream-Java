package apiStream;

public class Factura {
    private String descripción;
    private Usuario user;

    public Factura(String descripción) {
        this.descripción = descripción;
    }

    public Factura(String descripción, Usuario user) {
        this.descripción = descripción;
        this.user = user;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
}

