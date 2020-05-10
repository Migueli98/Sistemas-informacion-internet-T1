package es.uma.informatica.sii;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Informe_Para_Alumnos
 *
 */
@Entity

public class InformeActividad implements Serializable {

	@Id @GeneratedValue
	private Long idInforme;
	@Column(nullable = false)
	private String informeProfesor;
	private String informeONG;
	private String valoracionAlumno;
	
	@ManyToOne
	@JoinColumn(name = "profesor")
	private Profesor profe; 
	
	@ManyToOne
	@JoinColumn(name = "alumno")
	private Alumno alumn;
	
	@ManyToOne
	@JoinColumn(name = "servicio")
	private Servicios serv;

	
	private static final long serialVersionUID = 1L;

	public InformeActividad() {
		super();
	}   
	public Long getIdInforme() {
		return this.idInforme;
	}

	public void setIdInforme(Long idInforme) {
		this.idInforme = idInforme;
	}   
	public String getInformeProfesor() {
		return this.informeProfesor;
	}

	public void setInformeProfesor(String informeProfesor) {
		this.informeProfesor = informeProfesor;
	}   
	public String getInformeONG() {
		return this.informeONG;
	}

	public void setInformeONG(String informeONG) {
		this.informeONG = informeONG;
	}   
	public String getValoracionAlumno() {
		return this.valoracionAlumno;
	}

	public void setValoracionAlumno(String valoracionAlumno) {
		this.valoracionAlumno = valoracionAlumno;
	}
	
	public Profesor getProfe() {
		return profe;
	}
	public void setProfe(Profesor profe) {
		this.profe = profe;
	}
	public Alumno getAlumn() {
		return alumn;
	}
	public void setAlumn(Alumno alumn) {
		this.alumn = alumn;
	}
	public Servicios getServ() {
		return serv;
	}
	public void setServ(Servicios serv) {
		this.serv = serv;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idInforme == null) ? 0 : idInforme.hashCode());
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
		InformeActividad other = (InformeActividad) obj;
		if (idInforme == null) {
			if (other.idInforme != null)
				return false;
		} else if (!idInforme.equals(other.idInforme))
			return false;
		return true;
	}
   
}
