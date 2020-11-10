package ar.edu.unlam.pb2.eva2.productos.accesorios;

import java.util.ArrayList;

public class Auricular extends Accesorio {
	private Double potenciaDeSalida;

	public Auricular(Double precio, Integer stock) {
		this.setTipoConexion(TipoConexion.BLUETOOTH);
		this.setCompatibilidades(null);
		this.setColores("Verde");
		this.setPotenciaDeSalida(500.4);
		this.setPrecio(precio);
		this.setStock(stock);
	}

	public Auricular(String nombre, TipoConexion tipoConexion, ArrayList<Compatibilidad> compatibilidades,
			String colores, Double precio, Double potenciaDeSalida, Integer stock) {
		this.setNombre(nombre);
		this.setTipoConexion(tipoConexion);
		this.setCompatibilidades(compatibilidades);
		this.setColores(colores);
		this.setPrecio(precio);
		this.setStock(stock);
		this.setPotenciaDeSalida(potenciaDeSalida);
	}

	public Auricular(String nombre, TipoConexion tipoConexion, ArrayList<Compatibilidad> compatibilidades) {
		this.setNombre(nombre);
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
		String mensaje = "Auricular: " + this.getNombre();
		mensaje += "\n Tipo de Conexión: " + this.obtenerTipoConexion();
		mensaje += "\n Compatible con: " + this.obtenerCompatibilidades();
		mensaje += "\n Colores: " + this.getColores();
		mensaje += "\n Potencia de Salida: " + this.getPotenciaDeSalida();
		mensaje += "\n Precio: $" + this.getPrecio();
		return mensaje;
	}
}
