package ar.edu.unlam.pb2.eva2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.eva2.productos.*;
import ar.edu.unlam.pb2.eva2.tienda.Tienda;
import ar.edu.unlam.pb2.eva2.usuarios.*;

public class AdministradorTest {
	private Tienda tienda;

	@BeforeEach
	public void setUp() {
		HashSet<Persona> personas = new HashSet<Persona>();
		HashSet<Producto> productos = new HashSet<Producto>();

		personas.add(new Administrador("surace.l@gmail.com", "asssdd22"));
		productos.add(new Consola("Play Station 4", 9000.00, Fabricante.SONY, 100));
		productos.add(new Juego("Last of Us", 3500.00, Fabricante.NAUGHTYDOG, Formato.FISICO, 100));
		productos.add(new Juego("Uncharted", 3500.00, Fabricante.NAUGHTYDOG, Formato.FISICO, 100));

		tienda = new Tienda("Game Stop", personas, productos);
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
		Administrador admin = (Administrador) tienda.login("surace.l@gmail.com", "asssdd22");

		// Login Correcto
		assertNotNull(admin);

		Juego j1 = new Juego("Demon Souls", 3900.0, Fabricante.SONY, Formato.DIGITAL, 100);
		assertTrue(tienda.agregarProducto(j1, admin));
	}

	@Test
	public void queNoSePuedaAgregarUnProductoDosVeces() {
		Administrador admin = (Administrador) tienda.login("surace.l@gmail.com", "asssdd22");

		// Login Correcto
		assertNotNull(admin);

		Juego j2 = new Juego("Assassin's Creed", 4900.0, Fabricante.MICROSOFT, Formato.DIGITAL, 100);
		assertTrue(tienda.agregarProducto(j2, admin));
		assertFalse(tienda.agregarProducto(j2, admin));
	}

	@Test
	public void queSePuedaModificarElStockDeLosProductos() {
		Integer nuevoStock = 500;
		Administrador admin = (Administrador) tienda.login("surace.l@gmail.com", "asssdd22");

		// Login Correcto
		assertNotNull(admin);

		Juego uncharted = (Juego) tienda.obtenerProducto("Uncharted");

		// Busqueda correcta
		assertNotNull(uncharted);

		tienda.cambiarStock(nuevoStock, admin, uncharted);
		assertEquals(uncharted.getStock(), nuevoStock, 0.0);
	}
}
