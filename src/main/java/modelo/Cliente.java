package modelo;

import java.util.ArrayList;

public class Cliente {
	// atributos
	private String nombreCliente, rutCliente, correoCliente;
	private ArrayList<Entrada> entradas;

	// constructor
	public Cliente(String nombreCliente, String rutCliente, String correoCliente) {
		this.nombreCliente = nombreCliente;
		this.rutCliente = rutCliente;
		this.correoCliente = correoCliente;
		this.entradas = new ArrayList<Entrada>();
	}

	// getters y setters
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}
	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}
	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}

	// metodos

	@Override
	public String toString() {
		return "Cliente [nombreCliente=" + nombreCliente + ", rutCliente=" + rutCliente + ", correoCliente="
				+ correoCliente + "]";
	}
}