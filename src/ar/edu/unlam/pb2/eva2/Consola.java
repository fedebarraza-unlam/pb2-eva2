package ar.edu.unlam.pb2.eva2;

public class Consola extends Producto{
	
	//private ArrayList <Accesorios> accesorios;
	
	public Consola(String nombre, Double precio, Double fechaFabricacion, Fabricante fabricante) {
		this.nombre = nombre;
		this.precio = precio;
		this.fechaFabricacion = fechaFabricacion;
		this.fabricante = fabricante;
		//this.accesorios = new ArrayList <> ();
	}
	/*
	public ArrayList<Accesorios> getAccesorios() {
		return accesorios;
	}
	
	public Boolean agregarAccesorio(Accesorio accesorio){
		this.accesorios.add(accesorio);
	}
	*/
}
