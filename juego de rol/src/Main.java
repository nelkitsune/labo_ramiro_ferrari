import clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = -1;
        Personaje pj1 = new Personaje();
        Personaje pj2 = new Personaje();
        System.out.println("texto de presentacion");
        System.out.println("pedida de datos pj1");
        pj1.setPersonaje();
        System.out.println("pedida de datos pj2");
        pj2.setPersonaje();



        System.out.println("duelo");
        while (pj1.getPuntos_de_vida() > 0 && pj2.getPuntos_de_vida() > 0){
            i++;
            if (i % 2 == 0){
                System.out.println(pj1.getNombre()+ " ataca");
                pj2.atacar(pj2);
            } else {
                System.out.println(pj2.getNombre()+ " ataca");
                pj1.atacar(pj1);
            }
        }
    }
}