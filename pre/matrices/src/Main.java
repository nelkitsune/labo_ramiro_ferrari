import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] pesp = {1,2,3,4};
        int [][] ar = {{3,5}, {2,3},{4,5}};
        int pepe = sc.nextInt();
        switch (pepe){
            case 1 -> punto_1();
            case 2 -> punto_2();
            case 3 -> punto_3();
        }
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void punto_1 () {
        Scanner sc = new Scanner(System.in);
        int [][] matriz_punto_1 = new int[3][3];
        System.out.println("ingrese 9 numeros");
        for (int i = 0; i < matriz_punto_1.length; i++) {
            for (int j = 0; j < matriz_punto_1[i].length; j++) {
                matriz_punto_1[i][j] = sc.nextInt();
            }
        }
        imprimirMatriz(matriz_punto_1);
    }
    public static void punto_2(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("ingrese el tamaño de la matriz cuadrada: ");
        int tamanio = sc.nextInt();
        int [][] matriz_punto_2 = new int[tamanio][tamanio];
        for (int i = 0; i < matriz_punto_2.length; i++) {
            for (int j = 0; j < matriz_punto_2[i].length; j++) {
                matriz_punto_2[i][j]= random.nextInt(100);
            }
        }
        imprimirMatriz(matriz_punto_2);
    }
    public static void punto_3(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("ingrese el tamaño fila de la matriz rectangular: ");
        int tamanio_a = sc.nextInt();
        System.out.println("ingrese el tamaño columna de la matriz rectangular: ");
        int tamanio_b = sc.nextInt();
            int [][] matriz_punto_3 = new int[tamanio_a][tamanio_b];
            for (int i = 0; i < matriz_punto_3.length; i++) {
                for (int j = 0; j < matriz_punto_3[i].length; j++) {
                    matriz_punto_3[i][j]= random.nextInt(100);
                }
            }
            imprimirMatriz(matriz_punto_3);
    }
    public static void punto_4(){
        Scanner sc = new Scanner(System.in);
        int [][] matriz_punto_4 = new int[3][3];
        System.out.println("ingrese 9 numeros");
        for (int i = 0; i < matriz_punto_4.length; i++) {
            for (int j = 0; j < matriz_punto_4[i].length; j++) {
                matriz_punto_4[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz_punto_4.length; i++) {
            for (int j = 0; j < matriz_punto_4[i].length; j++) {
                System.out.println("sjadad");
            }

        }
    }

    public static void punto_26(){
      String[][] producto = {
              {"manzana","pera","banana","maracuya","kiwi"},
              {"20","30","40","50","60"}
      };//
      String[][] cantidad_vendida = {
              {"manzana","pera","banana","maracuya","kiwi"},
              {"20","35","2","23","44"},
              {"30","31","24","3","43"},
              {"2","20","23","60","5"},
              {"11","45","65","3","34"}
      };

      }
    }

}