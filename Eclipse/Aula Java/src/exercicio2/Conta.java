package exercicio2;

public class Conta {

	String titular;
    int numero;
    String agencia;
    double saldo;
    double depoita;
    String dataDeAbertura;

    void saca (double valor) {
        this.saldo -= valor;
    }

    void deposita (double valor) {
        this.saldo += valor;
    }
    
    

    double calculaRendimento() {
        return this.saldo * 0.1;
    }
    
 // Seus outros atributos e métodos.

    String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nSaldo: R$" + this.saldo;
        dados += "\nData de abertura: " + this.dataDeAbertura;
        return dados;
    }
    
    
}
