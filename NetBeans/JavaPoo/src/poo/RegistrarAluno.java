/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author PRISCILA
 */
public class RegistrarAluno {

     private String nome;
     private String endereco;
     private int idade;
     private Double notaMatematica;
     private Double notaPortugues;
     private Double notaGeografia;

     private static int contadorEstudante;

		 public String getNome() {
		 return nome;
		 }

		 public void setNome(String nome) {
		 this.nome = nome;
		 }

		 public String getEndereco() {
		 return endereco;
		 }

		 public void setEndereco(String endereco) {
		 this.endereco = endereco;
		 }

		 public int getIdade() {
		 return idade;
		 }

		 public void setIdade(int idade) {
		 this.idade = idade;
		 }

		 public Double getNotaMatematica() {
		 return notaMatematica;
		 }

		 public void setNotaMatematica(Double notaMatematica) {
		 this.notaMatematica = notaMatematica;
		 }

		 public Double getNotaPortugues() {
		 return notaPortugues;
		 }

		 public void setNotaPortugues(Double notaPortugues) {
		 this.notaPortugues = notaPortugues;
		 }

		 public Double getNotaGeografia() {
		 return notaGeografia;
		 }

		 public void setNotaGeografia(Double notaGeografia) {
		 this.notaGeografia = notaGeografia;
		 }

		 public static int getContadorEstudante() {
		 return contadorEstudante;
		 }

		 public static void setContadorEstudante(int contadorEstudante) {
		 RegistrarAluno.contadorEstudante = contadorEstudante;
		 }
     
     
 }
 
 
 
 
