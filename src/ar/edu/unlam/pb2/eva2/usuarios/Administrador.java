package ar.edu.unlam.pb2.eva2.usuarios;

public class Administrador extends Persona {

	private String codigoLegajo;

	public Administrador(String codigoLegajo, String password) {
		super(password);
		this.setCodigoLegajo(codigoLegajo);
		this.setRol(RolUsuario.ADMINISTRADOR);
	}
	
	public Administrador(String codigoLegajo, String password, String nombre, String apellido) {
		super(password, nombre, apellido);
		this.setCodigoLegajo(codigoLegajo);
		this.setRol(RolUsuario.ADMINISTRADOR);
	}

	@Override
	public String getID() {
		return this.codigoLegajo;
	}
	
	public void setCodigoLegajo(String codigoLegajo) {
		this.codigoLegajo = codigoLegajo;
	}
}
