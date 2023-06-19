package exercicio5;

import java.util.Scanner;

public class CanetaTesteVetor{
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    Caneta[] canetas = new Caneta[50];
    int opcoes,quantidadeCanetas=0;
    do{
      System.out.println("Digite uma das seguintes opcoes:\n\t1–Cadastrar caneta\n\t2–Exibir todas as canetas\n\t3–Exibir quantidade de canetas cadastradas\n\t4–Consultar quantidade de canetas de uma determinada cor (digitada pelo usuario)\n\t0-Sair");
      opcoes = Integer.parseInt(entrada.nextLine());
      switch(opcoes){
        case 1:
          if(quantidadeCanetas>=50){
            System.out.println("Ja existem muitas canetas.");
          }else{
            String marca, cor;
            int tamanho;
            System.out.print("Digite a marca: ");
            marca = entrada.nextLine();
            System.out.print("Digite a cor: ");
            cor = entrada.nextLine();
            System.out.print("Digite o tamanho (inteiros): ");
            tamanho = Integer.parseInt(entrada.nextLine());
            canetas[quantidadeCanetas]= new Caneta(marca,cor,tamanho);
            quantidadeCanetas++;
          }
          break;
        case 2:
          for(int x=0;x<quantidadeCanetas;x++){
            System.out.print(canetas[x].toString());
          }
          break;
        case 3:
          System.out.println((quantidadeCanetas==1)?"Existe "+quantidadeCanetas+" caneta cadastrada":"Existem "+quantidadeCanetas+" canetas cadastradas");
          break;
        case 4:
          String corProcurada;
          System.out.print("Digite a cor: ");
          corProcurada = entrada.nextLine();
          for(int x=0;x<quantidadeCanetas;x++){
            if(corProcurada.equals(canetas[x].getCor())){
              System.out.println(canetas[x].toString()  );
            }
          }
          break;
        case 0:
          break;
        default: System.out.println("Voce digitou a opcao errada, tente novamente.");
      }
    } while(opcoes!=0);
  }
}

