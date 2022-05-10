package ar.unlam.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.unlam.enums.TipoDeEvento;
import ar.unlam.exceptions.NoEstaPreparado;

public class Club {
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<Deportista>();
		this.competencias = new HashMap<String, Evento>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public void agregarDeportista(Deportista deportista) {
		this.socios.add(deportista);
		
	}

	public Integer getCantidadSocios() {
		// TODO Auto-generated method stub
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento tipo, String nombreDeEvento) {
		Evento evento = new Evento(tipo);
		this.competencias.put(nombreDeEvento, evento);
	}

	public Integer inscribirEnEvento(String nombreDeEvento, Deportista deportista) throws NoEstaPreparado{
		Evento evento = this.competencias.get(nombreDeEvento);
		String tipoDeDeportistaRecibido = deportista.getTipoDeDeportista().getTipoDeDeportista();
		String tipoDeEventoCreado = evento.getTipo().getTipoDeEvento();
		if (tipoDeEventoCreado.equalsIgnoreCase(tipoDeDeportistaRecibido)) {
			evento.agregarParticipante(deportista);
		}
		else {throw new NoEstaPreparado("No se puede inscribir un deportista "+ tipoDeDeportistaRecibido +
				" a un evento " + tipoDeEventoCreado);}
		System.out.println(evento.getParticipantes().size());
		return evento.getParticipantes().size();
	}

}
