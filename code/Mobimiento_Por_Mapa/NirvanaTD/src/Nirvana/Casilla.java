package Nirvana;

public final class  Casilla {
	public static final String ENTRADA = "E";
	public static final String SALIDA = "S";
	public static final String MURO = "M";
	public static final String PERSONAJE = "#";
	public static final String HUELLAS = "$";
	public static final String BLACO = ".";
	public static final String OBSTACULO = "T";
	
	private String tipo;
	
	public Casilla(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
