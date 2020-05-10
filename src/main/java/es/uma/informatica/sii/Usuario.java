package es.uma.informatica.sii;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity

public class Usuario implements Serializable {

	public enum Rol {
      ADMIN,
      ALUMNO,
      PASPDI,
      ONG
    };
    
	@Id @GeneratedValue
	private String email;
	@Column(nullable = false)
	private String contraseña;
	private String Nombre;
	private String Apellido;
	@Enumerated(EnumType.STRING)
	private Rol rol;
	@ManyToMany
	private Inscripciones ins;
	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
	}   

	public String getContraseña() {
		return this.contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getApellido() {
		return this.Apellido;
	}

	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
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
		Usuario other = (Usuario) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}
   
}
