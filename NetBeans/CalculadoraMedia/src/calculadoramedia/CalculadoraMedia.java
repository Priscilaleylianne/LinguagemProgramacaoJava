/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*************************************************************************
 *  1-)Faça um programa para calcular média de duas notas e usuário 
 * inserir o nome do alunas e digite a nota deste aluno, sendo que:
 *  media = (nota1 + nota2) / 2.
 *************************************************************************/
package calculadoramedia;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author PRISCILA
 */
public class CalculadoraMedia {
    
    public static void main(String[] args) {
			// variáveis
			String nome;
			double nota1, nota2, media;
			
			// objetos
			Scanner teclado = new Scanner(System.in);
			DecimalFormat formatador = new DecimalFormat("#0.00");
			
			// Entrada
			System.out.println("======================");
			System.out.println("== Calculo da media ==");
			System.out.println("======================");
			System.out.println("");
			System.out.print("Digite o seu nome: ");
			nome = teclado.nextLine();
			System.out.print("Digite a nota1: ");
			nota1 = teclado.nextDouble();
			System.out.print("Digite a nota2: ");
			nota2 = teclado.nextDouble();
			
			// processamento
			media = (nota1 + nota2) / 2;
			
			// saida
			System.out.println("-------------------------------");
			System.out.println("Nome: " + nome);
			System.out.println("Media: " + formatador.format(media));
			
			// estrutura de controle condicional
			if (media < 4) {
				System.out.println("REPROVADO");
			} else if (media >= 5) {
				System.out.println("APROVADO");
			} else {
				System.out.println("RECUPERACAO");
			}
			teclado.close();
	}
    
}
