import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        // punto 1
        //Scanner sc = new Scanner (System.in);
        //System.out.println("ingrese el primer numero");
        //float num1= sc.nextFloat();
        //System.out.println("ingrese el segundo numero");
        //float num2 = sc.nextFloat();
        //System.out.println("el primer numero es: "+num1);
        //System.out.println("el segundo numero es: "+num2);
        //punnto 2
        //Scanner sc = new Scanner (System.in);
        //System.out.println("ingrese su nombre");
        //String nombre = sc.nextLine();
        //System.out.println("El nombre es: "+ nombre);
        //punto 3
        //Scanner sc = new Scanner(System.in);
        //System.out.println("ingrese un numero");
        //int num3 = sc.nextInt();
        //System.out.println("el resultado es: " + (num3 * 2) + " y " + (num3 * 3) );
        //punto 4
        //Scanner sc = new Scanner(System.in);
        //System.out.println("ingrese los grados centigrados");
        //Double temperatura = sc.nextDouble();
        //System.out.println("la temperatura en Fahrenheit es: " + (32 + ( 9 * temperatura / 5)));
        //punto 5
        //Scanner sc = new Scanner(System.in);
        //System.out.println("ingrese el radio de un circulo");
        //Double circulo = sc.nextDouble();
        //System.out.println("la longitud de el circulo es: "+(2*3.14*circulo));
        //System.out.println("el area de el circulo es: "+(3.14 * (circulo *circulo)));
        //punto 6
        //Scanner sc = new Scanner(System.in);
        //System.out.println("ingrese la velocidad en km/h: ");
        //Double velocidad = sc.nextDouble();
        //System.out.println("la velocidad en m/s es: "+(velocidad * 3.6));

        //punto 7
        //Scanner sc = new Scanner(System.in);
        //System.out.println("ingrese el primer cateto");
        //int cateto1 = sc.nextInt();
        //System.out.println("ingrese el segundo cateto");
        //int cateto2 = sc.nextInt();
        //int hipotenusa = (cateto1+cateto2);
        //System.out.println("la suma de los dos catetos da " + hipotenusa);

        //8
        //Scanner sc = new Scanner(System.in);
        //System.out.print("ingrese el valor del radio de la esfera: ");
        //int radio = sc.nextInt();
        //double  volumen = (4D/3)* Math.PI*Math.pow(radio,3);
        //System.out.println("el volumen de una esfera segun su radio es de: "+ volumen);

        //9
        //Scanner sc = new Scanner(System.in);
        //System.out.print("ingrese el lado A: ");
        //int lado_a = sc.nextInt();
        //System.out.print("ingrese el lado B: ");
        //int lado_b = sc.nextInt();
        //System.out.print("ingrese el lado C: ");
        //int lado_c = sc.nextInt();
        //double p = (lado_a+lado_b+lado_c)/2D;
        //double area = (p*(p-lado_a)*(p-lado_b)*(p-lado_c));
        //System.out.println("el area del triangulo es: " + area );

        //Scanner sc = new Scanner(System.in);
        //System.out.println("ingrese un numero: ");
        //boolean primo = true;
        //int num = sc.nextInt();
        //for ( int i=2; i<num;i++){
        //    if (num%i == 0 ){
        //        primo = false;
        //        break;
        //    }
        //    System.out.println(i);
        //}
        //if (primo == true){
        //    System.out.println("El numero ingresado es primo");

        //}else {
        //    System.out.println("el numero no es primo");
        //}

        //10
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero de 3 digitos: ");
        int num_completo  = sc.nextInt();
        int num_divididoa = num_completo % 10;
        num_completo  = num_completo / 10;
        int num_divididob = num_completo % 10;
        num_completo  = num_completo / 10;
        int num_divididoc = num_completo % 10;
        System.out.println("los numeros por separado son: "+ num_divididoc +" "+ num_divididob + " " +num_divididoa);
        */
        /*
        //11
        Scanner sc  = new Scanner(System.in);
        System.out.println("ingrese un numero de 5 digitos: ");
        int num_entero = sc.nextInt();
        int num_dividido = num_entero % 10;
        int almacen1 = num_dividido;
        num_entero = num_entero / 10;
        num_dividido = num_entero % 10;
        int almacen2 = num_dividido;
        num_entero = num_entero / 10;
        num_dividido = num_entero % 10;
        int almacen3 = num_dividido;
        num_entero = num_entero / 10;
        num_dividido = num_entero % 10;
        int almacen4 = num_dividido;
        num_entero = num_entero / 10;
        num_dividido = num_entero % 10;
        int almacen5 = num_dividido;
        String numCadena= String.valueOf(almacen5);
        String numCadenaCompleto = "";
        numCadenaCompleto = numCadenaCompleto+numCadena;
        System.out.println(numCadenaCompleto);
        numCadena= String.valueOf(almacen4);
        numCadenaCompleto = numCadenaCompleto+numCadena;
        System.out.println(numCadenaCompleto);
        numCadena= String.valueOf(almacen3);
        numCadenaCompleto = numCadenaCompleto+numCadena;
        System.out.println(numCadenaCompleto);
        numCadena= String.valueOf(almacen2);
        numCadenaCompleto = numCadenaCompleto+numCadena;
        System.out.println(numCadenaCompleto);
        numCadena= String.valueOf(almacen1);
        numCadenaCompleto = numCadenaCompleto+numCadena;
        System.out.println(numCadenaCompleto);
        */
        //12
        /*
        Scanner sc  = new Scanner(System.in);
        System.out.println("ingrese un numero de 5 digitos: ");
        int num_entero = sc.nextInt();
        int num_dividido = num_entero % 10;
        int almacen1 = num_dividido;
        num_entero = num_entero / 10;
        num_dividido = num_entero % 10;
        int almacen2 = num_dividido;
        num_entero = num_entero / 10;
        num_dividido = num_entero % 10;
        int almacen3 = num_dividido;
        num_entero = num_entero / 10;
        num_dividido = num_entero % 10;
        int almacen4 = num_dividido;
        num_entero = num_entero / 10;
        num_dividido = num_entero % 10;
        int almacen5 = num_dividido;
        String numCadena= String.valueOf(almacen1);
        String numCadenaCompleto = "";
        numCadenaCompleto = numCadenaCompleto+numCadena;
        System.out.println(numCadenaCompleto);
        numCadena= String.valueOf(almacen2);
        numCadenaCompleto = numCadenaCompleto+numCadena;
        System.out.println(numCadenaCompleto);
        numCadena= String.valueOf(almacen3);
        numCadenaCompleto = numCadenaCompleto+numCadena;
        System.out.println(numCadenaCompleto);
        numCadena= String.valueOf(almacen4);
        numCadenaCompleto = numCadenaCompleto+numCadena;
        System.out.println(numCadenaCompleto);
        numCadena= String.valueOf(almacen5);
        numCadenaCompleto = numCadenaCompleto+numCadena;
        System.out.println(numCadenaCompleto);
        */
        //13
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el dia de su nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("ingrese el mes de su nacimiento: ");
        int mes = sc.nextInt();
        System.out.print("ingrese el año de su nacimiento: ");
        int ano = sc.nextInt();

        int numero_total = dia + mes + ano;
        int numero_total2 = numero_total % 10;

        numero_total = numero_total / 10;
        int numero_total3 = numero_total % 10;

        numero_total = numero_total / 10;
        int numero_total4 = numero_total % 10;

        numero_total = numero_total / 10;
        int numero_total_resultado = numero_total + numero_total2 + numero_total3 + numero_total4;
        System.out.println("su numero de la suerte es: " + numero_total_resultado);
        */

        //14
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el valor del producto: ");
        double valor = sc.nextDouble();
        System.out.print("ingrese la cantiadad que va a llevar: ");
        double cantidad = sc.nextDouble();
        double total = (valor * cantidad) * 1.21;
        System.out.println("el total de la compra es: $" + total);
        */

        //15
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de N: ");
        int n = scanner.nextInt();
        System.out.print("Ingresa el valor de m: ");
        int m = scanner.nextInt();
        int divisor = (int) Math.pow(10, m);
        int resultado = n / divisor;
        System.out.println("El nuevo valor de N es: " + resultado);
        */
        //16
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double reaumur = (celsius * 4.0) / 5.0;
        double kelvin = celsius + 273.15;
        System.out.println("Temperatura en grados Réaumur: " + reaumur);
        System.out.println("Temperatura en Kelvin: " + kelvin);
        */



    }
}