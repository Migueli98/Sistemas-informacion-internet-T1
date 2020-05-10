package es.uma.informatica.sii;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Requisitos
 *
 */
@Entity

public class Requisitos implements Serializable {

	@Id @GeneratedValue
	@ManyToOne
	@JoinColumn(name = "servicio")
	private Servicios servicio;
	@Column(nullable = false)
	private String idiomas;
	@Column(nullable = false)
	private String experienciaLaboral;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date disponibilidadHoraria;
	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	private List<Asignaturas> requieren;

	public Requisitos() {
		super();
	}   
	public String getIdiomas() {
		return this.idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}   
	public String getExperienciaLaboral() {
		return this.experienciaLaboral;
	}

	public void setExperienciaLaboral(String experienciaLaboral) {
		this.experienciaLaboral = experienciaLaboral;
	}   
	public Date getDisponibilidadHoraria() {
		return this.disponibilidadHoraria;
	}

	public void setDisponibilidadHoraria(Date disponibilidadHoraria) {
		this.disponibilidadHoraria = disponibilidadHoraria;
	}
	public Servicios getServicio() {
		return servicio;
	}
	public void setServicio(Servicios servicio) {
		this.servicio = servicio;
	}
	public List<Asignaturas> getRequieren() {
		return requieren;
	}
	public void setRequieren(List<Asignaturas> requieren) {
		this.requieren = requieren;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((servicio == null) ? 0 : servicio.hashCode());
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
		Requisitos other = (Requisitos) obj;
		if (servicio == null) {
			if (other.servicio != null)
				return false;
		} else if (!servicio.equals(other.servicio))
			return false;
		return true;
	}
	
   
}
