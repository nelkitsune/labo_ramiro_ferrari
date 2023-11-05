import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //1
        ArrayList<Integer> numero = new ArrayList<>();
        for (int i = 1 ; i < 6;i++) {
            numero.add(i);
        }
        //2
        ArrayList<String > cadena = new ArrayList<>();
        cadena . add("jose");
        cadena . add("manuel");
        cadena . add("lucas");
        //3
        System.out.println(numero);
        //4
        System.out.println(numero.size());
        //5
        cadena.remove(2);
        System.out.println(cadena);
        //6
        boolean coso_vacio = cadena.isEmpty();
        System.out.println(coso_vacio);
        //7
        int num_max = 0;
        for (int i = 0 ; i < 5; i++){
            if (i == 0) {
                num_max = numero.get(i);
            } else if (num_max < numero.get(i)) {
                num_max = numero.get(i);

            }
        }
        System.out.println(num_max);

        //8
        ArrayList<Integer> numero_2 = new ArrayList<>();
        for (int i = 0; i < 5 ; i++ ){
            numero_2.add(numero.get(i));
        }
        System.out.println(numero_2);
        //9
        Collections.reverse(numero_2);
        System.out.println(numero_2);
        //10
        for (int i = 0 ; i < 5 ; i++){
            numero_2.add(numero.get(i));
        }
        System.out.println(numero_2);
        //11
        ArrayList<Integer> numero_3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numero_3.add(i + 1);
        }
        for (int i = 0; i<numero_3.size(); i++) {
            if (numero_3.get(i) % 2 == 0) {
                numero_3.remove(i);
            }
        }
        System.out.println(numero_3);

        //12
        ArrayList<String> cadenas_largas = new ArrayList<>();
        cadenas_largas.add("jose");
        cadenas_largas.add("locura");
        cadenas_largas.add("pepiniiloo");
        cadenas_largas.add("aviones");
        cadenas_largas.add("troncolate");
        cadenas_largas.add("ruperto");
        System.out.println(cadenas_largas.indexOf("aviones"));

        //13
        ArrayList<String> cadenas_largas2 = new ArrayList<>();
        cadenas_largas2.add("jose");
        cadenas_largas2.add("locura");
        cadenas_largas2.add("pepiniiloo");
        cadenas_largas2.add("aviones");
        cadenas_largas2.add("troncolate");
        cadenas_largas2.add("ruperto");

        System.out.println(cadenas_largas.size());
        System.out.println(cadenas_largas2.size());

        if (verificar_la_igualdad(cadenas_largas,cadenas_largas2)){
            System.out.println("jose");
        }else {
            System.out.println("mmiguel");
        }

        //14
        int num_minimo = 0;
        for (int i = 0; i < numero_3.size(); i++) {
            if (i == 0){
                num_minimo = numero_3.get(i);
            }
            if (num_minimo > numero_3.get(i)){
                num_minimo = numero_3.get(i);
            }
        }
        System.out.println(num_minimo);
        //15
        int suma = 0;
        for (int i = 0; i < numero_3.size(); i++) {
            suma += numero_3.get(i);
        }
        System.out.println(suma);

        //16
        String cadena_conca ="";
        for (int i = 0; i < cadenas_largas.size(); i++) {
            cadena_conca = cadena_conca + " " + cadenas_largas.get(i);
        }
        System.out.println(cadena_conca);
        //17
        ArrayList<String> cadenas_largas_elregreso = new ArrayList<>();
        cadenas_largas_elregreso.add("jose");
        cadenas_largas_elregreso.add("lopes");
        cadenas_largas_elregreso.add("tucano");
        cadenas_largas_elregreso.add("pizza");
        cadenas_largas_elregreso.add("jose");
        cadenas_largas_elregreso.add("rodrigo");
        cadenas_largas_elregreso.add("picaporte");
        cadenas_largas_elregreso.add("lucaido");
        cadenas_largas_elregreso.add("jose");
        cadenas_largas_elregreso.add("tucano");

       // for (int i = 0; i < cadenas_largas_elregreso.size(); i++) {
         //   for (int j = i ; j < cadenas_largas_elregreso.size(); j++) {
           //     if (cadenas_largas_elregreso.get(i) == cadenas_largas_elregreso.get(j)){
                  //  cadenas_largas_elregreso.remove(j);
             //   }

           // }

        //}
        for (int i = 0; i < cadenas_largas_elregreso.size(); i++) {
            for (int j = i + 1 ; j < cadenas_largas_elregreso.size(); j++) {
                if (cadenas_largas_elregreso.get(i) == cadenas_largas_elregreso.get(j)){
                    cadenas_largas_elregreso.remove(j);
                }

            }

        }
        System.out.println(cadenas_largas_elregreso);
        //18
        ArrayList<Integer> listaDeEnteros = new ArrayList<>();

        listaDeEnteros.add(1);
        listaDeEnteros.add(2);
        listaDeEnteros.add(3);
        listaDeEnteros.add(4);
        listaDeEnteros.add(5);
        listaDeEnteros.add(6);
        listaDeEnteros.add(7);
        listaDeEnteros.add(8);
        listaDeEnteros.add(9);

        int sumaElementosPares = calcularSumaElementosPares(listaDeEnteros);

        System.out.println("La suma de elementos en índices pares es: " + sumaElementosPares);

        //19

        ArrayList<Integer> listaDeEnteros2 = new ArrayList<>();
        listaDeEnteros2.add(1);
        listaDeEnteros2.add(2);
        listaDeEnteros2.add(3);
        listaDeEnteros2.add(4);
        listaDeEnteros2.add(5);

        int numeroBuscado = 3;

        boolean contieneNumero = listaDeEnteros2.contains(numeroBuscado);

        if (contieneNumero) {
            System.out.println("El ArrayList contiene el número " + numeroBuscado);
        } else {
            System.out.println("El ArrayList NO contiene el número " + numeroBuscado);
        }
        //20
        ArrayList<String> listaDeCadenas = new ArrayList<>();

        listaDeCadenas.add("manzana");
        listaDeCadenas.add("banana");
        listaDeCadenas.add("naranja");
        listaDeCadenas.add("fresa");
        listaDeCadenas.add("uva");

        String elementoMasLargo = encontrarElementoMasLargo(listaDeCadenas);

        System.out.println("El elemento con la longitud más larga es: " + elementoMasLargo);
        //21
        ArrayList<Integer> listaDeEnteros3 = new ArrayList<>();
        listaDeEnteros3.add(10);
        listaDeEnteros3.add(20);
        listaDeEnteros3.add(30);
        listaDeEnteros3.add(40);
        listaDeEnteros3.add(50);

        double promedio = calcularPromedio(listaDeEnteros3);

        System.out.println("El promedio de los elementos en el ArrayList es: " + promedio);
        //22
        ArrayList<Integer> listaDeEnteros4 = new ArrayList<>();
        listaDeEnteros4.add(10);
        listaDeEnteros4.add(5);
        listaDeEnteros4.add(20);
        listaDeEnteros4.add(3);
        listaDeEnteros4.add(15);

        Collections.sort(listaDeEnteros4);

        System.out.println("ArrayList ordenado de forma ascendente: " + listaDeEnteros4);


        //24
        ArrayList<String> listaDeCadenas2 = new ArrayList<>();

        // Agregar elementos al ArrayList
        listaDeCadenas2.add("manzana");
        listaDeCadenas2.add("banana");
        listaDeCadenas2.add("manzana");
        listaDeCadenas2.add("fresa");
        listaDeCadenas2.add("manzana");

        // Elemento que deseas contar
        String elementoBuscado = "manzana";

        // Contar la cantidad de veces que el elemento aparece en el ArrayList
        int cantidad = contarElemento(listaDeCadenas2, elementoBuscado);

        System.out.println("El elemento '" + elementoBuscado + "' aparece " + cantidad + " veces en el ArrayList.");

        //25
        ArrayList<String> listaDeCadenas3 = new ArrayList<>();

        // Agregar elementos al ArrayList
        listaDeCadenas3.add("pera");
        listaDeCadenas3.add("manzana");
        listaDeCadenas3.add("banana");
        listaDeCadenas3.add("uva");
        listaDeCadenas3.add("fresa");

        // Ordenar el ArrayList alfabéticamente
        Collections.sort(listaDeCadenas3);

        // Imprimir el ArrayList ordenado
        System.out.println("ArrayList ordenado alfabéticamente: " + listaDeCadenas3);
    }



    public static boolean verificar_la_igualdad (ArrayList<?> lista1, ArrayList<?>lista2){
        if (lista1.size()!=lista2.size()){

            return false;
        }
        for (int i = 0; i < lista1.size();i++){
            if (!lista1.get(i).equals(lista2.get(i))){
                System.out.println("bb");
                return false;
            }
        }
        return true;
    }
    public static int calcularSumaElementosPares(ArrayList<Integer> lista) {
        int suma = 0;

        for (int i = 0; i < lista.size(); i += 2) {
            suma += lista.get(i);
        }

        return suma;
    }
    public static String encontrarElementoMasLargo(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            return null;
        }

        String elementoMasLargo = lista.get(0);
        for (String cadena : lista) {
            if (cadena.length() > elementoMasLargo.length()) {
                elementoMasLargo = cadena;
            }
        }

        return elementoMasLargo;
    }
    public static double calcularPromedio(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        }

        int suma = 0;

        for (int numero : lista) {
            suma += numero;
        }

        return (double) suma / lista.size();
    }
    public static int contarElemento(ArrayList<String> lista, String elemento) {
        int contador = 0;

        for (String cadena : lista) {
            if (cadena.equals(elemento)) {
                contador++;
            }
        }

        return contador;
    }
}