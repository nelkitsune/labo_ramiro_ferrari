public class punto12 {
        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6, 7,8,9};

            System.out.println("Arreglo original:");
            printArray(arr);

            mergeSort(arr);

            System.out.println("Arreglo ordenado:");
            printArray(arr);
        }

        public static void mergeSort(int[] arr) {
            int n = arr.length;
            if (n > 1) {
                int mid = n / 2;
                int[] left = new int[mid];
                int[] right = new int[n - mid];

                for (int i = 0; i < mid; i++) {
                    left[i] = arr[i];
                }

                for (int i = mid; i < n; i++) {
                    right[i - mid] = arr[i];
                }

                mergeSort(left);
                mergeSort(right);

                int i = 0, j = 0, k = 0;

                while (i < left.length && j < right.length) {
                    if (left[i] < right[j]) {
                        arr[k++] = left[i++];
                    } else {
                        arr[k++] = right[j++];
                    }
                }

                while (i < left.length) {
                    arr[k++] = left[i++];
                }

                while (j < right.length) {
                    arr[k++] = right[j++];
                }
            }
        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
