package ar.edu.unlam.pb2.eva2.productos.accesorios;

import java.util.ArrayList;

public class Teclado extends Accesorio {
	private String idioma;
	private Boolean tieneNumerico;

	public Teclado() {
		this.setIdioma("Castellano");
		this.setTieneNumerico(true);
	}
	
	public Teclado(String nombre, TipoConexion tipoConexion, ArrayList<Compatibilidad> compatibilidades, Integer stock) {
		this.setNombre(nombre);
		this.setTipoConexion(tipoConexion);
		this.setCompatibilidades(compatibilidades);
		this.setColores("Negro");
		this.setIdioma("Castellano");
		this.setTieneNumerico(true);
		this.setStock(stock);
	}

	@Override
	public String mostrarDetalle() {
		String mensaje = "Teclado: " + this.getNombre();
		mensaje += "\n Tipo de Conexión: " + this.obtenerTipoConexion();
		mensaje += "\n Compatible con: " + this.obtenerCompatibilidades();
		mensaje += "\n Colores: " + this.getColores();
		mensaje += "\n Idioma: " + this.getIdioma();
		if (this.getTieneNumerico()) {
			mensaje += "\n Teclado Numerico: SI";
		} else {
			mensaje += "\n Teclado Numerico: NO";
		}
		return mensaje;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Boolean getTieneNumerico() {
		return tieneNumerico;
	}

	public void setTieneNumerico(Boolean tieneNumerico) {
		this.tieneNumerico = tieneNumerico;
	}

}
