/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacao;
import java.util.Scanner;//programa utiliza a classe Scanner

/**
 *
 * Comparacao inteiros utilizando instrucao if, operadores 
 * relacionais e operadores de igualdade.
 */
public class Comparacao { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int numero1;
       int numero2;
       
        System.out.println("digite primeiro numero: ");
        numero1 = input.nextInt();
        
        System.out.println("digite segundo numero: ");
        numero2 = input.nextInt();
        
        if(numero1 == numero2) 
            System.out.printf("%d == %d%n", numero1, numero2);
        
         if(numero1 == numero2) 
            System.out.printf("%d ! %d%n", numero1, numero2);
        
         if(numero1 == numero2) 
            System.out.printf("%d < %d%n", numero1, numero2);
        
        if(numero1 == numero2) 
            System.out.printf("%d > %d%n", numero1, numero2);
        
        if(numero1 == numero2) 
            System.out.printf("%d <= %d%n", numero1, numero2);

       if(numero1 == numero2) 
            System.out.printf("%d >= %d%n", numero1, numero2);

    }
    
}
