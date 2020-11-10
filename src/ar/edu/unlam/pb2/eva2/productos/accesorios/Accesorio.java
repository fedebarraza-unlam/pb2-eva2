package ar.edu.unlam.pb2.eva2.productos.accesorios;

import java.util.ArrayList;
import java.util.Collection;

import ar.edu.unlam.pb2.eva2.productos.Producto;

public abstract class Accesorio extends Producto {
	private TipoConexion tipoConexion;
	private Collection<Compatibilidad> compatibilidades;
	private String colores;

	public Accesorio() {
		super();
		this.tipoConexion = TipoConexion.CABLE;
		this.compatibilidades = new ArrayList<Compatibilidad>();
		this.setColores("N/A");
	}

	public TipoConexion getTipoConexion() {
		return tipoConexion;
	}

	public void setTipoConexion(TipoConexion tipoConexion) {
		this.tipoConexion = tipoConexion;
	}

	public Collection<Compatibilidad> getCompatibilidades() {
		return this.compatibilidades;
	}

	public void setCompatibilidades(ArrayList<Compatibilidad> compatibilidades) {
		this.compatibilidades = compatibilidades;
	}

	public String getColores() {
		return colores;
	}

	public void setColores(String colores) {
		this.colores = colores;
	}

	protected String obtenerTipoConexion() {
		switch (this.getTipoConexion()) {
		case BLUETOOTH:
			return "Bluetooth";
		case INFRARROJO:
			return "Infrarrojo";
		case CABLE:
			return "Cable";
		default:
			return "N/A";
		}
	}

	public Boolean esCompatible(Compatibilidad compatibilidad) {
		for (Compatibilidad item : this.getCompatibilidades()) {
			if (item.equals(compatibilidad)) {
				return true;
			}
		}
		return false;
	}

	protected String obtenerCompatibilidades() {
		Collection<String> listaDeCompatibilidad = new ArrayList<String>();

		for (Compatibilidad compatibilidad : this.getCompatibilidades()) {
			switch (compatibilidad) {
			case PS5:
				listaDeCompatibilidad.add("Play Station 5");
				break;
			case PS4:
				listaDeCompatibilidad.add("Play Station 4");
				break;
			case XBOX:
				listaDeCompatibilidad.add("Xbox");
				break;
			case XBOXSERIES:
				listaDeCompatibilidad.add("Xbox Series X");
				break;
			case PC:
				listaDeCompatibilidad.add("Computadora");
				break;
			}
		}
		return String.join(", ", listaDeCompatibilidad);
	}
}
