package es.uma.informatica.sii;

import es.uma.informatica.sii.Usuario;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Profesor
 *
 */
@Entity

public class Profesor extends Usuario {

	@Column(nullable = false)
	private String departamento;
	
	@ManyToMany
	private List<Asignaturas> imparte;
	
	@OneToMany(mappedBy = "profe")
	private List<InformeActividad> inf;
	
	private static final long serialVersionUID = 1L;

	public Profesor() {
		super();
	}   
	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public List<Asignaturas> getImparte() {
		return imparte;
	}
	public void setImparte(List<Asignaturas> imparte) {
		this.imparte = imparte;
	}
	public List<InformeActividad> getInf() {
		return inf;
	}
	public void setInf(List<InformeActividad> inf) {
		this.inf = inf;
	}
	
   
}
