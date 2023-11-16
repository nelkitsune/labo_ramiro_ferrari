package clases;

import java.util.ArrayList;
import java.util.List;

public class PoolArma {
    private List<Arma> listaArmas;

    public PoolArma() {
        listaArmas = new ArrayList<>();
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
    }

    public Arma getListaArmas(int opcion) {
        return listaArmas.get(opcion);
    }
}
