import java.util.Scanner;

public class ejercicio9 {
    private static String bienvenida = "Bienvenido";
    public static void main(String[] args){
        System.out.println(bienvenida);
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba su texto: ");
        String texto = scan.nextLine();
        System.out.println("Por favor, escriba la letra a contar: ");
        char letra = scan.next().charAt(0);
        char[] a=texto.toCharArray();
        int cont = 0;
        for (char i : a){
            if(i == letra){
                cont++;
            }
        }
        String resultado = String.format("La letra %s se repite: %d veces", letra, cont);
        scan.close();
        System.out.println(resultado);
    }
}
