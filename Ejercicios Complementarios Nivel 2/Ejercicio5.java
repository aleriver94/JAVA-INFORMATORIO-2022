import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    private static String bienvenida = "Bienvenido";

    public static void main(String[] args) {
        System.out.println(bienvenida);
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese las horas trabajadas (separadas por un '-'): ");
        String cadenaHoras = scan.nextLine();
        ArrayList<Integer> listaHoras = pasarCadena(cadenaHoras);
        System.out.println("Por favor ingrese el valor por horas trabajadas (separados por un '-'");
        String cadenaValor = scan.nextLine();
        ArrayList<Integer> listaValores = pasarCadena(cadenaValor);
        compararListas(listaHoras, listaValores);
        imprimirListas(listaHoras, listaValores);
        scan.close();
    }

    public static ArrayList<Integer> pasarCadena(String cadena) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (String p : cadena.split("-")) {
            list.add(Integer.valueOf(p));
        } ;
        return list;
    }

    public static void compararListas(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) {
            System.out.println("Las listas no son iguales");
        }
    }

    public static void imprimirListas(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> listaFinal = new ArrayList<Integer>();
        for (int i = 0; i < list1.size(); i++) {
            listaFinal.add((list1.get(i) * list2.get(i)));
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(listaFinal);
        int total = 0;
        for (int i = 0; i < listaFinal.size(); i++) {
            total = total + listaFinal.get(i);
        }
        System.out.println("El total es: " + total);
    }

}
