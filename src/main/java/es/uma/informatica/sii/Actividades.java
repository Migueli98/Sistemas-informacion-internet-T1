package es.uma.informatica.sii;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Actividades
 *
 */
@Entity

public class Actividades implements Serializable {

	public enum Estado {
	      PENDIENTE,
	      ACEPTADA,
	      EN_CURSO,
	      REALIZADA,
	      RECHAZADA,
	      BUSCANDO_PARTICIPANTES
	};
	    
	@Id @GeneratedValue
	private Long idActividad;
	@Column(nullable = false)
	private String tipoActividad;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaInicioActividad;
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaFinActividad;
	@Column(nullable = false)
	private String lugarRealizacion;
	private String descripcion;
	@Enumerated(EnumType.STRING)
	private Estado estado;
	@ManyToMany
	private Inscripciones insact;
	
	
	@ManyToOne
	@JoinColumn(name = "servicio")
	private Servicios servicio;
	private static final long serialVersionUID = 1L;

	public Actividades() {
		super();
	}   
	public String getTipoActividad() {
		return this.tipoActividad;
	}

	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
	}   
	
	public Date getFechaInicioActividad() {
		return fechaInicioActividad;
	}
	public void setFechaInicioActividad(Date fechaInicioActividad) {
		this.fechaInicioActividad = fechaInicioActividad;
	}
	public Date getFechaFinActividad() {
		return fechaFinActividad;
	}
	public void setFechaFinActividad(Date fechaFinActividad) {
		this.fechaFinActividad = fechaFinActividad;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getLugarRealizacion() {
		return this.lugarRealizacion;
	}

	public void setLugarRealizacion(String lugarRealizacion) {
		this.lugarRealizacion = lugarRealizacion;
	}   
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}   
	public Long getIdActividad() {
		return this.idActividad;
	}

	public void setIdActividad(Long idActividad) {
		this.idActividad = idActividad;
	}
	public Servicios getServicio() {
		return servicio;
	}
	public void setServicio(Servicios servicio) {
		this.servicio = servicio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idActividad == null) ? 0 : idActividad.hashCode());
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
		Actividades other = (Actividades) obj;
		if (idActividad == null) {
			if (other.idActividad != null)
				return false;
		} else if (!idActividad.equals(other.idActividad))
			return false;
		return true;
	}
   
}
