import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 4, 3, 1, 6, 8, 7, 9, 10};
        Arrays.sort(num_list);
        for (int i : num_list) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        Integer[] num_list2 = {5, 2, 4, 3, 1, 6, 8, 7, 9, 10};
        Arrays.sort(num_list2, Comparator.reverseOrder());
        for (Integer i : num_list2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        double[] num_list3 = {5.2, 2.3, 4.4, 3.3, 1.4, 6.5, 8.6, 7.7, 9.8, 10.9};
        Arrays.sort(num_list3);
        for (double i : num_list3) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        Double[] num_list4 = {5.3, 2.3, 4.2, 3.1, 1.4, 6.5, 8.6, 7.4, 9.2, 10.1};
        Arrays.sort(num_list4, Comparator.reverseOrder());
        for (Double i : num_list4) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        String[] cadena_list = {"bueno","avion","picado","zapato"};
        Arrays.sort(cadena_list);
        for (String i : cadena_list){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        String[] cadena_list2 = {"bueno","avion","picado","zapato"};
        Arrays.sort(cadena_list2, Comparator.reverseOrder());
        for (String i : cadena_list2) {
            System.out.print(i + " ");
        }
        int aux;
        for (int i = 0 ; i < num_list.length - 1;  i++){
            for (int j = 0 ; j < num_list.length - i - 1 ; j++){
                if (num_list[ j + 1] < num_list[j]){
                    aux = num_list[j + 1];
                    num_list[j+1]= num_list[j];
                    num_list[j] = aux;
                }
            }
        }
        for (int i : num_list) {
            System.out.print(i + " ");
        
        }
        int[] num_list5 = {5, 2, 4, 3, 1, 6, 8, 7, 9, 10};
        int menor,pos,tmp;
        for (int i = 0; i < num_list5.length - 1; i++) {
            menor = num_list5[i];
            pos = i;
            for (int j = i + 1; j < num_list5.length; j++){
                if (num_list5[j] < menor) {
                    menor = num_list5[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = num_list5[i];
                num_list5[i] = num_list5[pos];
                num_list5[pos] = tmp;
            }
        }
        for (int i : num_list5) {
            System.out.print(i + " ");

        }
        int[] num_list6 = {11, 12, 14, 13, 21, 16, 18, 17, 19, 10};
        for (int p = 1; p < num_list6.length; p++){
            aux = num_list6[p];
            int j = p - 1;
            while ((j >= 0) && (aux < num_list6[j])){
                num_list6[j + 1] = num_list6[j];
                j--;
            }
            num_list6[j + 1] = aux;
        }
        System.out.println(" ");
        for (int i : num_list6) {
            System.out.print(i + " ");

        }
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Arreglo original:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("Arreglo ordenado:");
        printArray(arr);
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Llenar los arreglos 'left' y 'right'
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        // Llamadas recursivas para ordenar las dos mitades
        mergeSort(left);
        mergeSort(right);

        // Combinar las mitades ordenadas
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;

        // Combinar 'left' y 'right' en 'arr'
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copiar los elementos restantes de 'left' (si los hay)
        while (i < nL) {
            arr[k++] = left[i++];
        }

        // Copiar los elementos restantes de 'right' (si los hay)
        while (j < nR) {
            arr[k++] = right[j++];
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    }

