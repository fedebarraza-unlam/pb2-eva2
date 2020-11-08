package ar.edu.unlam.pb2.eva2;

public abstract class Producto {
	
	protected String nombre;
	protected Double precio;
	protected Double fechaFabricacion;
	protected Fabricante fabricante;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Double getFechaFabricacion() {
		return fechaFabricacion;
	}
	public void setFechaFabricacion(Double fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
