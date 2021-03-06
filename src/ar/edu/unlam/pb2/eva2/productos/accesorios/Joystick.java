package ar.edu.unlam.pb2.eva2.productos.accesorios;

import java.util.ArrayList;

public class Joystick extends Accesorio {
	private Boolean tieneAnalogico;

	public Joystick() {
		this.setTieneAnalogico(false);
	}

	public Joystick(String nombre, TipoConexion tipoConexion, ArrayList<Compatibilidad> compatibilidades, Integer stock) {
		this.setNombre(nombre);
		this.setTipoConexion(tipoConexion);
		this.setCompatibilidades(compatibilidades);
		this.setTieneAnalogico(false);
		this.setStock(stock);
	}

	@Override
	public String mostrarDetalle() {
		String mensaje = "Joystick: " + this.getNombre();
		mensaje += "\n Tipo de Conexi�n: " + this.obtenerTipoConexion();
		mensaje += "\n Compatible con: " + this.obtenerCompatibilidades();
		mensaje += "\n Colores: " + this.getColores();
		if (this.getTieneAnalogico()) {
			mensaje += "\n Analogico: SI";
		} else {
			mensaje += "\n Analogico: NO";
		}
		return mensaje;
	}

	public Boolean getTieneAnalogico() {
		return tieneAnalogico;
	}

	public void setTieneAnalogico(Boolean tieneAnalogico) {
		this.tieneAnalogico = tieneAnalogico;
	}
}
