package modelo;

import java.util.ArrayList;

public class GestionCine {
	// atributos
	private ArrayList<Sala> salas;
	private ArrayList<Entrada> entradas;
	private ArrayList<Cliente> clientes;

	// constructor
	public GestionCine() {
		this.salas = new ArrayList<Sala>();
		this.entradas = new ArrayList<Entrada>();
		this.clientes = new ArrayList<Cliente>();
	}

	// getters y setters
	public ArrayList<Sala> getSalas() {
		return salas;
	}
	public void setSalas(ArrayList<Sala> salas) {
		this.salas = salas;
	}

	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}
	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	// metodos

	// metodo Agregar cliente.
	public boolean agregarCliente(String nombreCliente, String rutCliente, String correoCliente) {
		if (this.buscarCliente(rutCliente) == null) {
			Cliente cliente = new Cliente(nombreCliente, rutCliente, correoCliente);
			this.clientes.add(cliente);
			return true;
		} else {
			return false;
		}
	}

	// metodo Buscar cliente.
	public Cliente buscarCliente(String rutCliente) {
		Cliente cliente = null;
		for (Cliente clienteAux : this.clientes) {
			if (clienteAux.getRutCliente().equals(rutCliente)) {
				cliente = clienteAux;
				break;
			}
		}
		return cliente;
	}

	// metodo vender una entrada a un cliente.
	public boolean venderEntrada(String rutCliente, TipoEntrada tipoEntrada, Sala sala) {
		Cliente cliente = this.buscarCliente(rutCliente);
		if (cliente != null) {
			Entrada entrada = new Entrada(tipoEntrada, sala);
			cliente.getEntradas().add(entrada);
			this.entradas.add(entrada);
			return true;
		} else {
			return false;
		}
	}

	// Reversar venta de una entrada.
	public boolean reversarVenta(String rutCliente, TipoEntrada tipoEntrada, Sala sala) {
		Cliente cliente = this.buscarCliente(rutCliente);
		if (cliente != null) {
			Entrada entrada = new Entrada(tipoEntrada, sala);
			cliente.getEntradas().remove(entrada);
			this.entradas.remove(entrada);
			return true;
		} else {
			return false;
		}
	}


	//Ver el numero de asientos de una sala y la cantidad vendida.


	//Ver el numero de entradas que tiene un cliente.

	//Permitir el ingreso de un cliente a una sala si tiene entrada.






}