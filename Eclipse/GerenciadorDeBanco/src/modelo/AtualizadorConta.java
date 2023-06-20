package modelo;

public class AtualizadorConta {

	private float saldoTotal;
	private float taxaSelic;

	public AtualizadorConta(float taxaSelic) {
		this.taxaSelic = taxaSelic;
	}
	
	public void atualizaSaldo(Conta conta) {		
		// Saldo antes da atualizacao
		System.out.print("\n Saldo da Conta : "+conta.getSaldo());
		
		// Atualiza o saldo da conta ( seja ela conta poupanca ou conta corrente )
		conta.atualizarSaldo(this.taxaSelic);
		
		// Saldo depois da atualizacao
		System.out.print("\n Saldo Atualizado da Conta : "+conta.getSaldo());
		
		// Totaliza o total de saldo
		this.saldoTotal = this.saldoTotal + conta.getSaldo();
	}
	
	public float getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(float saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public float getTaxaSelic() {
		return taxaSelic;
	}

	public void setTaxaSelic(float taxaSelic) {
		this.taxaSelic = taxaSelic;
	}

	@Override
	public String toString() {
		return "AtualizadorConta [saldoTotal=" + saldoTotal + ", taxaSelic="
				+ taxaSelic + "]";
	}

}
