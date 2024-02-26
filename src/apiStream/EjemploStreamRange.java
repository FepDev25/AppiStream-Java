package apiStream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class EjemploStreamRange {
    public static void main(String[] args) {
        IntStream rango = IntStream.range(1,101);
       int suma = rango.sum();
        System.out.println("suma del 1 al 100 = " + suma);

        rango = IntStream.range(6,67);  // No incluye el segundo argumento
        IntSummaryStatistics rango2 = rango.summaryStatistics();
        System.out.println("Mayor: " + rango2.getMax());
        System.out.println("Menor: " + rango2.getMin());
        System.out.println("Suma: " + rango2.getSum());
        System.out.println("Promedio: " + rango2.getAverage());
        System.out.println("Total: " + rango2.getCount());


        IntStream miRange = IntStream.rangeClosed(1,100); // Incluye el segundo argumento
        IntSummaryStatistics statics = miRange.summaryStatistics();
        System.out.println("La suma de " + statics.getMin() + " hasta " + statics.getMax() + " es: " + statics.getSum());
    }
}
