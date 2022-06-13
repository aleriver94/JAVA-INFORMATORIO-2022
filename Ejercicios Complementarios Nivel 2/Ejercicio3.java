import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args){
        ArrayList<Integer> baraja = crearBaraja();
        imprimirBaraja(baraja);
        imprimirReverso(baraja);
        mezclarBaraja(baraja);
    }
    public static ArrayList<Integer> crearBaraja(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i<53; i++) list.add(i);
        return list;
    }
    public static void imprimirBaraja(ArrayList<Integer> list){
        System.out.println("La baraja ordenada es: "+list);
    }
    public static void imprimirReverso(ArrayList<Integer> list){
        Collections.reverse(list);
        System.out.println("La baraja en orden reverso es: "+list);
    }
    public static void mezclarBaraja(ArrayList<Integer> list){
        Collections.shuffle(list, new Random());
        System.out.println("La baraja mezclada es: "+list);
    }
}
