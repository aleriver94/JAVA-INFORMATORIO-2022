import java.util.Scanner;

public class ejercicio1 {
    private static String bienvenida = "Bienvenido";

    public static void main(String[] args) {
        System.out.println(bienvenida);
        System.out.println("Por favor ingrese su nombre:");
        Scanner scan = new Scanner(System.in);
        String usuario = scan.nextLine();
        saludo(usuario);
        scan.close();
    }

    public static void saludo(String texto) {
        System.out.println("Hola " + texto + "!!!");
    }
}
