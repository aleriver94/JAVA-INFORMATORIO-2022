import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
        private static String bienvenida = "Bienvenido";
        public static void main(String[] args){
            System.out.println(bienvenida);
            ArrayList<String> listaEstudiantes = new ArrayList<String>();
            Scanner scan = new Scanner(System.in);
            System.out.println("Por favor, ingrese el nombre de los 12 estudiantes:");
            for (int i=1; i<13;i++){
            String estudiante = scan.nextLine();
            listaEstudiantes.add(estudiante);
            System.out.println("Siguiente estudiante: ");
            }
            scan.close();
            ArrayList<String> lista1 = new ArrayList<String>(listaEstudiantes.subList(0,5));
            ArrayList<String> lista2 = new ArrayList<String>(listaEstudiantes.subList(5,9));
            ArrayList<String> lista3 = new ArrayList<String>(listaEstudiantes.subList(9,12));
            System.out.println("Los estudiantes son: "+listaEstudiantes);
            System.out.println("El primer curso esta formado por: "+lista1);
            System.out.println("El segundo curso esta formado por: "+lista2);
            System.out.println("El tercer curso esta formado por: "+lista3);
        }
}
