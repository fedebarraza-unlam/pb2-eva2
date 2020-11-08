package ar.edu.unlam.pb2.eva2;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.eva2.productos.*;
import ar.edu.unlam.pb2.eva2.productos.accesorios.Accesorio;
import ar.edu.unlam.pb2.eva2.productos.accesorios.Auricular;
import ar.edu.unlam.pb2.eva2.productos.accesorios.Compatibilidad;
import ar.edu.unlam.pb2.eva2.productos.accesorios.Joystick;
import ar.edu.unlam.pb2.eva2.productos.accesorios.TipoConexion;

class ProductoTest {

	@Test
	void consolaHeredaDeProducto() {
		Consola consola = new Consola("Play Station 4", 9000.00, Fabricante.SONY);
		Assert.assertTrue(consola instanceof Producto);
	}

	@Test
	void juegoHeredaDeProducto() {
		Juego juego = new Juego("Last of Us", 3500.00, Fabricante.NAUGHTYDOG, Formato.FISICO);
		Assert.assertTrue(juego instanceof Producto);
	}

	@Test
	void mostrarDetalleDeProductos() {
		Collection<Producto> productos = new ArrayList<Producto>();
		productos.add(new Consola("Play Station 4", 9000.00, Fabricante.SONY));
		productos.add(new Juego("Last of Us", 3500.00, Fabricante.NAUGHTYDOG, Formato.FISICO));
		productos.add(new Juego("Uncharted", 3500.00, Fabricante.NAUGHTYDOG, Formato.FISICO));
		for (Producto producto : productos) {
			System.out.println(producto.mostrarDetalle());
		}
	}
	
	@Test
	void crearUnaPS4conDosJoysticks() {
		Consola consola = new Consola("Play Station 4", 9000.00, Fabricante.SONY);
		
		ArrayList<Compatibilidad> compatibilidades = new ArrayList<Compatibilidad>();
		compatibilidades.add(Compatibilidad.PS4);
		consola.agregarAccesorio(new Joystick("Sony 1120", TipoConexion.BLUETOOTH, compatibilidades));
		consola.agregarAccesorio(new Joystick("Sony 1121", TipoConexion.CABLE, compatibilidades));
		
		Assert.assertEquals(Integer.valueOf(2), consola.cantidadDeJoysticks());
	}

}
