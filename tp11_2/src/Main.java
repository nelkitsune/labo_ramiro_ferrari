import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Double> numeros = new ArrayList<>();

            // Leer 20 números decimales ingresados por el usuario
            for (int i = 0; i < 20; i++) {
                System.out.print("Ingrese un número decimal: ");
                double numero = scanner.nextDouble();
                numeros.add(numero);
            }

            // Determinar y mostrar el mayor número en el arreglo
            double mayor = encontrarMayor(numeros);
            System.out.println("El mayor número es: " + mayor);

            // Determinar y mostrar el menor número en el arreglo
            double menor = encontrarMenor(numeros);
            System.out.println("El menor número es: " + menor);

            // Calcular y mostrar el rango de los elementos en el arreglo
            double rango = mayor - menor;
            System.out.println("El rango de los números es: " + rango);

            scanner.close();




            //5
                ArrayList<Integer> numeros2 = new ArrayList<>();
                Random rand = new Random();
                int sumatoria = 0;
                int promedio;
                int iguales = 0;
                int mayores = 0;
                int menores = 0;

                // Generar 20 números enteros positivos pares entre 1 y 100 y almacenarlos en el ArrayList
                for (int i = 0; i < 20; i++) {
                    int numero = rand.nextInt(50) * 2 + 1; // Genera números pares entre 1 y 100
                    numeros2.add(numero);
                    sumatoria += numero;
                }

                // Calcular el promedio aritmético
                promedio = sumatoria / numeros.size();

                // Contar cuántos números son iguales, mayores o menores que el promedio
                for (double numero : numeros) {
                    if (numero == promedio) {
                        iguales++;
                    } else if (numero > promedio) {
                        mayores++;
                    } else {
                        menores++;
                    }
                }

                // Mostrar los resultados
                System.out.println("Números generados: " + numeros);
                System.out.println("Promedio aritmético: " + promedio);
                System.out.println("Números iguales al promedio: " + iguales);
                System.out.println("Números mayores que el promedio: " + mayores);
                System.out.println("Números menores que el promedio: " + menores);
            }

        public static double encontrarMayor(ArrayList<Double> numeros) {
            double mayor = numeros.get(0);
            for (double numero : numeros) {
                if (numero > mayor) {
                    mayor = numero;
                }
            }
            return mayor;
        }

        public static double encontrarMenor(ArrayList<Double> numeros) {
            double menor = numeros.get(0);
            for (double numero : numeros) {
                if (numero < menor) {
                    menor = numero;
                }
            }
            return menor;
        }




    }