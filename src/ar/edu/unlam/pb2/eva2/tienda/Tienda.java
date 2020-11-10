package ar.edu.unlam.pb2.eva2.tienda;

import java.util.ArrayList;
import java.util.HashSet;

import ar.edu.unlam.pb2.eva2.productos.Producto;
import ar.edu.unlam.pb2.eva2.usuarios.Administrador;
import ar.edu.unlam.pb2.eva2.usuarios.Consulta;
import ar.edu.unlam.pb2.eva2.usuarios.Persona;
import ar.edu.unlam.pb2.eva2.usuarios.Usuario;

public class Tienda {
	private String nombre;
	private HashSet<Persona> personasRegistradas;
	private ArrayList<Consulta> consultas;
	private HashSet<Producto> productos;

	public Tienda(String nombre) {
		this.setNombre(nombre);
		this.personasRegistradas = new HashSet<Persona>();
		this.consultas = new ArrayList<Consulta>();
		this.productos = new HashSet<Producto>();
	}

	public Tienda(String nombre, HashSet<Persona> personas, HashSet<Producto> productos) {
		this.setNombre(nombre);
		this.productos = productos;
		this.personasRegistradas = personas;
		this.consultas = new ArrayList<Consulta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean registrar(Persona nuevo) {
		return this.personasRegistradas.add(nuevo);
	}

	public Persona login(String id, String password) {
		for (Persona persona : this.personasRegistradas) {
			if (persona.getID().equals(id) && persona.getPassword().equals(password)) {
				persona.setLogin(true);
				return persona;
			}
		}
		return null;
	}

	public Boolean existePersona(Persona buscar) {
		for (Persona persona : this.personasRegistradas) {
			if (persona.equals(buscar)) {
				return true;
			}
		}
		return false;
	}

	public Boolean agregarProducto(Producto nuevo, Administrador admin) {
		if (existePersona(admin) && admin.getLogin()) {
			return this.productos.add(nuevo);
		}
		return false;
	}

	public Producto obtenerProducto(String nombre) {
		for (Producto producto : this.productos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				return producto;
			}
		}
		return null;
	}

	public Boolean cambiarStock(Integer nuevoStock, Administrador admin, Producto cambiar) {
		if (existePersona(admin) && admin.getLogin()) {
			for (Producto producto : this.productos) {
				if (producto.equals(cambiar)) {
					producto.setStock(nuevoStock);
					return true;
				}
			}
		}
		return false;
	}
	
	public Boolean crearConsulta(Usuario user, String descripcion) {
		if(existePersona(user) && user.getLogin()) {
			Consulta nuevo = new Consulta(user.getID(), descripcion);
			return this.consultas.add(nuevo);
		}
		return false;
	}

	public ArrayList<Consulta> leerConsultas(Administrador admin) {
		if (existePersona(admin) && admin.getLogin()) {
			return consultas;
		}
		return null;
	}
}
