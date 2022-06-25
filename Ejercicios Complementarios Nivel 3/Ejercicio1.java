import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1 {
    private static String bienvenida = "Bienvenido, aqui filtraremos un ArrayList sacandole los null y los espacios en blanco.";
    public static void filtrar (List<String> a){
        List<String> listaFiltrada = a.stream().filter(p -> p!=null && p!="").collect(Collectors.toList());
        System.out.println("Lista filtrada: "+listaFiltrada);
    }
    public static void main(String[] args) {
        System.out.println(bienvenida);
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        System.out.println("Lista sin filtrar: "+palabras);
        filtrar(palabras);   
    }
}

