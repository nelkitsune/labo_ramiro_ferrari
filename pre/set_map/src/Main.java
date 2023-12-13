import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        Set<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Plátano");
        frutas.add("Naranja");
        frutas.add("Manzana");
        frutas.add("pera");
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        option = sc.nextByte();
        switch (option){
            case 1 -> punto1(frutas);
            case 2 -> punto2(numeros);
            case 3 -> punto3();
            case 4 -> punto4();
        }
    }
    public static void punto1 (Set<String> frutas){
        List<String> frutas_2 = new ArrayList<>();
        for (String fruta : frutas){
            frutas_2.add(fruta);
        }
        System.out.println(frutas_2);
        Collections.sort(frutas_2);
        System.out.println(frutas_2);
    }
    public static void punto2 (Set <Integer> num){
        if (num.isEmpty()){
            System.out.println("esta vacio");
        }else {
            System.out.println("no esta vacio");
        }
    }
    public static void punto3(){
        Set <String> conjunto1 = new HashSet<>();
        Set <String> conjunto2 = new HashSet<>();
        Set <String> conjunto3 = new HashSet<>();
        List<String> conjunto_ordenado = new ArrayList<>();
        String[] palabrasConjunto1 = {"Manzana", "Plátano", "Naranja", "Pera", "Uva"};
        String[] palabrasConjunto2 = {"Naranja", "Pera", "Sandía", "Melón", "Manzana"};
        for (String palabra : palabrasConjunto1) {
            conjunto1.add(palabra);
        }
        for (String palabra : palabrasConjunto2) {
            conjunto2.add(palabra);
        }


        for (String palabra : conjunto1) {
            conjunto3.add(palabra);
        }
        for (String palabra : conjunto2) {
            conjunto3.add(palabra);
        }

        for (String palabra: conjunto3){
            conjunto_ordenado.add(palabra);
        }
        Collections.sort(conjunto_ordenado);
        System.out.println(conjunto_ordenado);
    }
    public static void punto4(){
        Set<Integer> num1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        Set<Integer> num2 = new HashSet<>(Arrays.asList(4,5,6,3,6,7));
        List<Integer> num3 = new ArrayList<>();
        num1.retainAll(num2);
        for (int numero:
             num1) {
            num3.add(numero);
        }
        Collections.sort(num3, Collections.reverseOrder());
        System.out.println(num3);
    }
    public static void punto5(){

    }
}