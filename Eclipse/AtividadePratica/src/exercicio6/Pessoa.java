package exercicio6;

public class Pessoa {

//Atributos da classe Pessoa		
		String nome;
		String corDoCabelo;
		String biotipo;
		int idade;
//
		
		void setnome(String nome) {
			this.nome = nome;
		}
		
		public String getNome() {
			return nome;
		}
		
		void setcorDoCabelo(String corDoCabelo) {
			this.corDoCabelo = corDoCabelo;
		}
		
		public String getcorDoCabelo() {
			return corDoCabelo;
		}
		
		void setbiotipo(String biotipo) {
			this.biotipo = biotipo;
		}
		
		public String getbiotipo() {
			return biotipo;
		}
		
		public int getidade() {
			return idade;
		}
		public void setidade(int idade) {
			this.idade = idade;
		}
}
