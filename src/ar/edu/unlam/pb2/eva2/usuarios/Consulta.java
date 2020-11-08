package ar.edu.unlam.pb2.eva2.usuarios;

public class Consulta {
	private String nombreUsuario;
	private String descripcion;
	
	public Consulta(String nombreUsuario, String descripcion) {
		setDescripcion(descripcion);
		setNombreUsuario(nombreUsuario);
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
