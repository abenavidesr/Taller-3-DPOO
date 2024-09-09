package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {

	public static String NATURAL= "Natural";
	private String nombre;
	public ClienteNatural(String pNombre) {
		this.nombre = pNombre;
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return NATURAL;
	}

}
