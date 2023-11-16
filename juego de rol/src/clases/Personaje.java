package clases;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombre;
    private int nivel;
    private int puntos_de_vida;
    private int ataque = 1;
    private int defensa = 0;
    private Inventario inventario;
    private PoolArma poolArma;
    Random random = new Random();
    public Personaje(){
    }
    public void atacar (Personaje objetivo){
        int maxDamage = inventario.getEquipado_maximo();
        int minDamage = inventario.getEquipado_minimo();
        this.ataque=random.nextInt(maxDamage - minDamage + 1) + minDamage;
        int danio_infligido = this.ataque - objetivo.defensa;
        if (danio_infligido > 0) {
            puntos_de_vida = puntos_de_vida - danio_infligido;
            System.out.println(nombre + "te hicieron " + danio_infligido + " te quedan " + puntos_de_vida + " puntos de vida");
        } else {
            System.out.println("La CA de " + objetivo.nombre + " es demasiado alta, no se inflige daño.");
        }
    }
    public void  equipar_arma (Inventario arma){
        Scanner sc = new Scanner(System.in);
        System.out.print("1 2 3");
        int opcion = sc.nextInt();
        inventario.arma_a_equipar(opcion);
    }
    public void setPersonaje(){
        List<String> nombresArmas = new ArrayList<>();
        nombresArmas.add("Opcion 1 Espada de hierro");
        nombresArmas.add("Opcion 2 Arco largo");
        nombresArmas.add("Opcion 3 Daga afilada");
        nombresArmas.add("Opcion 4 Maza de guerra");
        nombresArmas.add("Opcion 5 Varita mágica");
        nombresArmas.add("Opcion 6 Hacha de doble filo");
        nombresArmas.add("Opcion 7 Lanza puntiaguda");
        nombresArmas.add("Opcion 8 Bastón encantado");
        nombresArmas.add("Opcion 9 Espadón gigante");
        nombresArmas.add("Opcion 10 Cuchillo arrojadizo");

        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        System.out.print("ingrese su nombre: ");
        this.nombre= sc.nextLine();
        System.out.print("ingrese su nivel: ");
        this.nivel=scInt.nextInt();
        System.out.print("ingrese sus puntos_de_vida: ");
        this.puntos_de_vida=scInt.nextInt();
        System.out.print("ingrese su defensa: ");
        this.defensa=scInt.nextInt();

        System.out.println("elije 3 armas para usar, las opciones son: ");
        int opcion = 0;
        for (String nombreArma : nombresArmas) {
            System.out.println(nombreArma);
        }
        for (int i = 0; i < 3; i++) {
            if (i == 0){
                System.out.println("ingrese el primer arma: ");
                opcion = scInt.nextInt();
            } else if (i == 1) {
                System.out.println("ingrese el segundo arma: ");
                opcion = scInt.nextInt();
            } else {
                System.out.println("ingrese el terccer arma: ");
                opcion = scInt.nextInt();
            }
            swich_equipado(opcion,i);
        }
    }

    public int getPuntos_de_vida() {
        return puntos_de_vida;
    }
    public void  swich_equipado(int opcion, int i){
        switch (opcion) {
            case 1:
                if (i == 0){
                    inventario.setArma1(poolArma.getListaArmas(opcion));
                } else if (i == 1) {
                    inventario.setArma2(poolArma.getListaArmas(opcion));
                } else {
                    System.out.println("ingrese el terccer arma: ");
                    opcion = scInt.nextInt();
                }
                inventario.setArma1(poolArma.getListaArmas(opcion));
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            default:
                System.out.println("Número fuera de rango");
                break;
        }
    }
}
