package clases;

public class Arma {
    private String  nombre;
    private int danio_minimo;
    private int danio_maximo;

    public Arma(String nombre, int danio_minimo, int danio_maximo) {
        this.nombre = nombre;
        this.danio_minimo = danio_minimo;
        this.danio_maximo = danio_maximo;
    }

    public int getDanio_maximo() {
        return danio_maximo;
    }
    public int getDanio_minimo() {
        return danio_minimo;
    }
    public String getNombre(){
        return nombre;
    }
}
