package ar.edu.unlam.pb2.eva2.productos;

public abstract class Producto {

	private Integer codigoProducto;
	private String nombre;
	private Double precio;
	private Integer stock;
	private Fabricante fabricante;

	private static Integer ULTIMO_CODIGO_PRODUCTO = 1;

	public Producto() {
		this.codigoProducto = ULTIMO_CODIGO_PRODUCTO;
		ULTIMO_CODIGO_PRODUCTO++;
	}

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

	public Integer getCodigoProducto() {
		return codigoProducto;
	}

	@Override
	public boolean equals(Object obj) {
		Producto producto = (Producto) obj;

		if (producto == null) {
			return false;
		}

		return this.getCodigoProducto() == producto.getCodigoProducto();
	}

	public abstract String mostrarDetalle();
}
