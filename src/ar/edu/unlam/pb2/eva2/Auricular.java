package ar.edu.unlam.pb2.eva2;

import java.util.ArrayList;

public class Auricular extends Accesorio {
	private Double potenciaDeSalida;


	public Auricular() {
		this.setTipoConexion(TipoConexion.BLUETOOTH);
		this.setCompatibilidades(null);
		this.setColores("Verde");
		this.setPotenciaDeSalida(500.4);
	}
	
	public Auricular(TipoConexion tipoConexion, ArrayList<Compatibilidad> compatibilidades, String colores,
			Double potenciaDeSalida) {
		this.setTipoConexion(tipoConexion);
		this.setCompatibilidades(compatibilidades);
		this.setColores(colores);
		this.setPotenciaDeSalida(potenciaDeSalida);
	}

	public Auricular(TipoConexion tipoConexion, ArrayList<Compatibilidad> compatibilidades) {
		this.setTipoConexion(tipoConexion);
		this.setCompatibilidades(compatibilidades);
		this.setColores("Verde");
		this.setPotenciaDeSalida(500.4);
	}

	public Double getPotenciaDeSalida() {
		return potenciaDeSalida;
	}

	public void setPotenciaDeSalida(Double potenciaDeSalida) {
		this.potenciaDeSalida = potenciaDeSalida;
	}

	@Override
	public String mostrarDetalle() {
		String mensaje = "Nombre Auricular: "; // TODO Usar propety Nombre de Producto
		mensaje += "\n Tipo de Conexión: " + this.obtenerTipoConexion();
		mensaje += "\n Compatible con: " + this.obtenerCompatibilidades();
		mensaje += "\n Colores: " + this.getColores();
		mensaje += "\n Potencia de Salida: " + this.getPotenciaDeSalida();
		return mensaje;
	}
}
