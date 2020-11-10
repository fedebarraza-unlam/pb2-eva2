package ar.edu.unlam.pb2.eva2;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.eva2.productos.accesorios.*;

class AuricularTest {
	
	@Test
	void crearAuricular() {
		ArrayList<Compatibilidad> compatibilidades = new ArrayList<Compatibilidad>();
		compatibilidades.add(Compatibilidad.PS4);
		compatibilidades.add(Compatibilidad.PS5);
		Auricular auricular = new Auricular("Takawishi", TipoConexion.BLUETOOTH, compatibilidades, "Rojo", 1100.00, 200.2, 100);
		
		Assert.assertNotEquals(null, auricular);
	}

	@Test
	void crearAuricularCompatibleConPC() {
		ArrayList<Compatibilidad> compatibilidades = new ArrayList<Compatibilidad>();
		compatibilidades.add(Compatibilidad.PC);
		Auricular auricular = new Auricular("Takawishi", TipoConexion.CABLE, compatibilidades, "Rojo", 1200.00, 200.2, 100);
		
		Assert.assertNotEquals(null, auricular);
		Assert.assertTrue(auricular.esCompatible(Compatibilidad.PC));
	}
	
	@Test
	void crearAuricularNoCompatibleConPS5() {
		ArrayList<Compatibilidad> compatibilidades = new ArrayList<Compatibilidad>();
		compatibilidades.add(Compatibilidad.PC);
		compatibilidades.add(Compatibilidad.PS4);
		Auricular auricular = new Auricular("Takawishi", TipoConexion.CABLE, compatibilidades, "Rojo", 1200.00, 200.2, 100);
		
		Assert.assertNotEquals(null, auricular);
		Assert.assertTrue(auricular.esCompatible(Compatibilidad.PC));
		Assert.assertFalse(auricular.esCompatible(Compatibilidad.PS5));
	}
	
	@Test
	void mostrarDetalleDeAuricular() {
		ArrayList<Compatibilidad> compatibilidades = new ArrayList<Compatibilidad>();
		compatibilidades.add(Compatibilidad.PC);
		compatibilidades.add(Compatibilidad.PS4);
		Auricular auricular = new Auricular("Takawishi", TipoConexion.CABLE, compatibilidades, "Rojo", 1200.00, 200.2, 100);
		
		String mensaje = "Auricular: Takawishi";
		mensaje += "\n Tipo de Conexión: Cable";
		mensaje += "\n Compatible con: Computadora, Play Station 4";
		mensaje += "\n Colores: Rojo";
		mensaje += "\n Potencia de Salida: 200.2";
		mensaje += "\n Precio: $1200.0";
		
		Assert.assertEquals(mensaje, auricular.mostrarDetalle());
	}
}
