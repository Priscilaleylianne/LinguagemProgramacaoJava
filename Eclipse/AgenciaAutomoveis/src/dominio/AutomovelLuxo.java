package dominio;

public class AutomovelLuxo extends Automovel {

	/*
	 * Um Autom�vel de Luxo possui as mesmas informa��es de um Autom�vel porem
	 * tamb�m pode ter dire��o hidr�ulica, ar condicionado e vidros el�tricos.
	 * Alem disso o Autom�vel de Luxo possui computador de bordo e por isso pode
	 * estacionar sozinho.
	 */
	private boolean possuiDirecaoHidraulica;
	private boolean possuiArCondicionado;
	private boolean possuiVidroEletrico;

	/**
	 * Construtor parametrizado que so inicializa os atributos herdados
	 * 
	 * @param placa
	 * @param modelo
	 * @param combustivel
	 * @param cor
	 * @param ano
	 */
	public AutomovelLuxo(String placa, String modelo, byte combustivel,
			String cor, short ano) {
		super(placa, modelo, combustivel, cor, ano);

	}

	/**
	 * Construtor parametrizado inicializa todos os atributos
	 * 
	 * @param placa
	 * @param modelo
	 * @param combustivel
	 * @param cor
	 * @param ano
	 * @param possuiDirecaoHidraulica
	 * @param possuiArCondicionado
	 * @param possuiVidroEletrico
	 */
	public AutomovelLuxo(String placa, String modelo, byte combustivel,
			String cor, short ano, boolean possuiDirecaoHidraulica,
			boolean possuiArCondicionado, boolean possuiVidroEletrico) {

		// Chama o construtor da classe ancestral Automovel
		super(placa, modelo, combustivel, cor, ano);

		// Inicializa os atributos da classe Automovel de Luxo
		this.possuiDirecaoHidraulica = possuiDirecaoHidraulica;
		this.possuiArCondicionado = possuiArCondicionado;
		this.possuiVidroEletrico = possuiVidroEletrico;
	}

	public double calcularCusto() {
		
		// Custo inicial do Automovel de Luxo � o
		// custo de um Automovel.
		// Chama o metodo calcula custo do Automovel que
		// e a classe ancestral
		double custo = super.calcularCusto();		
		/*
		 * Ar condicionado = 2.000,00
			Dire��o Hidr�ulica = 1.500,00
			Vidro el�trico = 800,00
		 */
		if(this.possuiArCondicionado )
			custo=+ 2000;
		if(this.possuiDirecaoHidraulica)
			custo=+1500;
		if(this.possuiVidroEletrico)
			custo=+800;
		
		return custo;
	}
	public boolean isPossuiDirecaoHidraulica() {
		return possuiDirecaoHidraulica;
	}

	public void setPossuiDirecaoHidraulica(boolean possuiDirecaoHidraulica) {
		this.possuiDirecaoHidraulica = possuiDirecaoHidraulica;
	}

	public boolean isPossuiArCondicionado() {
		return possuiArCondicionado;
	}

	public void setPossuiArCondicionado(boolean possuiArCondicionado) {
		this.possuiArCondicionado = possuiArCondicionado;
	}

	public boolean isPossuiVidroEletrico() {
		return possuiVidroEletrico;
	}

	public void setPossuiVidroEletrico(boolean possuiVidroEletrico) {
		this.possuiVidroEletrico = possuiVidroEletrico;
	}

	public String toString() {
		return "AutomovelLuxo [possuiDirecaoHidraulica="
				+ possuiDirecaoHidraulica + ", possuiArCondicionado="
				+ possuiArCondicionado + ", possuiVidroEletrico="
				+ possuiVidroEletrico + "]";
	}

}
