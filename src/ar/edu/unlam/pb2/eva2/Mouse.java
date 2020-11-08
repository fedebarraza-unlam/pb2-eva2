package ar.edu.unlam.pb2.eva2;

import java.util.ArrayList;

public class Mouse extends Accesorio {
	private Integer botonesAdicionales;

	public Mouse() {
		this.setBotonesAdicionales(0);
	}
	
	public Mouse(TipoConexion tipoConexion, ArrayList<Compatibilidad> compatibilidades) {
		this.setTipoConexion(tipoConexion);
		this.setCompatibilidades(compatibilidades);
		this.setBotonesAdicionales(0);
	}

	@Override
	public String mostrarDetalle() {
		String mensaje = "Nombre Mouse: "; // TODO Usar propety Nombre de Producto
		mensaje += "\n Tipo de Conexión: " + this.obtenerTipoConexion();
		mensaje += "\n Compatible con: " + this.obtenerCompatibilidades();
		mensaje += "\n Colores: " + this.getColores();
		mensaje += "\n Botones Addicionales: " + this.getBotonesAdicionales();
		return mensaje;
	}

	public Integer getBotonesAdicionales() {
		return botonesAdicionales;
	}

	public void setBotonesAdicionales(Integer botonesAdicionales) {
		this.botonesAdicionales = botonesAdicionales;
	}
}
