package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import java.util.Map;

public class Vuelo {

private Avion avion;
private String fecha;
private Ruta ruta;
private Tiquete tiquetes;

public Vuelo(Ruta pRuta, String pFecha, Avion pAvion) {
	this.avion = pAvion;
	this.fecha = pFecha;
	this.ruta = pRuta;
	this.tiquetes = ;
}

public Ruta getRuta() {
	return this.ruta;
}

public Avion getAvion() {
	return this.avion;
	
}
public String getFecha() {
	return this.fecha;
}

public Collection<Tiquete> getTiquetes(){
	return tiquetes;
}
public CalculadoraTarifas venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
	
}
