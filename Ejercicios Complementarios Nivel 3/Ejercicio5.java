import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Alumno {
    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    public Alumno(String nombre, String apellido, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public Integer getEdad(){
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        Integer e = edad.getYears();
        return e;
    }
    public String toString(){
        return String.valueOf(this.nombre+" - "+this.apellido);
    }
}
public class Ejercicio5 {
    private static String bienvenida = "Bienvenido, dada una lista de objetos de tipo Alumno, obtendremos un Map con su nombre y apellido como clave y su edad como valor.";
    public static LocalDate obtenerFecha(int i){
        LocalDate fechaN = Calendar.getInstance().getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().minusYears(i);
        return fechaN;
    }
    public static void generarMap (List<Alumno> a){
        Map<String, Integer> alumnosMap = a.stream().collect(
            Collectors.toMap((x->"\""+x.getApellido()+" "+x.getNombre()+"\""),x->x.getEdad())
        );
        System.out.println(alumnosMap);
    }
    public static void main(String[] args) {
        System.out.println(bienvenida);
        List<Alumno> alumnos = List.of(
            new Alumno("Homero", "Simpson", obtenerFecha(35)),
            new Alumno("Marge", "Simpson", obtenerFecha(30)),
            new Alumno("Bart", "Simpson", obtenerFecha(10)),
            new Alumno("Lisa", "Simpson", obtenerFecha(8)),
            new Alumno("Maggie", "Simpson", obtenerFecha(2)));
        generarMap(alumnos);
    }
}
