package ar.unlam.model;

import ar.unlam.enums.TipoDeDeportista;
import ar.unlam.interfaces.INadador;

public class Nadador extends Deportista implements INadador{
	private String estiloPreferido;

	public Nadador(Integer numeroDeSocio, String nombre, String estilo) {
		super(numeroDeSocio, nombre);
		this.estiloPreferido = estilo;
	}

	@Override
	public String getEstiloPreferido() {
		// TODO Auto-generated method stub
		return estiloPreferido;
	}

	@Override
	public TipoDeDeportista getTipoDeDeportista() {
		// TODO Auto-generated method stub
		return TipoDeDeportista.NADADOR;
	}
}
