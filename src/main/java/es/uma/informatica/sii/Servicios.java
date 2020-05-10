package es.uma.informatica.sii;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Servicios
 *
 */
@Entity

public class Servicios implements Serializable {

	@Id @GeneratedValue
	private Long codigoServicio;
	@Column(nullable = false)
	private String tipoServicio;
	@Column(nullable = false)
	private String nombre;
	private String descripcion;
	private Integer numParticipantes;
	@Column(nullable = false)
	private Integer numHoras;
	@Column(nullable = false)
	private String zona;
	
	@ManyToOne
	@JoinColumn(name = "ONG")
	private Ong ong;
	
	@OneToMany(mappedBy = "servicio")
	private List<Actividades> act;
	
	@OneToMany(mappedBy = "servicio")
	private List<Requisitos> req;
	
	private static final long serialVersionUID = 1L;

	public Servicios() {
		super();
	}   
	public Long getCodigoServicio() {
		return this.codigoServicio;
	}

	public void setCodigoServicio(Long codigoServicio) {
		this.codigoServicio = codigoServicio;
	}   
	public String getTipoServicio() {
		return this.tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}   
	public Integer getNumParticipantes() {
		return this.numParticipantes;
	}

	public void setNumParticipantes(Integer numParticipantes) {
		this.numParticipantes = numParticipantes;
	}   
	public Integer getNumHoras() {
		return this.numHoras;
	}

	public void setNumHoras(Integer numHoras) {
		this.numHoras = numHoras;
	}   
	public String getZona() {
		return this.zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	public Ong getOng() {
		return ong;
	}
	public void setOng(Ong ong) {
		this.ong = ong;
	}
	
	public List<Actividades> getAct() {
		return act;
	}
	public void setAct(List<Actividades> act) {
		this.act = act;
	}
	public List<Requisitos> getReq() {
		return req;
	}
	public void setReq(List<Requisitos> req) {
		this.req = req;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoServicio == null) ? 0 : codigoServicio.hashCode());
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
		Servicios other = (Servicios) obj;
		if (codigoServicio == null) {
			if (other.codigoServicio != null)
				return false;
		} else if (!codigoServicio.equals(other.codigoServicio))
			return false;
		return true;
	}
	
   
}
