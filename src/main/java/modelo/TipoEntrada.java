package modelo;

public enum TipoEntrada {
    VIP("Vip"), NORMAL("Normal"), IMAX("Imax");
    private String tipoEntrada;
    private TipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public String toString() {
        return tipoEntrada;
    }
}