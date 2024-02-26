package apiStream;
import java.util.stream.*;

public class Tarea1 {
    public static void main(String[] args) {
        DoubleStream rango = IntStream.rangeClosed(1,100)
                .filter(num -> num % 10 != 0)
                .mapToDouble(num -> (double) num / 2);
        double resultado = rango.reduce(0, Double::sum);
        System.out.println("resultado = " + resultado);
    }
}