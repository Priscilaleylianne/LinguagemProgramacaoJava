package herancaSegundo;

public class Onibus extends Veiculo {
	private int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.setAssentos(assentos);
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	@Override
	public void exibirDados() {
		System.out.println("A placa do veiculo Onibus e " + placa + "e o ano de fabricacao e " + ano + 
				", o numero e " + assentos);
	}
}
