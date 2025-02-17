public class Main {
    public static void main(String[] args) {

        Volador paloma = new Volador("paloma");
        Posicion newPosicion = new Posicion(1,5,8);
        paloma.mover(newPosicion);
        System.out.println("Nueva posición: " + paloma.getPosicion());

    }
}