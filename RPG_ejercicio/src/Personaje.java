import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
    private String nombre;
    private int nivel;
    private List<Habilidad> habilidades;  // Lista de habilidades

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.habilidades = new ArrayList<>(); // Inicializamos la lista
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void agregarHabilidad(Habilidad habilidad) {
        habilidades.add(habilidad);
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }
}