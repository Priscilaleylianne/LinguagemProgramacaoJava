package classeAbstratas;

public class RobotABateria extends RobotAbstrato {

	private int energia;
	
	public RobotABateria(String nome, int posicaoX, int posicaoY, short direcao, int energia) {
		super(nome, posicaoX, posicaoY, direcao);
		this.energia = energia;
	}

	public void move(int passos) {
		
		int energiaASerGasta = passos * 10;
		
		if (energiaASerGasta < energia ) {
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
			energia =- energiaASerGasta;
		}
	}
}
