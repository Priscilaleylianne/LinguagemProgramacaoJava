package poo;

public class Porsche {

	public static void main(String[] args) {
		Carro porsche = new Carro();
		porsche.tipo = "Porsche";
		porsche.cor = "Branco";
		porsche.placa = "OPA-4356";
		porsche.numPortas = 2;
		porsche.ano = 1964;
		
		System.out.println("Carro: Porsche");
		System.out.println("Tipo: " + porsche.tipo);
		System.out.println("Cor: " + porsche.cor);
		System.out.println("Placa: " + porsche.placa);
		System.out.println("NumPortas: " + porsche.numPortas);
		System.out.println("Ano: " + porsche.ano);
		
		porsche.ligar();
		porsche.acelerar();
		porsche.desligar();
		porsche.frear();
	}
}