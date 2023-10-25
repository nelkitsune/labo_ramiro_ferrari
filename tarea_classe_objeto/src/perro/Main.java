package perro;
import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean condicion = true;
        Scanner sc = new Scanner(System.in);
        // 1 2 3
        perro_raza bonny = new perro_raza();
        System.out.println(bonny.ladrar());
        //4 5
        circulo cuadrado = new circulo();
        System.out.println(cuadrado.area());
        System.out.println(cuadrado.circuferencia());
        // 6 7
        estudiante con_es = new estudiante();
        con_es.cambiar_valor();
        System.out.println(con_es.mostrar_valor_estudiante());
        // 8 9
        libro tanya = new libro();
        System.out.println(tanya.mostrar_libro());
        //10 11
        cuentaBancaria cuenta = new cuentaBancaria();
        while (condicion){
            System.out.print("bienvenido al cajero, ingrese 1 para ver su saldo, 2 para ingresar dinero, 3 para retirarlo y 4 para salir: ");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1 -> System.out.println("usted tiene $"+cuenta.mostrar_saldo()+" en su cuenta bancaria");
                case 2-> cuenta.sumar_saldo();
                case 3-> cuenta.restar_saldo();
                case 4 -> {
                    condicion = false;
                    System.out.println("hasta la proxima");
                }
                default -> {
                    continue;
                }
            }
        }
        //12
        rectangulo jose = new rectangulo();
        System.out.println("el area es: "+ jose.area());
        System.out.println("el perimetro es: " + jose.perimetro());

        //13 14
        condicion = true;
        auto ferrari = new auto();
        while (condicion){
            System.out.print("bienvenido al auto, ingrese 1 para ver su velociodad, 2 para acelerar, 3 para frenar y 4 para salir: ");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1 -> System.out.println(ferrari.velocidad_actual());
                case 2-> ferrari.acelerar();
                case 3-> ferrari.freno();
                case 4 -> {
                    condicion = false;
                    System.out.println("hasta la proxima");
                }
                default -> {
                    continue;
                }
            }
        }
        //15
        pelicula tanya_degurechaf = new pelicula();
        System.out.println(tanya_degurechaf.mostrar_pelicula());

    }
}