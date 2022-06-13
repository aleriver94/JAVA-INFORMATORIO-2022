import java.util.ArrayList;

public class Ejercicio2 {
    private static String bienvenida = "Bienvenido";
    public static void main(String[] args){
        System.out.println(bienvenida);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int cont1 = 0;
        int cont2 = 2;
        for (int i=1; i<6;i++){
            lista.add(i);
            cont1=cont1+1;
        }
        System.out.println(lista);
        System.out.println("Su tamaño es de: "+cont1);
        lista.add(lista.get(lista.size()-1));
        for (int i = lista.size()-1;0<i;i--){
            lista.set(i, lista.get(i-1));
            cont2= cont2+1;
        }
        lista.set(0,0);
        lista.add(6);
        System.out.println(lista);
        System.out.println("Su tamaño es de: "+cont2);
    }
}