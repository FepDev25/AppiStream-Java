package apiStream;
import java.util.Arrays;
import java.util.function.Function;

public class Tarea2 {
    public static void main(String[] args) {
        int [] arreglo = {13,111,13,15,17,3,12,84,1,10,100,1,23};
        Function<int [], Integer> mayor = lista -> Arrays.stream(lista)
                .max().orElse(0);
        int mayorNum = mayor.apply(arreglo);
        System.out.println("mayorNum = " + mayorNum);
    }
}