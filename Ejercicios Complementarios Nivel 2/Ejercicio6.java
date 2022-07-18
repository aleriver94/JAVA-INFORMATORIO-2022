import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Empleado {
    public String nombreApellido;
    public int dni;
    public int horasTrabajadas;
    public int horasValor;

    public Empleado(int dni, String nombreApellido, int horasTrabajadas, int horasValor) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.horasValor = horasValor;
    }

    public String toString() {
        return String.valueOf(this.dni) + " - " + this.nombreApellido;
    }
}


public class Ejercicio6 {
    private static String bienvenida = "Bienvenido";

    public static void main(String[] args) {
        System.out.println(bienvenida);
        Set<Empleado> empleados = new HashSet<Empleado>();
        Map<Integer, Integer> sueldos = new HashMap<Integer, Integer>();
        empleados.add(new Empleado(34562322, "Jose Nuñez", 8, 400));
        empleados.add(new Empleado(27344914, "Luis Torres", 6, 500));
        for (Empleado i : empleados) {
            sueldos.put(i.dni, (i.horasTrabajadas * i.horasValor));
            System.out.println("Sueldo para " + i.dni + " : " + sueldos.get(i.dni));
        }

    }
}
