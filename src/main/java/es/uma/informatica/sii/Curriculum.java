package es.uma.informatica.sii;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Curriculum
 *
 */
@Entity

public class Curriculum implements Serializable {

	public enum diasSemana {
		LUNES,
		MARTES,
		MIERCOLES,
		JUEVES,
		VIERNES,
		SABADO,
		DOMINGO
	};
	
	public enum idioma {
		INGLES,
		ALEMAN,
		ARABE,
		FRANCES,
		ITALIANO,
		CHINO,
		JAPONES,
		KOREANO,
		ESPAÑOL,
		TURCO,
		RUSO,
		POLACO,
		NORUEGO
	};
	 
	@Id @GeneratedValue
	@OneToOne(mappedBy = "cv")
	private Alumno alumno;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private List<idioma> idiomas;
	@Column(nullable = false)
	private String experienciaLaboral;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private List<diasSemana> disponibilidadHoraria;
	private static final long serialVersionUID = 1L;

	@ManyToMany
	private List<Asignaturas> compuestoDe;
	
	public Curriculum() {
		super();
	}   
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public String getExperienciaLaboral() {
		return this.experienciaLaboral;
	}
	public void setExperienciaLaboral(String experienciaLaboral) {
		this.experienciaLaboral = experienciaLaboral;
	}   
	public List<idioma> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<idioma> idiomas) {
		this.idiomas = idiomas;
	}

	public List<diasSemana> getDisponibilidadHoraria() {
		return disponibilidadHoraria;
	}

	public void setDisponibilidadHoraria(List<diasSemana> disponibilidadHoraria) {
		this.disponibilidadHoraria = disponibilidadHoraria;
	}

	public List<Asignaturas> getCompuestoDe() {
		return compuestoDe;
	}

	public void setCompuestoDe(List<Asignaturas> compuestoDe) {
		this.compuestoDe = compuestoDe;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alumno == null) ? 0 : alumno.hashCode());
		result = prime * result + ((disponibilidadHoraria == null) ? 0 : disponibilidadHoraria.hashCode());
		result = prime * result + ((experienciaLaboral == null) ? 0 : experienciaLaboral.hashCode());
		result = prime * result + ((idiomas == null) ? 0 : idiomas.hashCode());
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
		Curriculum other = (Curriculum) obj;
		if (alumno == null) {
			if (other.alumno != null)
				return false;
		} else if (!alumno.equals(other.alumno))
			return false;
		if (disponibilidadHoraria == null) {
			if (other.disponibilidadHoraria != null)
				return false;
		} else if (!disponibilidadHoraria.equals(other.disponibilidadHoraria))
			return false;
		if (experienciaLaboral == null) {
			if (other.experienciaLaboral != null)
				return false;
		} else if (!experienciaLaboral.equals(other.experienciaLaboral))
			return false;
		if (idiomas == null) {
			if (other.idiomas != null)
				return false;
		} else if (!idiomas.equals(other.idiomas))
			return false;
		return true;
	}
	
	
}
