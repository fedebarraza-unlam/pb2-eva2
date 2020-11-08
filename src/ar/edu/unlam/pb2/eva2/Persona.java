package ar.edu.unlam.pb2.eva2;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private String password;
	private Boolean login;
	protected RolUsuario rol;
	
	public Persona(String nombre, String apellido, String password, String passwordReset) {
		setNombre(nombre);
		setApellido(apellido);
		setPassword(password);
		this.login = false;
		this.rol = RolUsuario.USUARIO;
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
	public String getPassword() {
		return this.password;
	}
	public RolUsuario getRolUsuario() {
		return this.rol;
	}
	public Boolean getLogin() {
		return this.login;
	}
	public void cambiarLogin() {
		this.login =! this.login;
	}
}
