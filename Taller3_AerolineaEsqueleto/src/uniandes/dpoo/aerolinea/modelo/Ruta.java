package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    // TODO completar
	private String horaSalida;
	private String horaLlegada;
	private String codigoRuta;
	private Aeropuerto origen;
	private Aeropuerto destino;
	
    
	public Ruta(Aeropuerto origen, Aeropuerto destino, String horaSalida, String horaLlegada, String codigoRuta) {
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.codigoRuta = codigoRuta;
		this.origen = origen;
		this.destino = destino;
		
	}
    
	public String getCodigoRuta() {
		return this.codigoRuta;
	}
	public Aeropuerto getOrigen() {
		return this.origen;
	}
	
	public Aeropuerto getDestino() {
		return this.destino;
	}
    public String getHoraSalida() {
		return this.horaSalida;
	}
    
	public String getHoraLlegada() {
		return this.horaLlegada;
	}
	
	public int getDuracion() {
		int hLlegada = getHoras(horaLlegada);
		int mLlegada = getMinutos(horaLlegada);
		int hSalida = getHoras(horaSalida);
		int mSalida = getMinutos(horaSalida);
		
		int duracion = ((hLlegada*60)+ mLlegada)-((hSalida*60)+mSalida);
		return duracion;
		
		
	}
	
	public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    
    
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

	
    
}
