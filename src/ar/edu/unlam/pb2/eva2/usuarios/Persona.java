package ar.edu.unlam.pb2.eva2.usuarios;

public abstract class Persona {
	private String nombre;
	private String apellido;
	private String password;
	private Boolean login;
	private RolUsuario rol;

	public Persona(String password) {
		this.setPassword(password);
		this.login = false;
	}

	public Persona(String password, String nombre, String apellido) {
		this.setPassword(password);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.login = false;
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

	public void setRol(RolUsuario rol) {
		this.rol = rol;
	}

	public RolUsuario getRol() {
		return this.rol;
	}

	public Boolean getLogin() {
		return this.login;
	}

	public void setLogin(Boolean login) {
		this.login = login;
	}

	public abstract String getID();
}
