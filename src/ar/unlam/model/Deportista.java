package ar.unlam.model;

import ar.unlam.enums.TipoDeDeportista;
import ar.unlam.enums.TipoDeEvento;

public abstract class Deportista {

	private Integer numeroDeSocio;
	private String nombreDeDeportista;
	
	public Deportista(Integer numeroDeSocio, String nombre) {
		this.numeroDeSocio = numeroDeSocio;
		this.nombreDeDeportista = nombre;
	}
	
	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}
	
	public String nombreDeDeportista() {
		return nombreDeDeportista;
	}
	
	public abstract TipoDeDeportista getTipoDeDeportista();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeSocio == null) ? 0 : numeroDeSocio.hashCode());
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
		Deportista other = (Deportista) obj;
		if (numeroDeSocio == null) {
			if (other.numeroDeSocio != null)
				return false;
		} else if (!numeroDeSocio.equals(other.numeroDeSocio))
			return false;
		return true;
	}

}
