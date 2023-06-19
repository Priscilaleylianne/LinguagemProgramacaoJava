package modelo;

public class Livro {

	private int isbn;
	private String titulo;
	private String autor;
	private String editora;
	private int edicao;
	private int anoPublicacao;
	private String status;
		
	public Livro(int isbn, String titulo, String autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.status = "Disponivel";
	}
	
	public void emprestar(){
		this.status = "Emprestado";
	}
	
	public void devolver(){
		this.status = "Devolvido";
	}
	
	public String consultar(){
		return "\n"+String.valueOf(this.isbn)+" - "+this.titulo+" - "+this.status;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "\nLivro [isbn=" + isbn + ", titulo=" + titulo + ", autor="
				+ autor + ", editora=" + editora + ", edicao=" + edicao
				+ "\n, anoPublicacao=" + anoPublicacao + ", status=" + status
				+ "]";
	}
}
