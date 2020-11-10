package ar.edu.unlam.pb2.eva2;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.eva2.productos.*;
import ar.edu.unlam.pb2.eva2.tienda.Tienda;
import ar.edu.unlam.pb2.eva2.usuarios.*;


public class TiendaTest {

	private Tienda tienda;

	@BeforeEach
	public void setUp() {
		tienda = new Tienda("Game Stop");

		// Registrar algunos usuarios antes de empezar los tests
		tienda.registrar(new Administrador("surace.l@gmail.com", "asssdd22"));
		tienda.registrar(new Usuario("barraza.f@gmail.com", "00asssdd22"));
		tienda.registrar(new Usuario("marin.d@gmail.com", "asssdsdd22"));
		tienda.registrar(new Usuario("scalgia.l@gmail.com", "a111d22"));
	}
	
	@Test
	public void queSeCreeUnaTienda() {
		assertNotNull(tienda);
	}
	
	@Test
	public void queSeRegistreUnUsuario() {
		assertTrue(tienda.registrar(new Usuario("ejemplo@outlook.com","123456789")));
	}
	
	@Test
	public void queSeLogueeUnUsuario() {
		Usuario dami = (Usuario) tienda.login("marin.d@gmail.com", "asssdsdd22");
		assertNotNull(dami);
	}
	
	@Test
	public void queSeAgregueUnUsuarioALaColeccionDeLaTienda() {
		Usuario juan = new Usuario("gonzales_juan1999@hotmail.com", "clave1234");
		tienda.registrar(juan);
		assertNotNull(juan);
		
		assertTrue(tienda.existePersona(juan));
	}
	
	@Test
	public void queSePuedaAgregarUnProducto() {
		Administrador admin = (Administrador) tienda.login("surace.l@gmail.com", "asssdd22");
		Juego j1 = new Juego("Demon Souls", 3900.0, Fabricante.SONY, Formato.DIGITAL, 100);
		assertTrue(tienda.agregarProducto(j1, admin));
	}
	
	@Test
	public void queSePuedaBuscarUnProducto() {
		Juego j1 = new Juego("The Last of Us", 5000.0, Fabricante.SONY, Formato.DIGITAL, 100);
		Administrador admin = (Administrador) tienda.login("surace.l@gmail.com", "asssdd22");
		tienda.agregarProducto(j1, admin);
		assertEquals(tienda.obtenerProducto(j1.getNombre()), j1);
	}
	
	@Test
	public void queSePuedaCambiarElStockDeLosProductos() {
		Juego j1 = new Juego("Spiderman", 4500.0, Fabricante.SONY, Formato.DIGITAL, 100);
		Administrador admin = (Administrador) tienda.login("surace.l@gmail.com", "asssdd22");
		tienda.agregarProducto(j1, admin);
		tienda.cambiarStock(500, admin, j1);
		Integer stock = j1.getStock();
		assertEquals(stock, j1.getStock());
	}
	
	@Test
	public void queSePuedaCrearUnaConsulta() {
		Usuario dami = (Usuario) tienda.login("marin.d@gmail.com", "asssdsdd22");
		Administrador admin = (Administrador) tienda.login("surace.l@gmail.com", "asssdd22");
		assertNotNull(dami);
		String descripcion = "Hola, como estan? Queria consultar el precio de la PS5. Desde ya, muchas gracias";
		tienda.crearConsulta(dami, descripcion);
		Integer esperado = 1;
		
		assertEquals(esperado, tienda.leerConsultas(admin).size());
	}
	
	@Test
	public void queSePuedaLeerUnaConsulta() {
		Usuario dami = (Usuario) tienda.login("marin.d@gmail.com", "asssdsdd22");
		Usuario fede = (Usuario) tienda.login("barraza.f@gmail.com", "00asssdd22");
		Usuario lucho = (Usuario) tienda.login("scalgia.l@gmail.com", "a111d22");
		Administrador admin = (Administrador) tienda.login("surace.l@gmail.com", "asssdd22");
		assertNotNull(dami);
		
		String descripcion = "Hola, como estan? Queria consultar el precio de la PS5. Desde ya, muchas gracias";
		tienda.crearConsulta(dami, descripcion);
		tienda.crearConsulta(fede, descripcion);
		tienda.crearConsulta(lucho, descripcion);
		
		ArrayList<Consulta> consultas = tienda.leerConsultas(admin);
		for(Consulta leer : consultas) {
			System.out.println(leer.toString());
		}
		
	}
	
}
