package ar.edu.unlam.pb2.eva2.tienda;

import java.util.ArrayList;
import java.util.HashSet;

import ar.edu.unlam.pb2.eva2.usuarios.Administrador;
import ar.edu.unlam.pb2.eva2.usuarios.Consulta;
import ar.edu.unlam.pb2.eva2.usuarios.Persona;

public class Tienda {
	private String nombre;
	private HashSet<Persona> personasRegistradas;
	private ArrayList<Consulta> consultas;

	public Tienda(String nombre) {
		this.setNombre(nombre);
		this.personasRegistradas = new HashSet<Persona>();
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

	public ArrayList<Consulta> leerConsultas(Administrador admin) {
		if (admin.getLogin()) {
			return consultas;
		}
		return null;
	}
}
