package perro;
import java.util.Scanner;
public class estudiante {
    private String nombre;
    private int edad;
    private int numero_de_identificacion;

    public void cambiar_valor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el nombre del estudiante: ");
        nombre = sc.next();
        System.out.print("ingrese la edad del estudiante: ");
        edad = sc.nextInt();
        System.out.print("ingrese el numero de identificacion del estudiante: ");
        numero_de_identificacion = sc.nextInt();

    }
    public String mostrar_valor_estudiante (){
        return "el alumno " + nombre + " tiene una edad de " + edad + " y su numero de identificacion es " + numero_de_identificacion;
    }
}
