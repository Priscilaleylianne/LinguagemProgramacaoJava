package herancaSegundo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	veiculos.add(new Veiculo("ABC-8800", 2022));
	veiculos.add(new Veiculo("ABC-1234", 2002));
	veiculos.add(new Veiculo("SOS-2287", 2010));
	veiculos.add(new Caminhao("NZT-3028", 2015, 5));
	veiculos.add(new Caminhao("IBO-3341", 2022, 7));
	veiculos.add(new Caminhao("OJN-30488", 2020, 7));
	
	ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
	veiculos.add(new Veiculo("SOS-2287", 2010));
	veiculos.add(new Caminhao("ABC-8800", 2022, 7));
	
	for (Veiculo veiculo : veiculos) {
		veiculo.exibirDados();
	}
	
	for (Caminhao caminhao : caminhoes) {
		caminhao.exibirDados();
	}
	
	}
}