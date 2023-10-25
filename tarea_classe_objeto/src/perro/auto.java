package perro;

import java.util.Scanner;

public class auto {
    private String  marca = "ferrari";
    private String  modelo = "2cbt";
    private int anio_fabri = 2002;
    private  int velocidad = 0;

    public String velocidad_actual(){
        return "la velocidad actual es de " + velocidad;
    }
    public void freno(){
        Scanner sc = new Scanner(System.in);
        System.out.print("cuanto decea frenar en km: ");
        int freno = sc.nextInt();
        if (freno > velocidad){
            System.out.println("frenaria mas de lo que usted va");
            System.out.println("usted va a km/h" + velocidad_actual());
        } else {
            velocidad = velocidad - freno;
            System.out.println("frenada de forna efectiva");
            System.out.println("usted va a km/h"  + velocidad_actual());
        }
    }
    public void acelerar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese la cantidad que desea acelerar: ");
        int aceleracion = sc.nextInt();
        velocidad = velocidad + aceleracion;
        System.out.println("usted va a km/h" + velocidad_actual());
    }
}
