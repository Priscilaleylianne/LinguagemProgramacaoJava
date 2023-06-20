package modelo;

public class Data {

	private byte dia;
	private byte mes;
	private short ano;
	
	public Data(byte dia, byte mes, short ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public byte getDia() {
		return dia;
	}

	public void setDia(byte dia) {
		this.dia = dia;
	}

	public byte getMes() {
		return mes;
	}

	public void setMes(byte mes) {
		this.mes = mes;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}

	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}	
}
