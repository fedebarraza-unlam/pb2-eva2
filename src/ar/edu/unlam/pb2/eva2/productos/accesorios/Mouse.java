package ar.edu.unlam.pb2.eva2.productos.accesorios;

import java.util.ArrayList;

public class Mouse extends Accesorio {
	private Integer botonesAdicionales;

	public Mouse() {
		this.setBotonesAdicionales(0);
	}
	
	public Mouse(String nombre, TipoConexion tipoConexion, ArrayList<Compatibilidad> compatibilidades, Integer stock) {
		this.setNombre(nombre);
		this.setTipoConexion(tipoConexion);
		this.setCompatibilidades(compatibilidades);
		this.setBotonesAdicionales(0);
		this.setStock(stock);
	}

	@Override
	public String mostrarDetalle() {
		String mensaje = "Mouse: " + this.getNombre();
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
