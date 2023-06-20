package modelo;

public class ContaCorrente extends Conta {

	public ContaCorrente(float saldo) {
		super(saldo);
	}

	public void atualizarSaldo(float taxa) {
		taxa = taxa * 2;
		super.atualizarSaldo(taxa);
	}

	public void depositar(float valorDeposito) {
		valorDeposito = (float) (valorDeposito - 0.10);
		super.depositar(valorDeposito);
	}

	@Override
	public String toString() {
		return "\n ContaCorrente [getSaldo()=" + getSaldo();
	}

}
