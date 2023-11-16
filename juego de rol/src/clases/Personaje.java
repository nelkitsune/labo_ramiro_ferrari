package clases;

public class Personaje {
    private String nombre;
    private int nivel;
    private int puntos_de_vida;
    private int ataque = 1;
    private int defensa;
    private Inventario inventario;

    public Personaje(String nombre, int nivel, int punto_de_vida,  int defensa){
        this.nombre=nombre;
        this.nivel=nivel;
        this.puntos_de_vida=punto_de_vida;
        this.defensa=defensa;
    }
}
