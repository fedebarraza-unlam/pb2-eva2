package ar.edu.unlam.pb2.eva2.usuarios;

import java.util.HashSet;
import ar.edu.unlam.pb2.eva2.productos.Producto;

public class Usuario extends Persona {
	private String email;
	private HashSet<Persona> usuarios;
	private Boolean logueado;
	private Carrito carrito;
	private Boolean registrado;

	public Usuario(String nombre, String apellido, String password, String passwordReset, String email) {
		super(nombre, apellido, password, passwordReset);
		this.email = email;
		this.usuarios = new HashSet<>();
		this.carrito = new Carrito();
		this.logueado = false;
		this.registrado = false;
	}

	public Boolean register(Usuario user) {
		this.registrado = true;
		return this.usuarios.add(user);
	}

	public Boolean login(String email, String password) {
		if (this.registrado) {
			if (this.getPassword().equals(password) && this.email.equals(email)) {
				this.logueado = true;
				return true;
			}
		}
		return false;
	}

	public Boolean agregarProductoAlCarrito(Producto producto) {
		if (logueado) {
			this.carrito.cargarProducto(producto);
			return this.logueado;
		}
		return false;
	}

	public void removerProductoDelCarrito(Producto producto) {
		if (logueado) {
			this.carrito.removerProducto(producto);
		}
	}
	
	public String verDetalleDelProducto() {
		if(logueado) {
			return this.carrito.toString();
		} else
			return "No se encuentra logueado";
	}
	
	public Integer getCantidadDeProductosEnElCarrito() {
		if(logueado) {
			return this.carrito.contadorDeProductos();
		} else
			return 0;
	}

	public Double getImporteTotal() {
		if(logueado) {
			return this.carrito.getImporteTotal();
		} else
			return 0.0;		
	}

}
