package exercicio3;

import javax.swing.*;

public class Senha4 {

	    public static void main(String[] args) {        
	        String cadastroSenha;
	        String confirmaSenha;
	        double a;
	        double b;
	     
	        cadastroSenha = JOptionPane.showInputDialog(null,"Senha","",JOptionPane.QUESTION_MESSAGE);
	         
	        a = Double.parseDouble(JOptionPane.showInputDialog(null,"Primeiro número","",JOptionPane.QUESTION_MESSAGE));
	        b = Double.parseDouble(JOptionPane.showInputDialog(null,"Segundo  número","",JOptionPane.QUESTION_MESSAGE));
	         
	        confirmaSenha = JOptionPane.showInputDialog(null,"Digite sua senha","",JOptionPane.QUESTION_MESSAGE);
	         
	        if (confirmaSenha.equals(cadastroSenha)){
	            System.out.println(a/b);
	        }else{
	            System.out.println("Senha incorreta");
	        }
	         
	        System.exit(0);
	    }
}


/*
 * Desenvolver programa que peca ao usuario para cadastrar uma senha; 
 * na sequencia, deve pedir ao usuario que digite duas variaveis reais, e ira calcular a 
 * divisão da primeira pela segunda. O programa ira pedir ao usuario que digite sua senha:
 * Se estiver correta ela mostra o resultado da divisao. Senao da mensagem de erro e encerra 
 * o aplicativo.
 * */
