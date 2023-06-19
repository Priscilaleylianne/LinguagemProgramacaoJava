package exercicio4;

import java.util.Scanner;

public class EstoqueMedio {

    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
	double quantidade_minima, quantidade_maxima,estoque_medio;
	
	System.out.print("Calculadora de Estoque Medio\n\n");
	
	System.out.print("Digite a quantidade mimima:");
	quantidade_minima = entrada.nextDouble();
	
	System.out.print("Digite a quantidade maxima:");
	
	quantidade_maxima = entrada.nextDouble();
	estoque_medio = (quantidade_minima + quantidade_maxima ) / 2;
	
	System.out.print("Estoque Medio = "+estoque_medio+"\n");
	
    }

}
