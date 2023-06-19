/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapoo;

/**
 *
 * @author PRISCILA
 */
public class Fusca {

    /**
     * @param args the command line arguments
     */
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
