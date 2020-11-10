package ar.edu.unlam.pb2.eva2.usuarios;

import ar.edu.unlam.pb2.eva2.productos.Producto;

public class Usuario extends Persona {
	private String email;
	private Carrito carrito;

	public Usuario(String email, String password) {
		super(password);
		this.setEmail(email);
		this.setRol(RolUsuario.USUARIO);
		this.carrito = new Carrito();
	}

	public Usuario(String email, String password, String nombre, String apellido) {
		super(password, nombre, apellido);
		this.setEmail(email);
		this.setRol(RolUsuario.USUARIO);
		this.carrito = new Carrito();
	}

	@Override
	public String getID() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean agregarProductoAlCarrito(Producto producto) {
		if (this.getLogin()) {
			if(this.carrito.cargarProducto(producto)) {
				Integer nuevoStock = -1;
				producto.updateStock(nuevoStock);
			}
			return true;
		}
		return false;
	}

	public void removerProductoDelCarrito(Producto producto) {
		if (this.getLogin()) {
			this.carrito.removerProducto(producto);
			Integer nuevoStock = 1;
			producto.updateStock(nuevoStock);
		}
	}

	public String verDetalleDelProducto() {
		if (this.getLogin()) {
			return "[Importe total: " + carrito.getImporteTotal() + "]";
		}
		return "No se encuentra logueado";
	}

	public Integer getCantidadDeProductosEnElCarrito() {
		if (this.getLogin()) {
			return this.carrito.contadorDeProductos();
		}
		return 0;
	}

	public Double getImporteTotal() {
		if (this.getLogin()) {
			return this.carrito.getImporteTotal();
		}
		return 0.0;
	}
}
