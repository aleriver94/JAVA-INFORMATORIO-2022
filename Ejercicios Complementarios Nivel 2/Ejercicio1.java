import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    private static String bienvenida = "Bienvenido";
    public static void main(String[] args){
        System.out.println(bienvenida);
        System.out.println("Por favor, ingrese sus ciudades preferidas, separadas con el caracter '-' :");
        Scanner scan = new Scanner(System.in);
        String cities = scan.nextLine();
        scan.close();
        imprimirRanking(cities);        
    }
    public static void imprimirRanking(String a){
        String[] divisor = a.split("-");
        ArrayList<String> citiesArray = new ArrayList<String>();
        for (String i : divisor){
            citiesArray.add(i);
        };
        String resultado = "";
        for(int i= 0; i<citiesArray.size();i++){
            resultado = String.format("#%s - %s", (i+1),citiesArray.get(i));
            System.out.println(resultado);
        }
    }
}
