package ar.edu.unlam.pb2.eva2;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.eva2.productos.*;

class ProductTest {

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

}
