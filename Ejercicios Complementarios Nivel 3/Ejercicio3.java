import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3 {
    private static String bienvenida = "Bienvenido, dada una lista de strings, calcularemos cuantos comienzan con la letra B.";
    public static void calcularLetraB(List<String> list){
        List<String> listStream = list.stream().map(palabra ->palabra.substring(0,1)).filter(palabra -> palabra.equalsIgnoreCase("b") ).collect(Collectors.toList());
        Integer contador = listStream.size();
        System.out.println("La cantidad de palabras que comienzan con la letra B es de: "+contador+", ignorando si esta en mayúsculas o minúsculas.");
    }
    public static void main(String[] args) {
    System.out.println(bienvenida);
    List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
    System.out.println("Lista de strings: "+palabras);
    calcularLetraB(palabras);
}
}
