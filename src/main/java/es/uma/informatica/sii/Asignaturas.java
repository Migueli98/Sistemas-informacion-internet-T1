package es.uma.informatica.sii;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Asignaturas
 *
 */
@Entity

public class Asignaturas implements Serializable {

	   
	@Id @GeneratedValue
	private Long codigoAsignatura;
	@Column(nullable = false)
	private Integer creditos;
	@Column(nullable = false)
	private String nombreAsignatura;
	
	@ManyToOne
	@JoinColumn(name = "centro")
	private Centro enseña;
	
	@ManyToMany(mappedBy = "matriculadoEn")
	private List<Alumno> estaCursando;
	
	@ManyToMany(mappedBy = "imparte")
	private List<Profesor> impartidoPor;
	
	@ManyToMany(mappedBy = "compuestoDe")
	private List<Curriculum> incluidasEn;
	
	@ManyToMany(mappedBy = "requieren")
	private List<Requisitos> compuestoDe;
	
	
	private static final long serialVersionUID = 1L;

	public Asignaturas() {
		super();
	}   
	public Long getCodigoAsignatura() {
		return this.codigoAsignatura;
	}

	public void setCodigoAsignatura(Long codigoAsignatura) {
		this.codigoAsignatura = codigoAsignatura;
	}   
	public Integer getCreditos() {
		return this.creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}   
	public String getNombreAsignatura() {
		return this.nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	public List<Alumno> getEstaCursando() {
		return estaCursando;
	}
	public void setEstaCursando(List<Alumno> estaCursando) {
		this.estaCursando = estaCursando;
	}
	public List<Profesor> getImpartidoPor() {
		return impartidoPor;
	}
	public void setImpartidoPor(List<Profesor> impartidoPor) {
		this.impartidoPor = impartidoPor;
	}
	public Centro getEnseña() {
		return enseña;
	}
	public void setEnseña(Centro enseña) {
		this.enseña = enseña;
	}
	public List<Curriculum> getIncluidasEn() {
		return incluidasEn;
	}
	public void setIncluidasEn(List<Curriculum> incluidasEn) {
		this.incluidasEn = incluidasEn;
	}
	public List<Requisitos> getCompuestoDe() {
		return compuestoDe;
	}
	public void setCompuestoDe(List<Requisitos> compuestoDe) {
		this.compuestoDe = compuestoDe;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoAsignatura == null) ? 0 : codigoAsignatura.hashCode());
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
		Asignaturas other = (Asignaturas) obj;
		if (codigoAsignatura == null) {
			if (other.codigoAsignatura != null)
				return false;
		} else if (!codigoAsignatura.equals(other.codigoAsignatura))
			return false;
		return true;
	}
	
   
}
