package ar.edu.unlam.pb2.eva2;

import ar.edu.unlam.pb2.eva2.productos.Consola;
import ar.edu.unlam.pb2.eva2.productos.Fabricante;
import ar.edu.unlam.pb2.eva2.productos.Formato;
import ar.edu.unlam.pb2.eva2.productos.Juego;
import ar.edu.unlam.pb2.eva2.productos.accesorios.Auricular;
import ar.edu.unlam.pb2.eva2.productos.accesorios.Compatibilidad;
import ar.edu.unlam.pb2.eva2.productos.accesorios.TipoConexion;
import ar.edu.unlam.pb2.eva2.usuarios.Usuario;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;



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
	
	@Test
	public void queElUsuarioPuedaAgregarOquitarProductoDelCarrito() {
		Usuario user = new Usuario("Max", "Power", "123", "123", "mxpower@gmail.com");
		assertTrue(user.register(user));
		assertTrue(user.login("mxpower@gmail.com", "123"));
		
		Juego j1 = new Juego("Demon Souls", 3900.0, Fabricante.SONY, Formato.DIGITAL);
		Consola ps5 = new Consola("Play Station 5", 70000.0, Fabricante.SONY);		
		assertTrue(user.agregarProductoAlCarrito(j1)); //Agrega productos
		assertTrue(user.agregarProductoAlCarrito(ps5));
		
		user.removerProductoDelCarrito(ps5);  //Remueve el producto.
		
		Integer productosEnCarrito = 1;		
		assertEquals(productosEnCarrito, user.getCantidadDeProductosEnElCarrito());		
	}	
	
	@Test
	public void calculeElImporteTotalYlosProductosAgregados() {
		//Calcular importe total:
		Usuario user = new Usuario("Max", "Power", "123", "123", "mxpower@gmail.com");
		assertTrue(user.register(user));
		assertTrue(user.login("mxpower@gmail.com", "123"));
		
		Juego j1 = new Juego("Demon Souls", 3900.0, Fabricante.SONY, Formato.DIGITAL);
		Consola ps5 = new Consola("Play Station 5", 70000.0, Fabricante.SONY);
		
		assertTrue(user.agregarProductoAlCarrito(j1)); 
		assertTrue(user.agregarProductoAlCarrito(ps5));
		
		Double ve = 73900.0;
		assertEquals(ve, (user.getImporteTotal()));
		
		//Contador de productos:		
		Integer enCarrito = 2;		
		assertEquals(enCarrito, (user.getCantidadDeProductosEnElCarrito()));
	}
	
	
}
