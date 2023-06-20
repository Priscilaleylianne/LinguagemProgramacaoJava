package modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(float saldo) {
		super(saldo);
	}

	public void atualizarSaldo(float taxa) {
		taxa = taxa * 3;
		super.atualizarSaldo(taxa);
	}

	@Override
	public String toString() {
		return "\n ContaPoupanca [getSaldo()=" + getSaldo() + "]";
	}

}
