package modelo;

public class AlunoGraduacao {

	// atributos do aluno
	private String nome;
	private Data dataNascimento;
	private int matricula;
	private byte codCurso;
	private double percCobranca;

	// Constantes para os cursos oferecidos
	public static final byte ARQUITETURA = 1;
	public static final byte CIENCIADACOMPUTACAO = 2;
	public static final byte ENGENHARIA = 3;
	public static final byte BIOMEDICINA = 4;

	// construtor com parametros para inicializar atributos do aluno
	public AlunoGraduacao(String nome, Data dataNascimento, int matricula,
			byte codCurso, double percCobranca) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
		this.codCurso = codCurso;
		this.percCobranca = percCobranca;
	}

	public AlunoGraduacao(String nome, Data dataNascimento, int matricula,
			byte codCurso) {
		this(nome, dataNascimento, matricula, codCurso, 100);
	}

	public double calcularMensalidade() {
		double mensalidade = 0.00;
		switch (this.codCurso) {
		case ARQUITETURA:
			mensalidade = 450.00;
			break;
		case CIENCIADACOMPUTACAO:
			mensalidade = 650.00;
			break;
		case ENGENHARIA:
			mensalidade = 850.00;
			break;
		case BIOMEDICINA:
			mensalidade = 750.00;
			break;
		default:
			mensalidade = 0.00;
			break;
		}
		return mensalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public byte getCodCurso() {
		return codCurso;
	}

	public void setCodCurso(byte codCurso) {
		this.codCurso = codCurso;
	}

	public double getPercCobranca() {
		return percCobranca;
	}

	public void setPercCobranca(double percCobranca) {
		this.percCobranca = percCobranca;
	}

	public static byte getArquitetura() {
		return ARQUITETURA;
	}

	public static byte getCienciadacomputacao() {
		return CIENCIADACOMPUTACAO;
	}

	public static byte getEngenharia() {
		return ENGENHARIA;
	}

	public static byte getBiomedicina() {
		return BIOMEDICINA;
	}

	public String toString() {
		return "\n Nome: " + nome + 
			   "\n Data de nascimento: " + dataNascimento + 
			   "\n Matricula: " + matricula + 
			   "\n Curso: " + codCurso + 
			   "\n Percentual de Cobrança: " + percCobranca;
	}
	
	
}
