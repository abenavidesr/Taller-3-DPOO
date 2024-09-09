package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
	protected int COSTO_POR_KM_CORPORATIVO = 900;
	protected int COSTO_POR_KM_NATURAL = 600;
	protected double DESCUENTO_GRANDES = 0.2;
	protected double DESCUENTO_MEDIANAS = 0.1;
	protected double DESCUENTO_PEQ = 0.02;
	
	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		// TODO Auto-generated method stub
		Ruta ruta = vuelo.getRuta();
		
		int distancia = calcularDistanciaVuelo(ruta);
		int costoBase = 0;
		if(cliente.getTipoCliente()== "Corporativo") {
			costoBase = distancia * COSTO_POR_KM_CORPORATIVO;
		}
		else {
			costoBase = distancia* COSTO_POR_KM_NATURAL;
		}
		return costoBase;
	}

	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		// TODO Auto-generated method stub
		double descuento = 0;
		if(cliente.getTipoCliente() == "Corporativo") {
			int tamano = ((ClienteCorporativo) cliente).getTamanoEmpresa();
			if(tamano == 1) {
				descuento = DESCUENTO_GRANDES;
			}
			else if(tamano ==2) {
				descuento = DESCUENTO_MEDIANAS;
			}
			else {
				descuento = DESCUENTO_PEQ;
			}
		}
		return descuento;
	}
	

}
