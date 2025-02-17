public abstract class Animal implements Movible{
    protected String nombre;
    protected Posicion posicion;

    public Animal(String nombre) {
        this.nombre = nombre;
        posicion.setCoordX(0); /*el enunciado no lo dice, pero hemos decidido inicializarlo a 0*/
        posicion.setCoordY(0);
        posicion.setCoordZ(0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void mover(Posicion newPosicion){
        System.out.println("El animal se mueve a " + posicion.toString());
        posicion = newPosicion;
    }
}
