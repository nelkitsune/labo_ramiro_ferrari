import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("elija el punto: ");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1 -> punto_1();
                case 2 -> punto_2();
                case 3 -> punto_3();
                case 4 -> punto_4();
                case 5 -> punto_5();
            }
        }
    }
    public static void punto_1(){
        int [] enteros = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
        }
    }
    public static void punto_2(){
        int [] enteros = {1,2,3,4,5,6,7,8,9,10};
        int resultado = 0;
        for (int i = 0; i < enteros.length; i++) {
            resultado += enteros[i];
        }
        System.out.println("el resultado de la suma es " + resultado);
    }
    public static void punto_3(){
        int [] enteros = {1,4,5,63,-3,53,52,56,89,23};
        int mayor = 0;
        for (int i = 0; i < enteros.length; i++) {
            if (i == 0){
                mayor = enteros[i];
            } else if (enteros[i] > mayor) {
                mayor = enteros[i];
            }
        }
        System.out.println("el numero mayor es " + mayor);
    }

    public static void punto_4() {
        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(1); enteros.add(4);enteros.add(5);enteros.add(63);enteros.add(-3);enteros.add(53);enteros.add(52);enteros.add(56);enteros.add(89);enteros.add(24);enteros.add(0);enteros.add(28);

        for (int i = 0; i < enteros.size(); i++) {
            if (enteros.get(i) % 2 == 0){
                enteros.remove(i);
            }
        }
        for (int i = 0; i < enteros.size(); i++) {
            System.out.print(enteros.get(i) + ",");
        }
        System.out.println("");
    }
    public static void punto_5(){
        String [] palabras = {"jose","ramiro","miguel","lopez"};
        String [] palabras2 = new String[4];
        for (int i = 0; i < 4; i++) {
            palabras2[i] = palabras[3-i];
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(palabras2[i] + ",");
        }
        System.out.println("");
    }
}