package ar.edu.unlam.pb2.eva2;

import ar.edu.unlam.pb2.eva2.productos.*;
import ar.edu.unlam.pb2.eva2.tienda.Tienda;
import ar.edu.unlam.pb2.eva2.usuarios.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {

	private Tienda tienda;

	@BeforeEach
	public void setUp() {
		tienda = new Tienda("Game Stop");

		// Registrar algunos usuarios antes de empezar los tests
		tienda.registrar(new Usuario("surace.l@gmail.com", "asssdd22"));
		tienda.registrar(new Usuario("barraza.f@gmail.com", "00asssdd22"));
		tienda.registrar(new Usuario("marin.d@gmail.com", "asssdsdd22"));
		tienda.registrar(new Usuario("scalgia.l@gmail.com", "a111d22"));
	}

	@Test
	public void queSePuedaRegistrarUnUsuario() {
		Usuario user = new Usuario("mxpower@gmail.com", "123", "Max", "Power");
		assertTrue(tienda.registrar(user));
	}
	
	@Test
	public void queNoSePuedaRegistrarUnUsuarioDosVeces() {
		Usuario user = new Usuario("mxpower@gmail.com", "123", "Max", "Power");
		assertTrue(tienda.registrar(user));
		assertFalse(tienda.registrar(user));
	}

	@Test
	public void queSePuedaLoguearUnUsuario() {
		// Login Correcto
		assertNotNull(tienda.login("surace.l@gmail.com", "asssdd22"));

		// Login Incorrecto
		assertNull(tienda.login("mxpower2@gmail.com", "123"));
	}

	@Test
	public void queElUsuarioPuedaAgregarOquitarProductoDelCarrito() {
		// Login correcto
		Usuario fede = (Usuario) tienda.login("barraza.f@gmail.com", "00asssdd22");
		assertNotNull(fede);
		Usuario lucas = (Usuario) tienda.login("surace.l@gmail.com", "asssdd22");

		Juego j1 = new Juego("Demon Souls", 3900.0, Fabricante.SONY, Formato.DIGITAL, 100);
		Consola ps5 = new Consola("Play Station 5", 70000.0, Fabricante.SONY, 100);
		assertTrue(fede.agregarProductoAlCarrito(j1)); // Agrega productos
		assertTrue(fede.agregarProductoAlCarrito(ps5));
		assertTrue(lucas.agregarProductoAlCarrito(ps5));
		Integer nuevoStockJuego = j1.getStock();
		Integer nuevoStockConsola = ps5.getStock();
		assertEquals(99, nuevoStockJuego);
		assertEquals(98, nuevoStockConsola);

		fede.removerProductoDelCarrito(ps5); // Remueve el producto.
		nuevoStockConsola = ps5.getStock();
		assertEquals(99, nuevoStockConsola);
		
		Integer productosEnCarrito = 1;
		assertEquals(productosEnCarrito, fede.getCantidadDeProductosEnElCarrito());
	}

	@Test
	public void calculeElImporteTotalYlosProductosAgregados() {
		// Login correcto
		Usuario dami = (Usuario) tienda.login("marin.d@gmail.com", "asssdsdd22");
		assertNotNull(dami);

		Juego j1 = new Juego("Demon Souls", 3900.0, Fabricante.SONY, Formato.DIGITAL, 100);
		Consola ps5 = new Consola("Play Station 5", 70000.0, Fabricante.SONY, 100);

		assertTrue(dami.agregarProductoAlCarrito(j1));
		assertTrue(dami.agregarProductoAlCarrito(ps5));

		Double ve = 73900.0;
		assertEquals(ve, (dami.getImporteTotal()));

		// Contador de productos:
		Integer enCarrito = 2;
		assertEquals(enCarrito, dami.getCantidadDeProductosEnElCarrito());
	}

}
