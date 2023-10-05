import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //1
        double contador_pos = 0;
        double contador_neg = 0;
        int[] array_1 = new int[10];
        for (int i = 0; i < array_1.length; i++) {
            System.out.println("ingrese numeros: ");
            array_1[i] = sc.nextInt();
        }
        double acumulador_pos = 0;
        double acumulador_neg = 0;
        for (int j = 0; j < array_1.length; j++) {
            if (array_1[j] >= 0) {
                acumulador_pos = acumulador_pos + array_1[j];
                contador_pos++;
            } else if (array_1[j] < 0) {
                acumulador_neg = acumulador_neg + array_1[j];
                contador_neg++;
            }
        }
        System.out.println("el resultado de los positivos es= " + acumulador_pos / contador_pos);
        System.out.println("el resultado de los negativo es= " + acumulador_neg / contador_neg);

         */
        //2
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int suma = 0;
        int contador = 0;
        for (int i = 0; i < 10; i += 2) {
            suma += numeros[i];
            contador++;
        }

        double media = (double) suma / contador;

        System.out.println("La media de los números en las posiciones pares es: " + media);
        //3
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = sc.nextInt();

        double[] notas = new double[numAlumnos];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double sumaNotas = 0;
        for (int i = 0; i < numAlumnos; i++) {
            sumaNotas += notas[i];
        }
        double media2 = sumaNotas / numAlumnos;

        System.out.println("La nota media del grupo es: " + media2);

        System.out.println("Alumnos con notas superiores a la media:");
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] > media2) {
                System.out.println("Alumno " + (i + 1) + ": Nota " + notas[i]);
            }
        }
        //4
        int[] Pares = new int[20];
        int num = 2;

        for (int i = 0; i < 20; i++) {
            Pares[i] = num;
            num += 2;
        }

        System.out.println("Contenido del array Pares:");

        for (int i = 0; i < 20; i++) {
            System.out.println("Pares[" + i + "] = " + Pares[i]);
        }
        //5
        int[] numeros2 = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros2[i] = sc.nextInt();
        }

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros2[i] > 0) {
                positivos++;
            } else if (numeros2[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);

        //6
        int[] numeros3 = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número entero: ");
            numeros3[i] = sc.nextInt();
        }

        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        for (int i = 0; i < 10; i++) {
            if (numeros3[i] > 0) {
                sumaPositivos += numeros3[i];
                contadorPositivos++;
            } else if (numeros3[i] < 0) {
                sumaNegativos += numeros3[i];
                contadorNegativos++;
            }
        }

        double mediaPositivos = (double) sumaPositivos / contadorPositivos;
        double mediaNegativos = (double) sumaNegativos / contadorNegativos;

        System.out.println("Media de valores positivos: " + mediaPositivos);
        System.out.println("Media de valores negativos: " + mediaNegativos);

        //7
        System.out.print("Ingrese la cantidad de personas: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El número de personas debe ser un entero positivo.");
            sc.close();
            return;
        }

        double[] alturas = new double[n];
        double sumaAlturas = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la altura de la persona " + (i + 1) + " en centímetros: ");
            alturas[i] = sc.nextDouble();
            sumaAlturas += alturas[i];
        }

        double alturaMedia = sumaAlturas / n;
        int personasAltas = 0;
        int personasBajas = 0;

        for (int i = 0; i < n; i++) {
            if (alturas[i] > alturaMedia) {
                personasAltas++;
            } else {
                personasBajas++;
            }
        }

        System.out.println("Altura media: " + alturaMedia + " centímetros");
        System.out.println("Personas con altura superior a la media: " + personasAltas);
        System.out.println("Personas con altura inferior o igual a la media: " + personasBajas);

        //8

        String[] nombres = new String[20];
        double[] sueldos = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = sc.nextDouble();
            sc.nextLine();
        }

        int indiceEmpleadoMasGanador = 0;
        double sueldoMasAlto = sueldos[0];

        for (int i = 1; i < 20; i++) {
            if (sueldos[i] > sueldoMasAlto) {
                sueldoMasAlto = sueldos[i];
                indiceEmpleadoMasGanador = i;
            }
        }

        System.out.println("El empleado que más gana es:");
        System.out.println("Nombre: " + nombres[indiceEmpleadoMasGanador]);
        System.out.println("Sueldo: " + sueldos[indiceEmpleadoMasGanador]);


        //9
        int[] numerosAleatorios = generarNumerosAleatorios(1, 100, 10);

        System.out.println("Números aleatorios generados:");
        for (int numero : numerosAleatorios) {
            System.out.println(numero);
        }
    }

    public static int[] generarNumerosAleatorios(int desde, int hasta, int tamanio) {
        int[] numerosAleatorios = new int[tamanio];
        Random rand = new Random();

        for (int i = 0; i < tamanio; i++) {
            int numeroAleatorio = rand.nextInt(hasta - desde + 1) + desde;
            numerosAleatorios[i] = numeroAleatorio;
        }

        return numerosAleatorios;
    }
}

class SumaMatrices {
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        int[][] sumaMatrices = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz resultante de la suma:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(sumaMatrices[i][j] + " ");
            }
            System.out.println();
        }
        //11
        int[][] matrizOriginal = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int filas2 = matrizOriginal.length;
        int columnas2 = matrizOriginal[0].length;

        int[][] matrizTranspuesta = new int[columnas2][filas2];

        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        System.out.println("Matriz Original:");
        imprimirMatriz(matrizOriginal);

        System.out.println("\nMatriz Transpuesta:");
        imprimirMatriz(matrizTranspuesta);
    }

    public static void imprimirMatriz(int[][] matriz) {
        int filas3 = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas3; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
