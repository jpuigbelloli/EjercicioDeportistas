package ar.unlam.model;

import ar.unlam.enums.TipoDeDeportista;
import ar.unlam.interfaces.ICiclista;

public class Ciclista extends Deportista implements ICiclista {

	private String tipoDeBicicleta;

	public Ciclista(Integer numeroDeSocio, String nombre, String tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	@Override
	public String getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return tipoDeBicicleta;
	}

	@Override
	public TipoDeDeportista getTipoDeDeportista() {
		return TipoDeDeportista.CICLISTA;
	}

}
