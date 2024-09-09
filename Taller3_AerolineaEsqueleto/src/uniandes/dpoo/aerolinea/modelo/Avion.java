package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	private int capacidad;
	private String nombre;
	
	public Avion(String pNombre, int pCapacidad) {
		this.capacidad = pCapacidad;
		this.nombre = pNombre;
	}
	public int getCapacidad() {
		return this.capacidad;
	}
	public String getNombre() {
		return this.nombre;
	}
}
