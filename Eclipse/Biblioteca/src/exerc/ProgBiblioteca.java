package exerc;

import modelo.Livro;

public class ProgBiblioteca {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro(123, "Cinquenta Tons de Cinza", "E L James");
		Livro livro2 = new Livro(456, "PLT", "Rafael Santos");
		Livro livro3 = new Livro(789, "Sei la", "Joao Ninguem");
		
		livro1.emprestar();
		System.out.print(livro1);
		livro1.devolver();
		System.out.printf(livro1.toString());
		
	}

}
