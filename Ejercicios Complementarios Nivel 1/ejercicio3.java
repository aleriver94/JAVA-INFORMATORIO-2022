import java.util.Scanner;
public class ejercicio3 {
    private static String bienvenida="Bienvenido";
    public static void main(String [] args){
        System.out.print(bienvenida);
        System.out.println("Por favor ingrese un numero entero:");
        Scanner scan = new Scanner(System.in);
        String nro = scan.nextLine();
        secuenciaNro(nro);
        scan.close();
    }
    
    public static void secuenciaNro(String nro){
        String secuencia ="";
        int a= Integer.parseInt(nro)+1;
        for (int i=1; i<a;i++){
            secuencia = secuencia+" "+i;
            System.out.println(secuencia);
        }
    }
}
