import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //punto_1();
        //punto_2();
        //punto_3();
        punto_4();
    }

    public static void punto_1(){
        Scanner sc = new Scanner(System.in);
        int [] jose = new int [5];
        for (int i = 0; i<jose.length;i++){
            System.out.print("ingrese el numero de la pocicion " + (i+1) + ": ");
            jose[i] = sc.nextInt();
        }
        for (int i = 0; i < jose.length; i++) {
            System.out.println(jose[i]);
        }
    }
    public static void punto_2(){
        Scanner sc = new Scanner(System.in);
        int [] punto_2_list = new int [5];
        for (int i = 0; i<punto_2_list.length;i++){
            System.out.print("ingrese el numero de la pocicion " + (i+1) + ": ");
            punto_2_list[i] = sc.nextInt();
        }
        for (int i = 0; i < punto_2_list.length; i++) {
            System.out.print(punto_2_list[i] +",");
        }
    }
    public static void punto_3(){
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int [] punto_3_list = new int [5];
        for (int i = 0; i<punto_3_list.length;i++){
            System.out.print("ingrese el numero de la pocicion " + (i+1) + ": ");
            punto_3_list[i] = sc.nextInt();
        }
        for (int i = 0; i < punto_3_list.length; i++) {
            suma += punto_3_list[i];

        }
        System.out.println("el resultado de la suma de todos los elementos de la lista es " + suma);
    }
    public static void punto_4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el tamaño del primer arreglo: ");
        int aux_1 = sc.nextInt();
        System.out.print("ingrese el tamaño del segundo arreglo: ");
        int aux_2 = sc.nextInt();
        int [] punto_4_list_a = new int [aux_1];
        int [] punto_4_list_b = new int [aux_2];
        for (int i = 0; i<punto_4_list_a.length;i++){
            System.out.print("ingrese el numero de la pocicion " + (i+1) + ": ");
            punto_4_list_a[i] = sc.nextInt();
        }
        for (int i = 0; i < punto_2_list.length; i++) {
            System.out.print(punto_2_list[i] +",");
        }

    }
}