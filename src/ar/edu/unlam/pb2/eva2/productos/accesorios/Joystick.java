package ar.edu.unlam.pb2.eva2.productos.accesorios;

import java.util.ArrayList;

public class Joystick extends Accesorio {
	private Boolean tieneAnalogico;

	public Joystick() {
		this.setTieneAnalogico(false);
	}
	
	public Joystick(TipoConexion tipoConexion, ArrayList<Compatibilidad> compatibilidades) {
		this.setTipoConexion(tipoConexion);
		this.setCompatibilidades(compatibilidades);
		this.setTieneAnalogico(false);
	}

	@Override
	public String mostrarDetalle() {
		String mensaje = "Nombre Joystick: "; // TODO Usar propety Nombre de Producto
		mensaje += "\n Tipo de Conexión: " + this.obtenerTipoConexion();
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
