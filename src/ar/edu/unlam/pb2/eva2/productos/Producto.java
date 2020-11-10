package ar.edu.unlam.pb2.eva2.productos;

public abstract class Producto {

	private String nombre;
	private Double precio;
	private Integer stock;
	private Fabricante fabricante;

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

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	public Integer getStock() {
		return this.stock;
	}
	
	public Integer updateStock(Integer valor) {
		this.stock += valor;
		return getStock();
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public abstract String mostrarDetalle();
}
