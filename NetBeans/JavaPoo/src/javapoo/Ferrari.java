/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo;

/**
 *
 * @author PRISCILA
 */
public class Ferrari {
    public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		ferrari.tipo = "Ferrari";
		ferrari.cor = "Vermelho";
		ferrari.placa = "NOZ-9067";
		ferrari.numPortas = 2;
		ferrari.ano = 2012;
		
		System.out.println("Carro: Ferrari");
		System.out.println("Tipo: " + ferrari.tipo);
		System.out.println("Cor: " + ferrari.cor);
		System.out.println("Placa: " + ferrari.placa);
		System.out.println("NumPortas: " + ferrari.numPortas);
		System.out.println("Ano: " + ferrari.ano);
		
		ferrari.ligar();
		ferrari.acelerar();
	}
}
