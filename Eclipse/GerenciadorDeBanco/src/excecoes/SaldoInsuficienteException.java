package excecoes;

public class SaldoInsuficienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8358399202066822126L;

	private float saldo;
	private float valorSaque;

	public SaldoInsuficienteException(String erro, float saldo2, float valorSaque2) {
		super(erro);
		this.saldo = saldo2;
		this.valorSaque = valorSaque2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getValorSaque() {
		return valorSaque;
	}

	public void setValorSaque(float valorSaque) {
		this.valorSaque = valorSaque;
	}

}
