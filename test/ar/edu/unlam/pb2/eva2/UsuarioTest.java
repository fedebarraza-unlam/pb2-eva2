package ar.edu.unlam.pb2.eva2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.unlam.pb2.eva2.usuarios.Usuario;

public class UsuarioTest {
	@Test
	public void queSePuedaRegistrarUnUsuario() {
		Usuario user = new Usuario("Max", "Power", "123", "123", "mxpower@gmail.com");
		assertTrue(user.register(user));
	}

	@Test
	public void queSePuedaLoguearUnUsuario() {
		Usuario user = new Usuario("Max", "Power", "123", "123", "mxpower@gmail.com");
		assertTrue(user.register(user));
		assertTrue(user.login("mxpower@gmail.com", "123"));

		Usuario user2 = new Usuario("Max", "Power", "123", "123", "mxpower2@gmail.com");
		
		assertFalse(user2.login("mxpower2@gmail.com", "123"));
	}
	
}
