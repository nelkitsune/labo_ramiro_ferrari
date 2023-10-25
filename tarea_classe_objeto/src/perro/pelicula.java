package perro;

public class pelicula {
    private String  titulo;
    private String  director;
    private String  duracion;
    public pelicula() {
        titulo = "Saga of Tanya the Evil: La película";
        director = "Yutaka Uemura";
        duracion = "1 hora 55 minutos";
    }
    public String mostrar_pelicula(){
        return "la pelicula " + titulo + " es del director " + director + " y dura " + duracion;
    }
}
