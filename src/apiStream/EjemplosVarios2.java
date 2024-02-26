package apiStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;

public class EjemplosVarios2 {
    public static void main(String[] args) {
        //Filtrado y Mapeo:
        //Dada una lista de números, filtra los números pares y luego duplica cada uno de ellos.
        List <Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List <Integer> paresDuplicados = new ArrayList();
        numeros.stream().filter(num -> num%2==0)
                .map(num -> num*2)
                .forEach(parDuplicado -> paresDuplicados.add( parDuplicado));   
        paresDuplicados.forEach(System.out::println);
        
        //Agrupación y Conteo:
        //Dada una lista de palabras, agrúpalas por su longitud y cuenta cuántas palabras hay de cada longitud.
        List <String> animalesStrings = Arrays.asList("Perro", "Gato", "Conejo", "Leon", "Paloma");
        Map <Integer, Long> agrupacion = animalesStrings.stream()
                .collect(Collectors.groupingBy(
                        palabra -> palabra.length(),
                        Collectors.counting()
                ));
        System.out.println("agrupacion = " + agrupacion);
        
        //Ordenación y Limitación:
        //Ordena una lista de cadenas de texto por longitud y muestra solo las 3 cadenas más largas.
        animalesStrings = Arrays.asList("Eelefante", "Hipopotamo", "Gato", "Gorila", "Pez");
        Collections.sort(animalesStrings, (a,b) -> Integer.compare(b.length(), a.length()));
        animalesStrings.stream().limit(3).forEach(System.out::println);
        
        //Transformación y Reducción:
        //Convierte una lista de objetos de tipo Persona en una lista de sus edades y calcula la suma de todas las edades.
        List <Persona> personas = Arrays
                .asList(new Persona("Felipe", 18), new Persona("Esteban", 21)
                        , new Persona("Paz", 14), new Persona("Juan", 19));
        int suma = personas.stream()
                .mapToInt(persona -> persona.getEdad())
                .sum();
        System.out.println("suma = " + suma);
        
        //Combinación de Streams:
        //Combina dos listas de números, filtra los duplicados y luego encuentra la suma de los elementos resultantes.
        List <Integer> numeros1 = Arrays.asList(2,4,6,8,10,12,14,16,18,20);
        List <Integer> numeros2 = Arrays.asList(4,5,8,10,12,15,16,20,20);
        int sumaResultantes = Stream.concat(numeros1.stream(), numeros2.stream())
                .distinct()
                .reduce(0, Integer::sum);
        System.out.println("sumaResultantes = " + sumaResultantes);
        
        
        //Manejo de Nulls:
        //Filtra una lista de cadenas de texto y realiza una operación en cada cadena no nula.
        List <String> stringsSomeNull = Arrays.asList(null,"Saltar", "Caminar", null,"Correr", "Jugar", "Cantar");
        stringsSomeNull.stream().filter(cadena -> cadena!= null)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        
        //Operaciones de String:
        //Dada una lista de cadenas, concatena todas las cadenas que contienen la letra 'a'.
        List <String> cadenas = Arrays.asList("Cocinar","Saltar", "Correr", "Beber", "Jugar", "Cantar", "Comer");
        String concatenadosConA = cadenas.stream().filter(cadena -> cadena.contains("a"))
                .reduce("", String::concat);
        System.out.println("concatenadosConA = " + concatenadosConA);
        
        //Operaciones de Fecha:
        //Dada una lista de objetos LocalDate, filtra las fechas que son antes de hoy y luego encuentra la fecha más reciente
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaEspecifica1 = LocalDate.of(2011, 11, 7);
        LocalDate fechaEspecifica2 = LocalDate.of(2023, 6, 30);
        LocalDate fechaEspecifica3 = LocalDate.of(2024, 1, 12);
        
        List <LocalDate> fechas = Arrays.asList(fechaActual, fechaEspecifica1, fechaEspecifica2, fechaEspecifica3);
        LocalDate fechaBuscada =  fechas.stream().
                filter(fecha -> fecha.isBefore(LocalDate.now()))
                .max(LocalDate::compareTo)
                .orElse(null);
        System.out.println("fechaBuscada = " + fechaBuscada);
    }
}
