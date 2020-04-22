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

	@Id @GeneratedValue
	private Long id;
	@Column(nullable = false)
	private String idiomas;
	@Column(nullable = false)
	private String experienciaLaboral;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date disponibilidadHoraria;
	private static final long serialVersionUID = 1L;

	@ManyToMany
	private List<Asignaturas> compuestoDe;
	
	public Curriculum() {
		super();
	}   
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Asignaturas> getCompuestoDe() {
		return compuestoDe;
	}

	public void setCompuestoDe(List<Asignaturas> compuestoDe) {
		this.compuestoDe = compuestoDe;
	}
   
}
