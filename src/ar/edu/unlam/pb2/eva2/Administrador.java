package ar.edu.unlam.pb2.eva2;

public class Administrador extends Persona {

	private Integer DNI;

	public Administrador(String nombre, String apellido, String password, String passwordReset, Integer DNI) {
		super(nombre, apellido, password, passwordReset);
		this.rol = RolUsuario.ADMINISTRADOR;
		this.DNI = DNI;
	}

	public Integer getDNI() {
		return DNI;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrador other = (Administrador) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		return true;
	}
	
}
