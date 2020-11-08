package ar.edu.unlam.pb2.eva2.productos;

import java.util.ArrayList;

import ar.edu.unlam.pb2.eva2.productos.accesorios.*;

public class Consola extends Producto {

	private ArrayList<Accesorio> accesorios;

	public Consola(String nombre, Double precio, Double fechaFabricacion, Fabricante fabricante) {
		setNombre(nombre);
		setPrecio(precio);
		setFechaFabricacion(fechaFabricacion);
		setFabricante(fabricante);
		this.accesorios = new ArrayList<>();
	}

	public ArrayList<Accesorio> getAccesorios() {
		return accesorios;
	}

	public Boolean agregarAccesorio(Accesorio accesorio) {
		return this.accesorios.add(accesorio);
	}

	@Override
	public String mostrarDetalle() {
		String mensaje = "Juego: " + this.getNombre();
		mensaje += "\n Fabricado por: " + this.getFabricante();
		mensaje += "\n Cantidad de Accesorios: "+ this.getAccesorios().size();
		mensaje += "\n Precio: " + this.getPrecio();
		return mensaje;
	}
}
