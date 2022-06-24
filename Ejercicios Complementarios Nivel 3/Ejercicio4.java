import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4 {
    private static String bienvenida = "Bienvenido, dada una lista de enteros, obtendremos otra lista aplicando el factorial sin valores repetidos.";
    static int factCalculator(int n){
        if( n == 0 || n ==1){
            return 1;
        }
        else{
            return n * factCalculator(n-1); 
        }
    }
    public static void main(String[] args) {
    System.out.println(bienvenida);
    List<Integer> palabras = List.of(1, 2, 4, 4, 4);
    System.out.println("Lista de enteros: "+palabras);
    calcularFactorialNoRepeat(palabras);
    }
    public static void calcularFactorialNoRepeat(List<Integer> palabras){
        List<Integer> list=palabras.stream().map(x->factCalculator(x.intValue())).distinct().collect(Collectors.toList());
        System.out.println("Lista de factoriales calculados sin repetir: "+list);
    };
}
