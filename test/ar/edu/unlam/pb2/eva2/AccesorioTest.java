package ar.edu.unlam.pb2.eva2;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AccesorioTest {

	@Test
	void auricularHeredaDeAccesorio() {
		Auricular auricular = new Auricular();
		Assert.assertTrue(auricular instanceof Accesorio);
	}

	@Test
	void joystickHeredaDeAccesorio() {
		Joystick joystick = new Joystick();
		Assert.assertTrue(joystick instanceof Accesorio);
	}
	
	@Test
	void mouseHeredaDeAccesorio() {
		Mouse mouse = new Mouse();
		Assert.assertTrue(mouse instanceof Accesorio);
	}

	@Test
	void tecladoHeredaDeAccesorio() {
		Teclado teclado = new Teclado();
		Assert.assertTrue(teclado instanceof Accesorio);
	}
	
	@Test
	void mostrarDetalleAccesorios() {
		ArrayList<Compatibilidad> compatibilidades = new ArrayList<Compatibilidad>();
		compatibilidades.add(Compatibilidad.PC);
		compatibilidades.add(Compatibilidad.PS4);
		Collection<Accesorio> accesorios = new ArrayList<Accesorio>();
		accesorios.add(new Auricular(TipoConexion.BLUETOOTH, compatibilidades));
		accesorios.add(new Joystick(TipoConexion.CABLE, compatibilidades));
		accesorios.add(new Mouse(TipoConexion.INFRARROJO, compatibilidades));
		accesorios.add(new Teclado(TipoConexion.BLUETOOTH, compatibilidades));
		for (Accesorio accesorio : accesorios) {
			System.out.println(accesorio.mostrarDetalle());
		}
	}

}
