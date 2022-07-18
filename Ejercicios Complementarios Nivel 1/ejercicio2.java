import java.util.Scanner;

public class ejercicio2 {
    private static String bienvenida = "Bienvenido";

    public static void main(String[] args) {
        System.out.println(bienvenida);
        System.out.println("Por favor ingrese el primer numero:");
        Scanner scan = new Scanner(System.in);
        int numero1 = scan.nextInt();
        System.out.println("Por favor ingrese el segundo numero:");
        int numero2 = scan.nextInt();
        suma(numero1, numero2);
        resta(numero1, numero2);
        multiplicacion(numero1, numero2);
        division(numero1, numero2);
        modulo(numero1, numero2);
        scan.close();
    }

    public static void suma(int a, int b) {
        int z = a + b;
        System.out.println(a + " + " + b + " = " + z);
    }

    public static void resta(int a, int b) {
        int z = a - b;
        System.out.println(a + " - " + b + " = " + z);
    }

    public static void multiplicacion(int a, int b) {
        int z = a * b;
        System.out.println(a + " * " + b + " = " + z);
    }

    public static void division(int a, int b) {
        int z = a / b;
        System.out.println(a + " / " + b + " = " + z);
    }

    public static void modulo(int a, int b) {
        int z = a % b;
        System.out.println(a + " % " + b + " = " + z);
    }
}
