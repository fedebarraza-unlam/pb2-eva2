package ar.edu.unlam.pb2.eva2;

public class Juego extends Producto {
	
	private Formato formato;
	
	public Juego(String nombre, Double precio, Double fechaFabricacion, Fabricante fabricante, Formato formato) {
		setNombre(nombre);
		setPrecio(precio);
		setFechaFabricacion(fechaFabricacion);
		setFabricante(fabricante);
		setFormato(formato);
	}
	
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	
	public Formato getFormato() {
		return this.formato;
	}
	
}