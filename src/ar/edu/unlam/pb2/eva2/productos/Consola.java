package ar.edu.unlam.pb2.eva2.productos;

import java.util.ArrayList;
import java.util.Collection;

import ar.edu.unlam.pb2.eva2.productos.accesorios.*;

public class Consola extends Producto {

	private Collection<Accesorio> accesorios;

	public Consola(String nombre, Double precio, Fabricante fabricante, Integer stock) {
		super();
		setNombre(nombre);
		setPrecio(precio);
		setStock(stock);
		setFabricante(fabricante);
		this.accesorios = new ArrayList<Accesorio>();
	}

	public Collection<Accesorio> getAccesorios() {
		return accesorios;
	}

	public Boolean agregarAccesorio(Accesorio accesorio) {
		return this.accesorios.add(accesorio);
	}

	@Override
	public String mostrarDetalle() {
		String mensaje = "Consola: " + this.getNombre();
		mensaje += "\n Fabricado por: " + this.getFabricante();
		mensaje += "\n Cantidad de Accesorios: " + this.getAccesorios().size();
		mensaje += "\n Precio: " + this.getPrecio();
		return mensaje;
	}

	public Integer cantidadDeJoysticks() {
		Integer joysticks = 0;

		for (Accesorio accesorio : this.getAccesorios()) {
			if (accesorio instanceof Joystick) {
				joysticks++;
			}
		}

		return joysticks;
	}
}
