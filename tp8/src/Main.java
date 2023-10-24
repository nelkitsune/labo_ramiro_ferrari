import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean matriz_bol;
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = i + j + 3 + 5 + i + j * 2;
            }
        }
        int[][] matriz2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j] = i + j + 3 + 5;
            }
        }
        int[][] matriz3 = new int[3][3];
        matriz3 = suma_matriz(matriz, matriz2);
        mostrar_matriz(matriz3);
        matriz3 = multipli_matriz(matriz, matriz2);
        mostrar_matriz(matriz3);
        matriz3 = matriz_trans(matriz);
        mostrar_matriz(matriz);
        mostrar_matriz(matriz3);
        matriz_bol = simetrica_matrix(matriz);
        if (matriz_bol) {
            System.out.println("es simetrico");
        } else {
            System.out.println("no es simetrico");
        }
        //5
        double[] miVector = {1.0, 2.0, 3.0, 4.0};
        double escalar = 2.0;
        double[] resultado = productoEscalar(miVector, escalar);
        System.out.print("Resultado: ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }

        //6
        int suma_mat = suma_de_una_matriz(matriz);
        System.out.println(suma_mat);

        //7
        int pos = 0;
        int[] list_max_men = {2, 3, 4, 1, 8, 6, 123, 10, 23, 41, 88};
        Integer max = null;
        for (int i = 0; i < 11; i++) {
            if (max != null) {
                if (list_max_men[i] > max) {
                    max = list_max_men[i];
                    pos = i;
                }
            } else {
                max = list_max_men[0];
            }
        }
        System.out.println("numero maximo" + " " + max);
        System.out.println("posicion" + " " + pos);
        //8
        System.out.print("ingrese que fila desa sumar: ");
        int fila = sc.nextInt();
        System.out.println(suma_de_una_fila(matriz, fila - 1));
        //9
        boolean condicion = true;
        int[][] matriz_diagonal = {
                {1, 0, 0},
                {0, 2, 0},
                {0, 0, 3}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue;
                } else if (matriz_diagonal[i][j] == 0) {
                    condicion = true;
                } else {
                    condicion = false;
                    break;
                }

            }
            if (condicion == false) break;
        }
        if (condicion = true) {
            System.out.println("es una matriz diagonal");
        } else {
            System.out.println("no es una matriz diagonal");
        }

        //10
        int n = 4;
        int[][] matriz4 = matrizIdentidad(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz4[i][j] + " ");
            }
            System.out.println();
        }
        //11
        contarParesImpares(matriz);
        //12
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        rotarMatriz90Grados(matriz);

        System.out.println("Matriz rotada 90 grados en sentido horario:");
        imprimirMatriz(matriz);
        //13
        int valorBuscado = 2;
        int cantidad = contarValorEnMatriz(matriz, valorBuscado);

        System.out.println("El valor " + valorBuscado + " aparece " + cantidad + " veces en la matriz.");
        //14
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] matrizInvertida = invertirFilas(matriz);

        System.out.println("Matriz con filas invertidas:");
        imprimirMatriz(matrizInvertida);
        //15
        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        int suma = sumaDiagonales(matriz);

        System.out.println("Suma de todas las diagonales: " + suma);

        //16
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] inversa = obtenerInversa(matriz);

        if (inversa == null) {
            System.out.println("La matriz no tiene inversa.");
        } else {
            System.out.println("Matriz inversa:");
            imprimirMatriz(inversa);
        }
        //17
        int[] minimos = encontrarMinimosPorFila(matriz);

        System.out.println("Valores mínimos por fila:");

        for (int i = 0; i < minimos.length; i++) {
            System.out.println("Fila " + i + ": " + minimos[i]);
        }

        //18
            int[][] matrizA = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            int[][] matrizB = {
                    {7, 8},
                    {9, 10},
                    {11, 12}
            };

            int[][] resultadoa = productoMatrices(matrizA, matrizB);

            System.out.println("Matriz A:");
            imprimirMatriz2(matrizA);

            System.out.println("Matriz B:");
            imprimirMatriz2(matrizB);

            if (resultadoa != null) {
                System.out.println("Producto de matrices:");
                imprimirMatriz2(resultadoa);
            } else {
                System.out.println("La multiplicación no es posible.");
            }
        }
    public static int[][] suma_matriz(int[][] mat, int[][] mat_2) {
        int[][] matriz3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3[i][j] = mat[i][j] + mat_2[i][j];
            }
        }
        return matriz3;
    }

    public static int[][] multipli_matriz(int[][] mat, int[][] mat_2) {
        int[][] matriz3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3[i][j] = mat[i][j] * mat_2[i][j];
            }
        }
        return matriz3;
    }

    public static void mostrar_matriz(int[][] mat) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int[][] matriz_trans(int[][] mat) {
        int[][] matriz3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz3[i][j] = mat[j][i];
            }
        }
        return matriz3;
    }

    public static boolean simetrica_matrix(int[][] mat) {
        int[][] matriz_tr = new int[3][3];
        matriz_tr = matriz_trans(mat);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i][j] != matriz_tr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static double[] productoEscalar(double[] vector, double escalar) {
        int n = vector.length;
        double[] resultado = new double[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = vector[i] * escalar;
        }
        return resultado;
    }

    public static int suma_de_una_matriz(int[][] mat) {
        int resultado=0 ;
        for (int i = 0; i < 3 ; i++){
            for ( int j = 0 ; j < 3 ; j++){
                resultado = resultado + mat[i][j];
            }
        }
        System.out.println();
        return resultado;
    }
    public static int suma_de_una_fila(int[][] mat, int fila){
        int suma = 0;
        for (int i = 0 ;i < 3; i++ ){
            suma += mat[fila][i];
        }
        return suma;
    }
    public static int[][] matrizIdentidad(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        return matriz;
    }
    public static void contarParesImpares(int[][] matriz) {
        int pares = 0;
        int impares = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                int elemento = matriz[fila][columna];
                if (elemento % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("Cantidad de elementos pares: " + pares);
        System.out.println("Cantidad de elementos impares: " + impares);
    }
    public static void rotarMatriz90Grados(int[][] matriz) {
        int n = matriz.length;

        // Crear una matriz temporal para almacenar la matriz rotada
        int[][] matrizRotada = new int[n][n];

        // Realizar la rotación
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[i][j] = matriz[n - 1 - j][i];
            }
        }

        // Copiar la matriz rotada a la matriz original
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = matrizRotada[i][j];
            }
        }
    }
    public static void imprimirMatriz(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int contarValorEnMatriz(int[][] matriz, int valorBuscado) {
        int contador = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == valorBuscado) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public static int[][] invertirFilas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizInvertida = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[filas - 1 - i][j] = matriz[i][j];
            }
        }

        return matrizInvertida;
    }
    public static int sumaDiagonales(int[][] matriz) {
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalSecundaria += matriz[i][n - 1 - i];
        }

        int sumaTotal = sumaDiagonalPrincipal + sumaDiagonalSecundaria;
        return sumaTotal;
    }
    public static int[][] obtenerInversa(int[][] matriz) {
        int n = matriz.length;

        // Comprobar si la matriz es cuadrada (3x3)
        if (n != 3 || matriz[0].length != 3) {
            // La matriz no es 3x3, no se puede calcular la inversa
            return null;
        }

        // Calcular el determinante
        int det = calcularDeterminante(matriz);

        // Comprobar si el determinante es cero (la matriz no tiene inversa)
        if (det == 0) {
            return null;
        }

        // Calcular la matriz adjunta
        int[][] adjunta = calcularMatrizAdjunta(matriz);

        // Calcular la matriz inversa
        int[][] inversa = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inversa[i][j] = adjunta[i][j] / det;
            }
        }

        return inversa;
    }

    public static int calcularDeterminante(int[][] matriz) {
        // Implementa la fórmula para calcular el determinante de una matriz 3x3
        // En este caso, la fórmula específica es:
        // det = a(ei - fh) - b(di - fg) + c(dh - eg)

        int a = matriz[0][0];
        int b = matriz[0][1];
        int c = matriz[0][2];
        int d = matriz[1][0];
        int e = matriz[1][1];
        int f = matriz[1][2];
        int g = matriz[2][0];
        int h = matriz[2][1];
        int i = matriz[2][2];

        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }

    public static int[][] calcularMatrizAdjunta(int[][] matriz) {
        int n = matriz.length;
        int[][] adjunta = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Calcular el cofactor para cada elemento de la matriz
                int[][] cofactor = calcularCofactor(matriz, i, j);
                // Calcular el determinante del cofactor
                int cofactorDeterminante = calcularDeterminante(cofactor);
                // Asignar el cofactor a la matriz adjunta
                adjunta[i][j] = cofactorDeterminante;
            }
        }

        return adjunta;
    }

    public static int[][] calcularCofactor(int[][] matriz, int filaExcluida, int columnaExcluida) {
        int n = matriz.length - 1;
        int[][] cofactor = new int[n][n];

        int filaDestino = 0;
        int columnaDestino = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            if (fila != filaExcluida) {
                for (int columna = 0; columna < matriz[fila].length; columna++) {
                    if (columna != columnaExcluida) {
                        cofactor[filaDestino][columnaDestino] = matriz[fila][columna];
                        columnaDestino++;
                    }
                }
                filaDestino++;
                columnaDestino = 0;
            }
        }

        return cofactor;
    }
    public static int[] encontrarMinimosPorFila(int[][] matriz) {
        int filas = matriz.length;
        int[] minimos = new int[filas];

        for (int i = 0; i < filas; i++) {
            int minimo = matriz[i][0]; // Inicializar el mínimo con el primer elemento de la fila

            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j]; // Actualizar el mínimo si se encuentra un valor menor
                }
            }

            minimos[i] = minimo; // Almacenar el mínimo de la fila en el arreglo de mínimos
        }

        return minimos;
    }

    public static int[][] productoMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        // Verificar si la multiplicación es posible
        if (columnasA != filasB) {
            // La multiplicación no es posible, devolver una matriz nula
            return null;
        }

        // Crear la matriz resultado
        int[][] resultado = new int[filasA][columnasB];

        // Calcular el producto de matrices
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                int producto = 0;
                for (int k = 0; k < columnasA; k++) {
                    producto += matrizA[i][k] * matrizB[k][j];
                }
                resultado[i][j] = producto;
            }
        }

        return resultado;
    }
    public static void imprimirMatriz2(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}



