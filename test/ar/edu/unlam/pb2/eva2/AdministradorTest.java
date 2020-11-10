package ar.edu.unlam.pb2.eva2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.eva2.productos.Fabricante;
import ar.edu.unlam.pb2.eva2.productos.Formato;
import ar.edu.unlam.pb2.eva2.productos.Juego;
import ar.edu.unlam.pb2.eva2.tienda.Tienda;
import ar.edu.unlam.pb2.eva2.usuarios.Administrador;


public class AdministradorTest {
	private Tienda tienda;

	@BeforeEach
	public void setUp() {
		tienda = new Tienda("Game Stop");
		tienda.registrar(new Administrador("surace.l@gmail.com", "asssdd22"));
	}
	
	@Test
	public void queSePuedaRegistrarUnAdministrador() {
		Administrador admin = new Administrador("barraza.f@gmail.com", "00asssdd22");
		assertTrue(tienda.registrar(admin));
	}
	
	@Test
	public void queNoSePuedaRegistrarUnAdministradorDosVeces() {
		Administrador admin = new Administrador("barraza.f@gmail.com", "00asssdd22");
		assertTrue(tienda.registrar(admin));
		assertFalse(tienda.registrar(admin));
	}
	
	@Test
	public void queSePuedaLoguearUnAdministrador() {
		// Login Correcto
		assertNotNull(tienda.login("surace.l@gmail.com", "asssdd22"));
		// Login Incorrecto
		assertNull(tienda.login("mxpower2@gmail.com", "123"));
	}
	
	@Test
	public void queSePuedaAgregarUnProducto() {
		Administrador admin = new Administrador("barraza.f@gmail.com", "00asssdd22");
		Juego j1 = new Juego("Demon Souls", 3900.0, Fabricante.SONY, Formato.DIGITAL, 100);
		
		assertTrue(tienda.agregarProducto(j1, admin));
	}
	
	@Test
	public void queNoSePuedaAgregarUnProductoDosVeces() {
		Administrador admin = new Administrador("barraza.f@gmail.com", "00asssdd22");
		Juego j1 = new Juego("Demon Souls", 3900.0, Fabricante.SONY, Formato.DIGITAL, 100);
		
		assertTrue(tienda.agregarProducto(j1, admin));
		assertFalse(tienda.agregarProducto(j1, admin));
	}
	
	@Test
	public void queSePuedaModificarElStockDeLosProductos() {
		
	}
}
