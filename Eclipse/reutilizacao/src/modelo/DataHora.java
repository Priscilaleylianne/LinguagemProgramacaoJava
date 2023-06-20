package modelo;

public class DataHora {

	private Data data;
	private Hora hora;
	
	public DataHora( byte dia, byte mes, short ano, byte hora, byte minuto, byte segundo ) {
		this.data = new Data(dia, mes, ano);
		this.hora = new Hora(hora, minuto, segundo); 
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public String toString() {
		return "DataHora [data=" + data.toString() + ", hora=" + hora.toString() + "]";
	}
	
	
}
