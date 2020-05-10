package es.uma.informatica.sii;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Centro
 *
 */
@Entity

public class Centro implements Serializable {

	   
	@Id @GeneratedValue
	private Long codigoCentro;
	@Column(nullable = false)
	private String nombreCentro;
	
	private static final long serialVersionUID = 1L;

	public Centro() {
		super();
	}   
	public Long getCodigoCentro() {
		return this.codigoCentro;
	}

	public void setCodigoCentro(Long codigoCentro) {
		this.codigoCentro = codigoCentro;
	}   
	public String getNombreCentro() {
		return this.nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCentro == null) ? 0 : codigoCentro.hashCode());
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
		Centro other = (Centro) obj;
		if (codigoCentro == null) {
			if (other.codigoCentro != null)
				return false;
		} else if (!codigoCentro.equals(other.codigoCentro))
			return false;
		return true;
	}
	
   
}
