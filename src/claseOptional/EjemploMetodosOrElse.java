package claseOptional;

public class EjemploMetodosOrElse {
    public static void main(String[] args) {
        Computador defaultPc = new Computador("","");

        ComputadorRepositorio pcRepo = new ComputadorRepositorio();
        Computador pc = pcRepo.filtrar("MacBook Pro").orElse(defaultPc);
        System.out.println("pc = " + pc);

        Computador pc2 = pcRepo.filtrar("MacBook Pr").orElse(defaultPc);
        System.out.println("pc2 = " + pc2);

        Computador pc3 = pcRepo.filtrar("MacBook Pr").orElseGet(() -> new Computador("", ""));
        System.out.println("pc3 = " + pc3);

        // Si se encuentra o no se encuentra, se llama el valorDefecto(), redundante.
        Computador pc4 = pcRepo.filtrar("MacBook Pro").orElse(valorDefecto());
        System.out.println("pc4 = " + pc4);

        // No va a llamar el Else si no se requiere, es mejor.
        Computador pc5 = pcRepo.filtrar("MacBook Pro").orElseGet(EjemploMetodosOrElse::valorDefecto);
        System.out.println("pc5 = " + pc5);


    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo valor por defecto.");
        return new Computador("", "");
    }
}
