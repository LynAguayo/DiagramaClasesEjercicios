
public class Jugador extends Personaje implements Luchador {
    public Jugador(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void luchar(Habilidad habilidad) {
        System.out.println(getNombre() + " usa " + habilidad + " en combate!");
    }
}