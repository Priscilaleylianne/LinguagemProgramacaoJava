package exec;

import modelo.AtualizadorConta;
import modelo.Banco;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import excecoes.SaldoInsuficienteException;

public class GerenciaBancos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		Conta conta = new Conta(100);
		
		ContaCorrente contaCorrente = new ContaCorrente(200);
		ContaPoupanca contaPoupanca = new ContaPoupanca(300);
		ContaCorrente contaCorrenteFlamenguista = new ContaCorrente(100);
		ContaPoupanca contaPoupancaFlamenguista = new ContaPoupanca(10);
		ContaCorrente contaCorrenteTricolor = new ContaCorrente(20000);
		ContaPoupanca contaPoupancaTricolor = new ContaPoupanca(430000);
		ContaCorrente contaCorrenteBotafoguense = new ContaCorrente(50000);
		ContaPoupanca contaPoupancaBotafoguense = new ContaPoupanca(830000);
		ContaCorrente contaCorrenteVascaino = new ContaCorrente(200);
		ContaPoupanca contaPoupancaVascaino = new ContaPoupanca(30);
		
		System.out.print(contaCorrente);
		System.out.print(contaPoupanca);
		
		contaCorrente.depositar((float) 100.00);
		System.out.print(contaCorrente);
		
		try {
			contaPoupanca.sacar((float) 1000.00);
		} catch (SaldoInsuficienteException erroNoSaque) {
			System.out.print(erroNoSaque.getMessage() + " " + 
					         erroNoSaque.getSaldo() + " " + 
					         erroNoSaque.getValorSaque());
		}
		System.out.print(contaPoupanca);
		
		contaCorrente.atualizarSaldo((float) 10.00);
		System.out.print(contaCorrente);
		
		contaPoupanca.atualizarSaldo((float) 5.00);
		System.out.print(contaPoupanca);
		
		AtualizadorConta atualizador = new AtualizadorConta((float) 10.00);
		
		atualizador.atualizaSaldo(contaCorrenteFlamenguista);
		atualizador.atualizaSaldo(contaCorrenteTricolor);
		atualizador.atualizaSaldo(contaCorrenteBotafoguense);
		atualizador.atualizaSaldo(contaCorrenteVascaino);
		
		atualizador.atualizaSaldo(contaPoupancaFlamenguista);
		atualizador.atualizaSaldo(contaPoupancaTricolor);
		atualizador.atualizaSaldo(contaPoupancaBotafoguense);
		atualizador.atualizaSaldo(contaPoupancaVascaino);
		
		System.out.print("\n Saldo Total Atualizado: " + atualizador.getSaldoTotal());
		
		Banco banco = new Banco();
		
		banco.adicionarConta(contaPoupancaVascaino);
		banco.adicionarConta(contaPoupancaBotafoguense);
		banco.adicionarConta(contaCorrenteTricolor);
		banco.adicionarConta(contaCorrenteFlamenguista);
		banco.adicionarConta(contaCorrenteBotafoguense);
		banco.adicionarConta(contaCorrenteVascaino);
		
		float totalContas = banco.pegaTotalDeContas();
		System.out.print("\n Saldo Total de Todas as Contas: " + totalContas);
		
		float totalContasCorrente = banco.pegaTotalDeContasCorrente();
		System.out.print("\n Saldo Total de Todas as Contas Correntes: " + totalContasCorrente);
		
	}

}
