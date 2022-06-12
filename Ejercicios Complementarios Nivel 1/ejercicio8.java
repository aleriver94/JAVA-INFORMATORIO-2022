import java.util.Scanner;

public class ejercicio8 {
    private static String bienvenida = "Bienvenido";
    public static void main(String[] args){
        System.out.println(bienvenida);
        System.out.println("Por favor, a continuacion ingrese los datos requeridos.");
        System.out.println("Ingrese su nombre y apellido: ");
        Scanner scan = new Scanner(System.in);
        String na = scan.nextLine();
        System.out.println("Ingrese su edad: ");
        String age = scan.nextLine();
        System.out.println("Ingrese su Direccion: ");
        String dir = scan.nextLine();
        System.out.println("Ingrese su ciudad: ");
        String city = scan.nextLine();
        String resultado = String.format("%s - %s - %s - %s", city, dir, age, na);
        System.out.println(resultado);
        scan.close();
    }
}
