import java.util.Scanner;

public class ejercicio5 {
    private static String bienvenida = "Bienvenido";

    public static void main(String[] args) {
        System.out.println(bienvenida);
        System.out.println("Por favor ingrese el primer numero:");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        System.out.println("Por favor ingrese el segundo numero:");
        String b = scan.nextLine();
        int c = sumaSucesiva(a, b);
        scan.close();
        System.out.println(a + " x " + b + " = " + c);
    }

    public static int sumaSucesiva(String a, String b) {
        int nro1 = Integer.parseInt(a);
        int nro2 = Integer.parseInt(b);
        if (nro2 == 0) {
            return 0;
        }
        int total = nro1;
        for (int i = 1; i < nro2; i++) {
            total += nro1;
        }
        return total;
    }
}
