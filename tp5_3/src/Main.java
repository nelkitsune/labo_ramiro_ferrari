import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        //1
        System.out.print("ingrese un numero: ");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("es par");
        }else {
            System.out.println("es impar");
        }
        */
        /*
        //2
        System.out.println("ingrese un numero: ");
        int num2 = sc.nextInt();
        if (num2 % 10 == 0){
            System.out.println("el numero es multiplo de 10");
        }else {
            System.out.println("el nnumeor no es multiplo de 10");
        }
        */
        //3
        /*
        System.out.print("ingrese una letra: ");
        char letra = sc.next().charAt(0);
        if (letra == Character.toUpperCase(letra)){
            System.out.println("es mayuscula");
        }else {
            System.out.println("es minuscula");

         */
        //4
        /*
        System.out.println("ingrese el primer valor: ");
        int num3 = sc.nextInt();
        System.out.println("ingrese el segundo valor: ");
        int num4 = sc.nextInt();
        if(num3 == num4){
            System.out.println("son numeros iguales");

        }else {
            System.out.println("son numeros distintos");
        }
        */

        //5
        /*
        System.out.print("ingrese wl primer numero: ");
        int num5 = sc.nextInt();
        System.out.print("ingrese el  segundo numero: ");
        int num6 = sc.nextInt();
        if (num5 < num6){
            System.out.println("el segundo numero es mayor que el primero");
        } else if (num5 > num6) {
            System.out.println("el primer numero es mayor que el segundo");
        }else {
            System.out.println("son iguales");
        }
         */
        //6
        /*
        System.out.print("ingrese un numero de 3 sifras: ");
        int num7 = sc.nextInt();
        int num8 = num7 % 10;
        num7 = num7 / 10;
        int num9 = num7 %10;
        if (num9 == num8){
            System.out.println("son iguales");
        } else {
            System.out.println("son distintos");
        }

         */
        //7
        /*
        System.out.println("ingrese un numero: ");
        int num10 = sc.nextInt();
        if (num10 % 3 == 0 && num10 % 5 == 0){
            System.out.print("el numero es divisible entre 3 y 5");
        } else {
            System.out.println("el numero no cumple con las condiciones");

        }
         */
        //8
        /*
        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println(numero + " es múltiplo de dos y de tres.");
        } else if (numero % 2 == 0) {
            System.out.println(numero + " es múltiplo de dos pero no de tres.");
        } else if (numero % 3 == 0) {
            System.out.println(numero + " es múltiplo de tres pero no de dos.");
        } else {
            System.out.println(numero + " no es múltiplo de dos ni de tres.");
        }

         */
        //9
        /*
        System.out.print("Ingresa el primer caracter: ");
        char caracter1 = sc.next().charAt(0);
        System.out.print("Ingresa el segundo caracter: ");
        char caracter2 = sc.next().charAt(0);
        if (caracter1 == caracter2) {
            System.out.println("Los caracteres son iguales.");
        } else {
            System.out.println("Los caracteres no son iguales.");
        }

         */
        //10
        /*
        System.out.print("Ingresa el primer carácter: ");
        char caracter1 = sc.next().charAt(0);
        System.out.print("Ingresa el segundo carácter: ");
        char caracter2 = sc.next().charAt(0);
        if (Character.isLowerCase(caracter1) && Character.isLowerCase(caracter2)) {
            System.out.println("Ambos caracteres son letras minúsculas.");
        } else {
            System.out.println("Al menos uno de los caracteres no es una letra minúscula.");
        }

         */
        //11
        /*
        System.out.print("Ingresa un carácter: ");
        char caracter = sc.next().charAt(0);
        if (Character.isDigit(caracter)) {
            System.out.println("El carácter es un dígito numérico.");
        } else {
            System.out.println("El carácter no es un dígito numérico.");
        }

         */
        //12
        /*
        System.out.print("Ingresa el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Ingresa el segundo número (distinto de cero): ");
        double numero2 = sc.nextDouble();
        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("El divisor no puede ser cero. Por favor, ingresa un valor distinto de cero.");
        }

         */
        //13
        /*
        System.out.print("Ingresa un año: ");
        int anio = sc.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
         */
        //14
        /*
        System.out.print("Ingresa un número entero de tres cifras: ");
        int numero = sc.nextInt();
        if (numero >= 100 && numero <= 999) {
            int original = numero;
            int invertido = 0;
            for (int i = numero; i > 0; i /= 10) {
                int digito = i % 10;
                invertido = invertido * 10 + digito;
            }

            if (original == invertido) {
                System.out.println(original + " es un número capicúa.");
            } else {
                System.out.println(original + " no es un número capicúa.");
            }
        } else {
            System.out.println("El número ingresado no tiene tres cifras.");
        }
        //15
        System.out.print("Ingresa la hora (0-23): ");
        int hora = sc.nextInt();
        System.out.print("Ingresa los minutos (0-59): ");
        int minutos = sc.nextInt();
        System.out.print("Ingresa los segundos (0-59): ");
        int segundos = sc.nextInt();
        boolean esHoraValida = (hora >= 0 && hora <= 23) &&
                (minutos >= 0 && minutos <= 59) &&
                (segundos >= 0 && segundos <= 59);
        if (esHoraValida) {
            System.out.println("La hora ingresada es válida: " + hora + ":" + minutos + ":" + segundos);
        } else {
            System.out.println("La hora ingresada no es válida.");
        }

         */
        //16
        /*
        System.out.print("Ingresa un número de mes (1-12): ");
        int mes = sc.nextInt();
        if (mes >= 1 && mes <= 12) {
            int dias;
            if (mes == 2) {
                dias = 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
            } else {
                dias = 31;
            }
            System.out.print("El mes tiene " + dias + " días. ");
            if (mes == 2) {
                System.out.println("Es febrero.");
            } else if (mes == 4) {
                System.out.println("Es abril.");
            } else if (mes == 6) {
                System.out.println("Es junio.");
            } else if (mes == 9) {
                System.out.println("Es septiembre.");
            } else if (mes == 11) {
                System.out.println("Es noviembre.");
            } else {
                System.out.println("Es un mes con 31 días.");
            }
        } else {
            System.out.println("El valor ingresado no corresponde a un mes válido.");
        }
         */
        //17
        /*
        System.out.print("Ingresa una calificación numérica (0-10): ");
        double calificacion = sc.nextDouble();
        if (calificacion >= 0 && calificacion <= 10) {
            String calificacionAlfabetica;

            if (calificacion >= 0 && calificacion < 5) {
                calificacionAlfabetica = "Insuficiente";
            } else if (calificacion == 5) {
                calificacionAlfabetica = "Suficiente";
            } else if (calificacion == 6) {
                calificacionAlfabetica = "Bien";
            } else if (calificacion >= 7 && calificacion <= 8) {
                calificacionAlfabetica = "Notable";
            } else {
                calificacionAlfabetica = "Excelente";
            }

            System.out.println("La calificación alfabética correspondiente es: " + calificacionAlfabetica);
        } else {
            System.out.println("La calificación ingresada no es válida. Debe estar entre 0 y 10.");
        }

         */
        //18
        /*
        int numero = 1;

        while (numero <= 100) {
            System.out.println(numero);
            numero++;
        }

         */
        //19
        /*
        int numero = 1;

        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 100);


         */
        //20
        /*
        for (int numero = 1; numero <= 100; numero++) {
            System.out.println(numero);
        }

         */
        //21
        /*
        int numero = 100;

        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }
        */
        //22
        /*
        int numero = 100;

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 1);
         */
        //23
        /*
        for (int numero = 100; numero >= 1; numero--) {
            System.out.println(numero);
        }
        */
        //24
        /*
        System.out.print("Ingresa un número N: ");
        int N = sc.nextInt();
        System.out.println("Usando for:");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        System.out.println("Usando while:");
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i++;
        }

        System.out.println("Usando do-while:");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= N);
        */
        //25
        /*
        System.out.print("Ingresa un número entero N: ");
        int N = sc.nextInt();
        System.out.println("Usando for:");
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Usando while:");
        int i = N;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        System.out.println("Usando do-while:");
        i = N;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);

         */
        //26
        /*
        int numero1, numero2;
        do {
            System.out.print("Ingresa el primer número entero: ");
            numero1 = sc.nextInt();

            System.out.print("Ingresa el segundo número entero (distinto al primero): ");
            numero2 = sc.nextInt();
            if (numero1 == numero2) {
                System.out.println("Los números son iguales. Por favor, ingresa números distintos.");
            }
        } while (numero1 == numero2);
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);
        System.out.println("Números desde el menor al mayor:");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }

         */

        //27
        /*
        int A, B;
        do {
            System.out.print("Ingresa el número entero A: ");
            A = sc.nextInt();
            System.out.print("Ingresa el número entero B (mayor que A): ");
            B = sc.nextInt();
            if (A >= B) {
                System.out.println("A debe ser menor que B. Por favor, ingresa los números nuevamente.");
            }
        } while (A >= B);
        System.out.println("Números pares entre A y B:");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        */
        //28
        int N, M;
        do {
            System.out.print("Ingresa el número entero positivo N: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("N debe ser un número entero positivo. Introduce un valor válido.");
            }
        } while (N <= 0);
        do {
            System.out.print("Ingresa el número entero positivo M (mayor que N): ");
            M = sc.nextInt();
            if (M <= N) {
                System.out.println("M debe ser mayor que N. Introduce un valor válido.");
            }
        } while (M <= N);
        System.out.println("Múltiplos de " + N + " desde 1 hasta " + M + ":");
        for (int i = 1; i <= M; i++) {
            if (i % N == 0) {
                System.out.println(i);
            }
        }
        //29
        double MILLAS_A_KILOMETROS = 1.6093;
        while (true) {
            System.out.print("Ingresa la cantidad de millas (0 para salir): ");
            double millas = sc.nextDouble();
            if (millas == 0) {
                System.out.println("¡Hasta luego!");
                break;
            } else if (millas < 0) {
                System.out.println("Por favor, ingresa un valor positivo.");
                continue;
            }
            double kilometros = millas * MILLAS_A_KILOMETROS;
            System.out.printf("%.2f millas equivale a %.2f kilómetros.\n", millas, kilometros);
        }
    }
}