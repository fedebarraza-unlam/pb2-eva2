package ar.edu.unlam.pb2.eva2.usuarios;

import java.util.ArrayList;

import ar.edu.unlam.pb2.eva2.productos.Producto;

public class Carrito{
	private ArrayList<Producto> productos;
	private Double importeTotal;

	public Carrito() {
		this.productos = new ArrayList<Producto>();
		this.importeTotal = 0.0;
	}

	public Boolean cargarProducto(Producto producto) {
		return productos.add(producto);
	}

	public void removerProducto(Producto producto) {
		this.productos.remove(producto);
	}

	public Integer contadorDeProductos() {
		return this.productos.size();
	}
	
	public Double getImporteTotal() {

		for (Producto actual : productos) {
			this.importeTotal += actual.getPrecio();
		}
		return importeTotal;
	}

}
