package modelo;

public class Sala {
    // atributos
    private int cantidadAsientos;

    // constructor
    public Sala(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    // getters y setters
    public int getCantidadAsientos() {
        return cantidadAsientos;
    }
    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    // metodos
    @Override
    public String toString() {
        return "Sala [cantidadAsientos=" + cantidadAsientos + "]";
    }


}
