package modelo;

public class Hora {

	private byte hora;
	private byte minuto;
	private byte segundos;
	
	public Hora(byte hora, byte minuto, byte segundos) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundos = segundos;
	}

	public byte getHora() {
		return hora;
	}

	public void setHora(byte hora) {
		this.hora = hora;
	}

	public byte getMinuto() {
		return minuto;
	}

	public void setMinuto(byte minuto) {
		this.minuto = minuto;
	}

	public byte getSegundos() {
		return segundos;
	}

	public void setSegundos(byte segundos) {
		this.segundos = segundos;
	}

	public String toString() {
		return "Hora [hora=" + hora + ", minuto=" + minuto + ", segundos="
				+ segundos + "]";
	}
	
	
}
