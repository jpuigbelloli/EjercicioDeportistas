package ar.unlam.model;

import ar.unlam.enums.TipoDeBicicleta;
import ar.unlam.enums.TipoDeDeportista;

public class Triatleta extends Deportista {

	private String distanciaPreferida;

	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, 
			TipoDeBicicleta tipodeBicicleta) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return TipoDeBicicleta.TRIA;
	}

	@Override
	public TipoDeDeportista getTipoDeDeportista() {
		// TODO Auto-generated method stub
		return TipoDeDeportista.TRIATLETA;
	}

}
