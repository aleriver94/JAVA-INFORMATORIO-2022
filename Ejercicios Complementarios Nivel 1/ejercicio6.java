import java.util.Scanner;

public class ejercicio6 {
    private static String bienvenida = "Bienvenido, aqui calcularemos la potencia de 2 numeros.";
    public static void main(String[] args){
        System.out.println(bienvenida);
        System.out.println("Por favor Ingrese el primer numero: ");
        Scanner scan = new Scanner(System.in);
        int nro1 = scan.nextInt();
        System.out.println("Por favor ingrese el segundo numnero(exponente): ");
        int nro2 = scan.nextInt();
        if (nro2==0){
            scan.close();
            System.out.println(nro1+" elevado a "+nro2+" = 1");
        }
        else {
            int resultado = potencia(nro1,nro2);
            scan.close();
            System.out.println(nro1+" elevado a "+nro2+" = "+resultado);
        }

    }

    public static int potencia(int a, int b){
        int total = a;
        for (int i=1; i<b; i++){
            total*=a;
        }
        return total;
    }
}
