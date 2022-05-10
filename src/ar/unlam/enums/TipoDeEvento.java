package ar.unlam.enums;

public enum TipoDeEvento {
	CARRERA_5K("Corredor"),
	CARRERA_10K("Corredor"),
	CARRERA_21K("Corredor"),
	CARRERA_42K("Corredor"),
	DUATLON("Triatleta"),
	CARRERA_NATACION_EN_PICINA("Nadador"),
	CARRERA_NATACION_EN_AGUAS_ABIERTAS("Nadador"),
	TRIATLON_SHORT("Triatleta"),
	TRIATLON_OLIMPICO("Triatleta"),
	TRIATLON_MEDIO("Triatleta"),
	TRIATLON_IRONMAN("Triatleta");
	
	private String tipo;
	TipoDeEvento(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipoDeEvento() {
		return tipo;
	}
}
