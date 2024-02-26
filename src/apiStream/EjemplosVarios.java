package apiStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EjemplosVarios {

    public static void main(String[] args) {

        // Filtrar elementos
        List<Integer> numeros = Arrays.asList(16, 14, 15, 1, 10, 11, 23, 12, 13, 17, 19, 22, 11);

        List<Integer> numerosPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("numerosPares = " + numerosPares);

        // Eliminar duplicados
        List<String> nombres = Arrays.asList("Felipe", "Marco", "Messi", "Eden", "Felipe");
        List<String> nombresUnicos = nombres.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("nombresUnicos = " + nombresUnicos);

        // Transformar elementos
        List<String> nombresEnMayusculas = nombresUnicos.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("nombresEnMayusculas = " + nombresEnMayusculas);

        // Comprobar si algun elemento cumple una condicion
        boolean existeCero = numeros.stream()
                .anyMatch(numero -> numero == 0);
        System.out.println("existeCero = " + existeCero);

        // Comprobar que todos los elementos cumplan una condicion
        List<Integer> numerosParesList = Arrays.asList(16, 14, 2, 8, 10, 18, 22);
        boolean todosPares = numerosParesList.stream()
                .allMatch(numero -> numero % 2 == 0);
        System.out.println("todosPares = " + todosPares);

        // Mayor
        List<Integer> numerosX = Arrays.asList(1001, 20, 12, 13, 16, 1000, 120, 1, -9, 91, -5, 16, 14, 2, 8, 10, 18, 22);

        int mayor = numerosX.stream().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("mayor = " + mayor);

        int menor = numerosX.stream().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("menor = " + menor);

        //Filtrar y transformar:
        //Dada una lista de palabras, filtra las que tengan más de 5 caracteres y conviértelas a mayúsculas.
        List<String> palabras = Arrays.asList("Perro", "Gato", "Elefante", "Ave", "Lapiz", "Ola", "Carton", "Catedral");
        List<String> palabrasFiltradas = palabras.stream()
                .map(String::toUpperCase)
                .filter(palabra -> palabra.length() > 5)
                .collect(Collectors.toList());
        System.out.println("palabrasFiltradas = " + palabrasFiltradas);

        //Ordenar y limitar:
        //Ordena una lista de números de manera descendente y luego toma los primeros 3 elementos.
        numeros = Arrays.asList(13, 17, 1, 11, 14, 10, 20, 45, 12, 6);
        List<Integer> resultado = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("resultado = " + resultado);

        //Contar y agrupar:
        //Cuenta la cantidad de palabras que empiezan con la misma letra en una lista de palabras.
        palabras = Arrays.asList("Perro", "Pera", "Elefante", "Catedral", "Perico", "Ola", "Carton", "Estupendo");
        Map<Character, Long> conteoPorLetra = palabras.stream()
                .collect(Collectors.groupingBy(
                        palabra -> palabra.charAt(0),
                        Collectors.counting()
                ));
        System.out.println("Conteo por letra: " + conteoPorLetra);

        //Encontrar elementos:
        //Encuentra el primer número divisible por 7 en una lista de números.
        numeros = Arrays.asList(13, 17, 1, 11, 14, 10, 14, 45, 12, 6);
        int primerDivisible = numeros.stream()
                .filter(num -> num % 7 == 0)
                .findFirst().orElse(0);
        System.out.println("primerDivisible = " + primerDivisible);

        //Verificar condiciones:
        //Verifica si todos los elementos de una lista de strings tienen al menos 3 caracteres.
        palabras = Arrays.asList("Perro", "Pera", "Elefante", "Catedral", "Perico", "Ola", "Carton", "Estupendo");
        boolean minCaracteres = palabras.stream()
                .allMatch(palabra -> palabra.length() >= 3);
        System.out.println("minCaracteres = " + minCaracteres);

        //Calcular estadísticas:
        //Calcula la suma, el promedio, el máximo y el mínimo de una lista de números.
        List<Integer> cantidadGoles = Arrays.asList(6, 13, 19, 22, 21, 27, 30, 33, 48, 37, 50, 43, 31, 30);
        int sumaGoles = cantidadGoles.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("sumaGoles = " + sumaGoles);
        int mayorGoles = cantidadGoles.stream().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println("mayorGoles = " + mayorGoles);
        int menorGoles = cantidadGoles.stream().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println("menorGoles = " + menorGoles);
        OptionalDouble promedioGoles = cantidadGoles.stream().mapToDouble(Integer::doubleValue).average();
        promedioGoles.ifPresent(value -> System.out.println("Promedio de goles = " + value));

        //Eliminar duplicados:
        //Dada una lista de números, elimina los elementos duplicados.
        numeros = Arrays.asList(13, 13, 12, 11, 14, 16, 17, 17, 18, 17, 19, 20, 21, 22);
        numeros.stream()
                .distinct()
                .sorted()
                .forEach(num -> System.out.print(num + " "));
        System.out.println("");

        //Concatenar y formatear:
        //Concatena todas las palabras de una lista en una sola cadena, separadas por comas.
        palabras = Arrays.asList("Perro", "Pera", "Elefante", "Catedral", "Perico", "Ola", "Carton", "Estupendo");
        palabras.stream()
                .map(palabra -> palabra.concat(","))
                .forEach(System.out::print);
        System.out.println("");

        //Encontrar el índice del elemento mínimo:
        //Encuentra el índice del elemento mínimo en una lista de números.
        int[] numerosY = {13, 17, 1, 11, 14, 10, 20, 45, 12, 6};
        int indiceMinimo = IntStream.range(0, numerosY.length)
                .reduce((i, j) -> (numerosY[i] < numerosY[j]) ? i : j)
                .orElse(-1);
        System.out.println("Índice del elemento mínimo: " + indiceMinimo);

    }

}
