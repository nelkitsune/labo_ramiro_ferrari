package perro;
import java.util.Scanner;
public class cuentaBancaria {
    private int saldo = 0;
    private int numero_de_cuenta = 11221;

    public int mostrar_saldo(){
        return saldo;
    }
    public void restar_saldo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese la cantidad de plata que desea retirar: ");
        int retiro = sc.nextInt();
        if (retiro > saldo){
            System.out.println("desea retirar mas dinero que el que tiene");
            System.out.println("usted tiene $" + mostrar_saldo());
        } else {
            saldo = saldo - retiro;
            System.out.println("dinero retirado de forma efectiva");
            System.out.println("usted ahora tiene $" + mostrar_saldo());
        }
    }
    public void sumar_saldo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese la cantidad de plata que desea ingresar: ");
        int ingreso = sc.nextInt();
        saldo = saldo + ingreso;
        System.out.println("usted ahora tiene $" + mostrar_saldo());
    }
}
