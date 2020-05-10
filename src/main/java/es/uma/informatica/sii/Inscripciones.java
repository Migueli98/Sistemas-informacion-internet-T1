package es.uma.informatica.sii;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import es.uma.informatica.sii.Usuario.Rol;

/**
 * Entity implementation class for Entity: Inscripciones
 *
 */
@Entity

public class Inscripciones implements Serializable {

	public enum estadoInscripcion{
		ACEPTADO,
		ESPERANDO,
		RECHAZADO
	};
	
	@Id @GeneratedValue
	@JoinColumn(name = "Inscrito")
	@ManyToMany(mappedBy = "ins")
	private Usuario user;
	@Id @GeneratedValue
	@JoinColumn(name = "Actividad")
	@ManyToMany(mappedBy = "insact")
	private Actividades act;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaInscripccion;
	@Enumerated(EnumType.STRING)
	private estadoInscripcion estado;
	private static final long serialVersionUID = 1L;

	public Inscripciones() {
		super();
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public Actividades getAct() {
		return act;
	}

	public void setAct(Actividades act) {
		this.act = act;
	}

	public Date getFechaInscripccion() {
		return fechaInscripccion;
	}

	public void setFechaInscripccion(Date fechaInscripccion) {
		this.fechaInscripccion = fechaInscripccion;
	}

	public estadoInscripcion getEstado() {
		return estado;
	}

	public void setEstado(estadoInscripcion estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((act == null) ? 0 : act.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
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
		Inscripciones other = (Inscripciones) obj;
		if (act == null) {
			if (other.act != null)
				return false;
		} else if (!act.equals(other.act))
			return false;
		if (estado != other.estado)
			return false;
		return true;
	}
   
}
