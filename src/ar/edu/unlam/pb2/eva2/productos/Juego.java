package ar.edu.unlam.pb2.eva2.productos;

public class Juego extends Producto {

	private Formato formato;

	public Juego(String nombre, Double precio,Fabricante fabricante, Formato formato, Integer stock) {
		setNombre(nombre);
		setPrecio(precio);
		setStock(stock);
		setFabricante(fabricante);
		setFormato(formato);
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public Formato getFormato() {
		return this.formato;
	}

	@Override
	public String mostrarDetalle() {
		String mensaje = "Juego: " + this.getNombre();
		mensaje += "\n Fabricado por: " + this.getFabricante();
		if (this.getFormato().equals(Formato.FISICO)) {
			mensaje += "\n Formato: Fisico";
		} else {
			mensaje += "\n Formato: Digital";
		}
		mensaje += "\n Precio: " + this.getPrecio();
		return mensaje;
	}
}