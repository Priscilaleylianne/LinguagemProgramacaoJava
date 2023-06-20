package modelo;

import excecoes.SaldoInsuficienteException;

public class Conta {

	private float saldo;

	public Conta(float saldo) {
		super();
		this.saldo = saldo;
	}

	public void depositar(float valorDeposito) {
		this.saldo = this.saldo + valorDeposito;
	}
	
	public void sacar( float valorSaque) throws SaldoInsuficienteException {
		if( valorSaque < this.saldo) {
			this.saldo = this.saldo - valorSaque;	
		}
		else {
			throw new SaldoInsuficienteException("\n Saldo Insuficiente para o valor do Saque", this.saldo, valorSaque);
		}
		
	}
	
	public void atualizarSaldo(float taxa ) {
		this.saldo = this.saldo + ( this.saldo * taxa / 100);
	}
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "\n Conta [saldo=" + saldo + "]";
	}

}
