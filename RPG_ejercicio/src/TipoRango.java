
public enum TipoRango {
    CaC(1), MEDIO(10), LARGO(25);

    private final int distancia;

    TipoRango(int distancia) {
        this.distancia = distancia;
    }

    public int getDistancia() {
        return distancia;
    }
}