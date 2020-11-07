package ar.edu.unlam.pb2.eva2;

public class Producto {
	
	protected String nombre;
	protected Double precio;
	protected Double fechaFabricacion;
	protected Fabricante fabricante;
	
	public String getNombre() {
		return nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public Double getFechaFabricacion() {
		return fechaFabricacion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	
}
