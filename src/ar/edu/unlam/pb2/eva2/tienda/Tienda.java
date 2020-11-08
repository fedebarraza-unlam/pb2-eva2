package ar.edu.unlam.pb2.eva2.tienda;

import java.util.ArrayList;
import java.util.HashSet;

import ar.edu.unlam.pb2.eva2.usuarios.Administrador;
import ar.edu.unlam.pb2.eva2.usuarios.Consulta;
import ar.edu.unlam.pb2.eva2.usuarios.Persona;
import ar.edu.unlam.pb2.eva2.usuarios.RolUsuario;

public class Tienda {
	private HashSet<Persona> usuarios = new HashSet<>();
	private ArrayList<Consulta> consultas = new ArrayList<>();

	public Boolean register(Persona nuevo) {
		return this.usuarios.add(nuevo);
	}

	/*
	 * public Usuario loginUsuario(String email, String password) { for(Usuario
	 * usuario: this.usuarios) { if(usuario.getEmail.equals(email) &&
	 * usuario.getPassword.equals(password)) { usuario.cambiarLogin(); return
	 * usuario; } } return null; } Este método en teoría es funcional, lo comenté
	 * porque me tira errores ya que no tengo la clase Usuario creada
	 */

	public Boolean loginAdministrador(Integer DNI, String password) {
		for (Persona administrador : this.usuarios) {
			if (administrador.getRol() == RolUsuario.ADMINISTRADOR) {
				Administrador admin = (Administrador) administrador;
				if (admin.getDNI() == DNI && admin.getPassword().equals(password)) {
					admin.cambiarLogin();
					return true;
				}
			}
			return false;
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
