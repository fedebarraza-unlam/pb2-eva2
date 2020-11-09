package ar.edu.unlam.pb2.eva2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.eva2.tienda.Tienda;
import ar.edu.unlam.pb2.eva2.usuarios.Administrador;
import ar.edu.unlam.pb2.eva2.usuarios.Persona;
import ar.edu.unlam.pb2.eva2.usuarios.RolUsuario;
import ar.edu.unlam.pb2.eva2.usuarios.Usuario;

class PersonaTest {

	private Tienda tienda;

	@BeforeEach
	public void setUp() {
		tienda = new Tienda("Perez Gaming");

		// Registrar algunos usuarios antes de empezar los tests
		tienda.registrar(new Administrador("PG-221133", "asssdd22", "Lucas", "Surace"));
		tienda.registrar(new Administrador("PG-222134", "00asssdd22", "Fede", "Barraza"));
		tienda.registrar(new Usuario("marin.d@gmail.com", "asssdsdd22"));
		tienda.registrar(new Usuario("scalgia.l@gmail.com", "a111d22"));
	}

	@Test
	public void queSePuedaLoguearUnAdministrador() {
		// Login Correcto
		Persona lucas = tienda.login("PG-221133", "asssdd22");
		assertTrue(lucas.getRol().equals(RolUsuario.ADMINISTRADOR));

		// Login Incorrecto
		Persona dami = tienda.login("marin.d@gmail.com", "asssdsdd22");
		assertFalse(dami.getRol().equals(RolUsuario.ADMINISTRADOR));
	}

}
