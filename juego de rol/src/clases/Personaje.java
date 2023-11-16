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
    public void perder_vida(int danio){
        puntos_de_vida = puntos_de_vida - danio;
        System.out.println(nombre + "te hicieron " + danio + " te quedan " + puntos_de_vida + " puntos de vida");
    }
    public void atacar (Personaje objetivo){
        int danio_infligido = this.ataque - objetivo.defensa;
        if (danio_infligido > 0) {
            objetivo.perder_vida(danio_infligido);
        } else {
            System.out.println("La CA de " + objetivo.nombre + " es demasiado alta, no se inflige daño.");
        }
    }
    public void  equipar_arma (Inventario arma){
        this.ataque =
    }

}
