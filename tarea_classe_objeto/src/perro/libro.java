package perro;

public class libro {
    private String  titulo;
    private String  autor;
    private int anio;

    public libro() {
        titulo = "The Saga of Tanya the Evil, Vol. 1 (Light Novel): Deus lo Vult";
        autor = "carlo zen";
        anio = 2013;
    }
    public String mostrar_libro(){
        return "el libro " + titulo + " es del autor " + autor + " y se escribio en el año " + anio;
    }
}
