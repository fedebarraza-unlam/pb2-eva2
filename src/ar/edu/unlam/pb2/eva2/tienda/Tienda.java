package ar.edu.unlam.pb2.eva2.tienda;

import java.util.ArrayList;
import java.util.HashSet;

import ar.edu.unlam.pb2.eva2.productos.Producto;
import ar.edu.unlam.pb2.eva2.usuarios.Administrador;
import ar.edu.unlam.pb2.eva2.usuarios.Consulta;
import ar.edu.unlam.pb2.eva2.usuarios.Persona;

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
	
	public Boolean agregarProducto(Producto nuevo, Administrador admin) {
		if(admin.getLogin()) {
			return this.productos.add(nuevo);
		}
		return false;
	}
	
	public Boolean cambiarStock(Integer nuevoStock, Administrador admin, Producto cambiar) {
		if(admin.getLogin()) {
			for(Producto producto : this.productos) {
				if(producto.equals(cambiar)) {
					producto.setStock(nuevoStock);
					return true;
				}
			}
		}
		return false;
	}

	public ArrayList<Consulta> leerConsultas(Administrador admin) {
		if (admin.getLogin()) {
			return consultas;
		}
		return null;
	}
}
