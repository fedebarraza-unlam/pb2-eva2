package ar.edu.unlam.pb2.eva2;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AccesoriosTest {
	
	@Test
	void auricularHeredaDeAccesorio() {
		Auricular auricular = new Auricular();
		Assert.assertTrue(auricular instanceof Accesorio);
	}

	@Test
	void crearAuricular() {
		ArrayList<Compatibilidad> compatibilidades = new ArrayList<Compatibilidad>();
		compatibilidades.add(Compatibilidad.PS4);
		compatibilidades.add(Compatibilidad.PS5);
		Auricular auricular = new Auricular(TipoConexion.BLUETOOTH, compatibilidades, "Rojo", 200.2);
		
		Assert.assertNotEquals(null, auricular);
	}

	@Test
	void crearAuricularCompatibleConPC() {
		ArrayList<Compatibilidad> compatibilidades = new ArrayList<Compatibilidad>();
		compatibilidades.add(Compatibilidad.PC);
		Auricular auricular = new Auricular(TipoConexion.CABLE, compatibilidades, "Rojo", 200.2);
		
		Assert.assertNotEquals(null, auricular);
		Assert.assertTrue(auricular.esCompatible(Compatibilidad.PC));
	}
	
	@Test
	void crearAuricularNoCompatibleConPS5() {
		ArrayList<Compatibilidad> compatibilidades = new ArrayList<Compatibilidad>();
		compatibilidades.add(Compatibilidad.PC);
		compatibilidades.add(Compatibilidad.PS4);
		Auricular auricular = new Auricular(TipoConexion.CABLE, compatibilidades, "Rojo", 200.2);
		
		Assert.assertNotEquals(null, auricular);
		Assert.assertTrue(auricular.esCompatible(Compatibilidad.PC));
		Assert.assertFalse(auricular.esCompatible(Compatibilidad.PS5));
	}
	
	@Test
	void mostrarDetalleDeAuricular() {
		ArrayList<Compatibilidad> compatibilidades = new ArrayList<Compatibilidad>();
		compatibilidades.add(Compatibilidad.PC);
		compatibilidades.add(Compatibilidad.PS4);
		Auricular auricular = new Auricular(TipoConexion.CABLE, compatibilidades, "Rojo", 200.2);
		
		String mensaje = "Nombre Auricular: "; // TODO Usar propety Nombre de Producto
		mensaje += "\n Tipo de Conexión: Cable";
		mensaje += "\n Compatible con: Computadora, Play Station 4";
		mensaje += "\n Colores: Rojo";
		
		Assert.assertEquals(mensaje, auricular.mostrarDetalle());
	}
}
