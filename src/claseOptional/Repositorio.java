package claseOptional;

import java.util.Optional;

public interface Repositorio <T>{
    Optional<Computador> filtrar(String nombre);
}
