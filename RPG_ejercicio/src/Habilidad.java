public class Habilidad {
    private double dano;
    private TipoDano tipoDano;
    private TipoRango rango;

    public Habilidad(double dano, TipoDano tipoDano, TipoRango rango) {
        this.dano = dano;
        this.tipoDano = tipoDano;
        this.rango = rango;
    }

    public double getDano() {
        return dano;
    }

    public TipoDano getTipoDano() {
        return tipoDano;
    }

    public TipoRango getRango() {
        return rango;
    }

    @Override
    public String toString() {
        return "Habilidad [Daño: " + dano + ", Tipo: " + tipoDano + ", Rango: " + rango + "]";
    }
}