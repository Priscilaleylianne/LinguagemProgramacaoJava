package classeAbstratas;
public class RobotSimples extends RobotAbstrato {

	public RobotSimples(String nome, int posicaoX, int posicaoY, short direcao) {
		super(nome, posicaoX, posicaoY, direcao);
	}

	public void move(int passos) {
		switch (this.qualDirecaoAtual()) {
		case 0:
			this.moveX(+passos);
		case 90:
			this.moveY(+passos);
		case 180:
			this.moveX(-passos);
		case 270:
			this.moveY(-passos);
		}
	}

}
