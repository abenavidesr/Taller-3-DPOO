package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	public static double IMPUESTO = 0.28;
	
	public CalculadoraTarifas() {
		
	}
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		int costoBase = calcularCostoBase(vuelo, cliente);
		double descuento = calcularPorcentajeDescuento(cliente);
		int costoDescuento = (int)(costoBase*(1-descuento));
		int impuesto = calcularValorImpuestos(costoDescuento);
		return costoDescuento + impuesto;
	}
	
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		Aeropuerto aeroOrigen = ruta.getOrigen();
		Aeropuerto aeroDestino = ruta.getDestino();
		int distancia = Aeropuerto.calcularDistancia(aeroOrigen, aeroDestino);
		return distancia;
	}
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	protected int calcularValorImpuestos(int costoBase) {
		int valor = (int) (costoBase * IMPUESTO);
		return valor;
	}
	
}
