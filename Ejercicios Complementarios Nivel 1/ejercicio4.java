import java.util.Scanner;

public class ejercicio4 {
    private static String bienvenida = "Bienvenido/n";

    public static void main(String[] args) {
        System.out.println(bienvenida);
        System.out.println("Por favor ingrese un numero para calcularle el factorial:");
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt();
        scan.close();
        System.out.println(String.format("El factorial de %s es: %d", nro, factorial(nro)));
    }

    public static int factorial(int a) {
        if (a <= 1) {
            return a;
        } else {
            int b = a - 1;
            return b * factorial(b);
        }
    }
}
