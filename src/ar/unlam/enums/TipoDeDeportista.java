package ar.unlam.enums;

public enum TipoDeDeportista {
	CORREDOR("CORREDOR"),
	CICLISTA("CICLISTA"),
	NADADOR("NADADOR"),
	TRIATLETA("TRIATLETA");
	
	private String tipo;
	
	TipoDeDeportista (String string){
		this.tipo = string;
	}
	
	public String getTipoDeDeportista() {
		return tipo;
	}
}
