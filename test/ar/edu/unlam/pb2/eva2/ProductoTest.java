package ar.edu.unlam.pb2.eva2;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.eva2.productos.*;
import ar.edu.unlam.pb2.eva2.productos.accesorios.*;

class ProductoTest {

	@Test
	void consolaHeredaDeProducto() {
		Consola consola = new Consola("Play Station 4", 9000.00, Fabricante.SONY, 100);
		Assert.assertTrue(consola instanceof Producto);
	}

	@Test
	void juegoHeredaDeProducto() {
		Juego juego = new Juego("Last of Us", 3500.00, Fabricante.NAUGHTYDOG, Formato.FISICO, 100);
		Assert.assertTrue(juego instanceof Producto);
	}

	@Test
	void mostrarDetalleDeProductos() {
		Collection<Producto> productos = new ArrayList<Producto>();
		productos.add(new Consola("Play Station 4", 9000.00, Fabricante.SONY, 100));
		productos.add(new Juego("Last of Us", 3500.00, Fabricante.NAUGHTYDOG, Formato.FISICO, 100));
		productos.add(new Juego("Uncharted", 3500.00, Fabricante.NAUGHTYDOG, Formato.FISICO, 100));
		for (Producto producto : productos) {
			System.out.println(producto.mostrarDetalle());
		}
	}
	
	@Test
	void crearUnaPS4conDosJoysticks() {
		Consola consola = new Consola("Play Station 4", 9000.00, Fabricante.SONY, 100);
		
		ArrayList<Compatibilidad> compatibilidades = new ArrayList<Compatibilidad>();
		compatibilidades.add(Compatibilidad.PS4);
		consola.agregarAccesorio(new Joystick("Sony 1120", TipoConexion.BLUETOOTH, compatibilidades, 100));
		consola.agregarAccesorio(new Joystick("Sony 1121", TipoConexion.CABLE, compatibilidades, 100));
		
		Assert.assertEquals(Integer.valueOf(2), consola.cantidadDeJoysticks());
	}

}
