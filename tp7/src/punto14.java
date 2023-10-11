import java.util.Scanner;
public class punto14 {

    public static void main(String[] args) {
        int[] arr = new int[20];
        Scanner scanner = new Scanner(System.in);

        // Carga de elementos en el arreglo
        System.out.println("Ingrese los 20 elementos del arreglo:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Mostrar el arreglo original
        System.out.println("Arreglo original:");
        printArray(arr);

        // Solicitar la forma de ordenar (ASCENDENTE o DESCENDENTE)
        System.out.print("¿Cómo desea ordenar el arreglo (ASCENDENTE o DESCENDENTE)? ");
        String orden = scanner.next().toUpperCase();

        // Solicitar el método de ordenamiento (INSERCIÓN, BURBUJA o SELECCIÓN)
        System.out.print("Elija el método de ordenamiento (INSERCIÓN, BURBUJA o SELECCIÓN): ");
        String metodo = scanner.next().toUpperCase();

        // Aplicar el método de ordenamiento seleccionado
        if (orden.equals("ASCENDENTE")) {
            if (metodo.equals("INSERCIÓN")) {
                insertionSortAscending(arr);
            } else if (metodo.equals("BURBUJA")) {
                bubbleSortAscending(arr);
            } else if (metodo.equals("SELECCIÓN")) {
                selectionSortAscending(arr);
            }
        } else if (orden.equals("DESCENDENTE")) {
            if (metodo.equals("INSERCIÓN")) {
                insertionSortDescending(arr);
            } else if (metodo.equals("BURBUJA")) {
                bubbleSortDescending(arr);
            } else if (metodo.equals("SELECCIÓN")) {
                selectionSortDescending(arr);
            }
        }

        // Mostrar el arreglo ordenado
        System.out.println("Arreglo ordenado " + orden + " con el método " + metodo + ":");
        printArray(arr);
    }

    public static void insertionSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void insertionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void selectionSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
