package ar.edu.unlam.pb2.eva2;

public class Juego extends Producto {
	
	private Formato formato;
	
	public Juego(String nombre, Double precio, Double fechaFabricacion, Fabricante fabricante, Formato formato) {
		this.nombre = nombre;
		this.precio = precio;
		this.fechaFabricacion = fechaFabricacion;
		this.fabricante = fabricante;
		this.formato = formato;
	}
	
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	
	public Formato getFormato() {
		return this.formato;
	}
	
}