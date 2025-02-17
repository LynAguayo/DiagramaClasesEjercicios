
public class Main{
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Evelyn", 10);
        Habilidad bolaFuego = new Habilidad(50, TipoDano.MAGICO, TipoRango.LARGO);
        Habilidad golpeDoble = new Habilidad(30, TipoDano.FISICO, TipoRango.CaC);

        jugador.agregarHabilidad(bolaFuego);
        jugador.agregarHabilidad(golpeDoble);

        System.out.println("Habilidades de " + jugador.getNombre() + ":");
        for (Habilidad h : jugador.getHabilidades()) {
            System.out.println(h);
        }

        jugador.luchar(bolaFuego);
    }
}






