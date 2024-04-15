package modelo;

public class Entrada {
	// atributos
	private TipoEntrada tipoEntrada;
	private Sala sala;


	// constructor
	public Entrada(TipoEntrada tipoEntrada, Sala sala) {
		this.tipoEntrada = tipoEntrada;
		this.sala = sala;
	}

	// getters y setters
	public TipoEntrada getTipoEntrada() {
		return tipoEntrada;
	}
	public void setTipoEntrada(TipoEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}

	// metodos
	@Override
	public String toString() {
		return "Entrada [tipoEntrada=" + tipoEntrada + ", sala=" + sala + "]";
	}

}