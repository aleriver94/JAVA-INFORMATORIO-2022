import java.util.ArrayList;

public class Ejercicio7 {
    public static ArrayList<String> fizzBuzz(int a, int b) {
        String palabra = "";
        ArrayList<String> list = new ArrayList<String>();
        for (int i = a; i < b - 1; i++) {
            palabra = String.valueOf(i);
            if (i % 2 == 0) {
                palabra = "\"Fizz\"";
            } else {
                if (i % 3 == 0) {
                    palabra = "\"Buzz\"";
                } else {
                    if (i % 2 == 0 && i % 3 == 0) {
                        palabra = " \"FizzBuzz \"";
                    } else {
                        palabra = "\"" + String.valueOf(i) + "\"";
                    }
                }
            }
            list.add(palabra);
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> cadena = fizzBuzz(1, 8);
        System.out.print(cadena);
    }
}
