package ar.edu.unlam.pb2.eva2;

public class Persona {
	private String nombre;
	private String apellido;
	private String password;
	private String passwordReset;
	private RolUsuario rol;
	
	public Persona(String nombre, String apellido, String password, String passwordReset) {
		setNombre(nombre);
		setApellido(apellido);
		setPassword(password);
		setPasswordReset(passwordReset);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword(String passwordReset) {
		if(passwordReset.equals(this.passwordReset)) {
			return this.password;
		}
		return null;
	}
	public void setPasswordReset(String passwordReset) {
		this.passwordReset = passwordReset;
	}
	public RolUsuario getRolUsuario() {
		return this.rol;
	}
	
}
