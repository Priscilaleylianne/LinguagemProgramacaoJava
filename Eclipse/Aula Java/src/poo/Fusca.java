package poo;

public class Fusca {

	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		fusca.tipo = "Fusca";
		fusca.cor = "Azul";
		fusca.placa = "AOB-3432";
		fusca.numPortas = 4;
		fusca.ano = 1964;
		
		System.out.println("Carro: Fusca");
		System.out.println("Tipo: " + fusca.tipo);
		System.out.println("Cor: " + fusca.cor);
		System.out.println("Placa: " + fusca.placa);
		System.out.println("NumPortas: " + fusca.numPortas);
		System.out.println("Ano: " + fusca.ano);
		
		fusca.ligar();
		fusca.acelerar();
		fusca.desligar();
		fusca.frear();
	}
}
