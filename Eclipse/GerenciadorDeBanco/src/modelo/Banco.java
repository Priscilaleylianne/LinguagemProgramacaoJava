package modelo;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Conta> contas;

	public Banco() {
		super();
		this.contas = new ArrayList<Conta>();
	}
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public Conta pegaConta(int posicao) {
		return this.contas.get(posicao);
	}
	
	public float pegaTotalDeContas() {
		float total = 0;
		for( Conta conta : this.contas) {
			total = total + conta.getSaldo();
		}
		return total;
	}
	
	public float pegaTotalDeContasCorrente() {
		float total = 0;
		for( Conta conta : this.contas ) {
			if(conta instanceof ContaCorrente) {
				total = total + conta.getSaldo();
			}
		}
		return total;
	}
}
