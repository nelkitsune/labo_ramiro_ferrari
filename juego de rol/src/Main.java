import clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Arma> listaArmas = new ArrayList<>();
        listaArmas.add(new Arma("Espada de hierro", 2, 10));
        listaArmas.add(new Arma("Arco largo", 1, 12));
        listaArmas.add(new Arma("Daga afilada", 3, 8));
        listaArmas.add(new Arma("Maza de guerra", 4, 14));
        listaArmas.add(new Arma("Varita mágica", 5, 9));
        listaArmas.add(new Arma("Hacha de doble filo", 7, 15));
        listaArmas.add(new Arma("Lanza puntiaguda", 2, 11));
        listaArmas.add(new Arma("Bastón encantado", 6, 12));
        listaArmas.add(new Arma("Espadón gigante", 8, 18));
        listaArmas.add(new Arma("Cuchillo arrojadizo", 2, 7));
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
                System.out.println("pers 1 at");
                pj1.atacar(pj2);
            } else {
                System.out.println("pers 2 at");
                pj2.atacar(pj1);
            }
        }
    }
}