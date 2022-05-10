package ar.unlam.model;

import ar.unlam.enums.TipoDeDeportista;
import ar.unlam.enums.TipoDeEvento;
import ar.unlam.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{
	private Integer cantidadDeKmEntrenados;
	private Integer distanciaPreferida;

	public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.cantidadDeKmEntrenados = 0;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKmEntrenados = km;
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return cantidadDeKmEntrenados;
	}

	public Integer getDistanciaPreferida() {
		// TODO Auto-generated method stub
		return distanciaPreferida;
	}

	@Override
	public TipoDeDeportista getTipoDeDeportista() {
		// TODO Auto-generated method stub
		return TipoDeDeportista.CORREDOR;
	}

}
