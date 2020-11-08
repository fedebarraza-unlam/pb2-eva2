package ar.edu.unlam.pb2.eva2;

import java.util.ArrayList;

public class Consola extends Producto{
	
	private ArrayList <Accesorio> accesorios;
	
	public Consola(String nombre, Double precio, Double fechaFabricacion, Fabricante fabricante) {
		setNombre(nombre);
		setPrecio(precio);
		setFechaFabricacion(fechaFabricacion);
		setFabricante(fabricante);
		this.accesorios = new ArrayList <> ();
	}
	
	public ArrayList<Accesorio> getAccesorios() {
		return accesorios;
	}
	
	public Boolean agregarAccesorio(Accesorio accesorio){
		return this.accesorios.add(accesorio);
	}
	
}
