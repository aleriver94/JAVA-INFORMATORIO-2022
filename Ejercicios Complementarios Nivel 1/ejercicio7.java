import java.util.Scanner;

public class ejercicio7 {
    private static String bienvenida = "Bienvenido, aqui convertiremos de minusculas a mayusculas";
    public static void main(String[] args){
        System.out.println(bienvenida);
        System.out.println("Por favor ingrese texto a convertir: ");
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        scan.close();
        System.out.println(convertirUppercase(texto));
    }
    public static String convertirUppercase(String a){
        char [] cadena = a.toCharArray();
        String resultado = "";
        for (char i : cadena){
            if ('a'<=i && i<='z'){
                resultado = resultado+((char) ((int)i-32));
            }
            else{
                resultado = resultado+i;
            }
        }
        return resultado;
    }  
}
