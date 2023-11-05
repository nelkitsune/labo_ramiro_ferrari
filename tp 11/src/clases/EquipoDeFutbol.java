package clases;
import java.util.ArrayList;
import java.util.Scanner;
public class EquipoDeFutbol {
    private ArrayList<String> plantilla;

    public EquipoDeFutbol() {
        plantilla = new ArrayList<>();
    }

    // Método para agregar un jugador a la plantilla
    public void agregarJugador(String nombreJugador) {
        plantilla.add(nombreJugador);
    }

    // Método para eliminar un jugador de la plantilla
    public void eliminarJugador(String nombreJugador) {
        plantilla.remove(nombreJugador);
    }

    // Método para listar la plantilla de jugadores
    public void listarPlantilla() {
        System.out.println("Plantilla de jugadores:");
        for (String jugador : plantilla) {
            System.out.println(jugador);
        }
    }
}

