package clases;

import java.util.Scanner;


public class Inventario {
    private Arma arma1;
    private Arma arma2;
    private Arma arma3;
    private Arma equipado;



    public Inventario() {
    }

    public void arma_a_equipar (int opcion){
        Scanner sc = new Scanner(System.in);
        switch (opcion){
            case 1: equipado = arma1; break;
            case 2: equipado = arma2;break;
            case 3: equipado = arma3;break;
            default:
                System.out.print("error vuelva a ingresar el numero: ");
                int opcion_error = sc.nextInt();
                arma_a_equipar(opcion_error);
                break;
        }
    }

    public int getEquipado_maximo() {
        return equipado.getDanio_maximo();
    }
    public int getEquipado_minimo() {
        return equipado.getDanio_minimo();
    }

    public void setArma1(Arma arma1) {
        this.arma1 = arma1;
    }

    public void setArma2(Arma arma2) {
        this.arma2 = arma2;
    }
    
    public void setArma3(Arma arma3) {
        this.arma3 = arma3;
    }
}
