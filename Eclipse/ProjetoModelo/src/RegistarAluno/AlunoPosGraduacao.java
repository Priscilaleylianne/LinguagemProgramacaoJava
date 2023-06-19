package RegistarAluno;

public class AlunoPosGraduacao extends AlunoGraduacao {

	private String tese;
	private String orientador;
	
	public AlunoPosGraduacao(String nome, Data dataNascimento, int matricula,
		byte codCurso, double percCobranca, String tese, String orientador) {
		super(nome, dataNascimento, matricula, codCurso, percCobranca);
		this.tese = tese;
		this.orientador = orientador;
	}

	public String getTese() {
		return tese;
	}

	public void setTese(String tese) {
		this.tese = tese;
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public String toString() {
		String resultado = super.toString();
		return resultado + 
				"\n Tese: " + this.tese +
				"\n Orientados: " + this.orientador;
	}
	
	

}