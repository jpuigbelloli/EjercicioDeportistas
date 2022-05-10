package ar.unlam.model;

import java.util.HashMap;
import java.util.Map;

import ar.unlam.enums.TipoDeEvento;

public class Evento {
	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipo) {
		this.tipo = tipo;
		this.numeroDeInscripcion = 0;
		participantes = new HashMap<Integer, Deportista>();
	}
	
	public Integer agregarParticipante(Deportista nuevo) {
		participantes.put(++this.numeroDeInscripcion, nuevo);
		return this.numeroDeInscripcion;
	}
	
	public TipoDeEvento getTipo() {
		return tipo;
	}

	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}

	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}

	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}

	@Override
	public String toString() {
		return "Evento [tipo=" + tipo + ", numeroDeInscripcion=" + numeroDeInscripcion + ", participantes="
				+ participantes + "]";
	}

}
