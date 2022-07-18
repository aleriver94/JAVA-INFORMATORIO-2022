import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {
    private static String bienvenida =
            "Bienvenido, dada una lista de enteros, generaremos otra lista aplicandole la potencia a 2.";

    public static void aplicarCuadrado(List<Integer> list) {
        List<Integer> resultado = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.print("Lista de enteros aplicando potencia a 2: " + resultado);
    }

    public static void main(String[] args) {
        System.out.println(bienvenida);
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        System.out.println("Lista de enteros: " + palabras);
        aplicarCuadrado(palabras);
    }
}
