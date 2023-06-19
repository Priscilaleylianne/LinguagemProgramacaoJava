package classeAbstratas;
public abstract class RobotAbstrato {

	private String nome;
	private int posicaoX;
	private int posicaoY;
	private short direcao;

	public RobotAbstrato(String nome, int posicaoX, int posicaoY, short direcao) {
		super();
		this.nome = nome;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.direcao = direcao;
	}

	public void move() {
		move(1);
	}

	public abstract void move(int passos);

	public void moveX(int passos) {
		this.posicaoY = +passos;
	}

	public void moveY(int passos) {
		this.posicaoY = +passos;
	}

	public void mudaDirecao(short novaDirecao) {
		this.direcao = novaDirecao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public short qualDirecaoAtual() {
		return direcao;
	}

	public String toString() {
		return "RobotAbstrato [nome=" + nome + ", posicaoX=" + posicaoX
				+ ", posicaoY=" + posicaoY + ", direcao=" + direcao + "]";
	}
}
