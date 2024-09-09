package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	private Cliente cliente;
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Vuelo vuelo;
	
	public Tiquete(String pCodigo, Vuelo pVuelo, Cliente clienteComprador, int pTarifa) {
		this.cliente = clienteComprador;
		this.codigo = pCodigo;
		this.vuelo = pVuelo;
		this.tarifa = pTarifa;
		this.usado = false;
	}
	public boolean esUsado() {
		return usado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public int getTarifa() {
		return tarifa;
	}
	
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void marcarComoUsado() {
		this.usado = true;
	}
}

