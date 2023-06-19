package exercicio2;

public class TestaConta {

	public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.titular = "MARIA EDUARDA SOUZA";
        c1.numero = 3142;
        c1.agencia = "45655-8";
        c1.saldo = 1000.00;
        c1.dataDeAbertura = "24/11/2022";

        c1.deposita(100.0);
        System.out.println("saldo atual:" + c1.saldo);
        System.out.println("rendimento mensal:" + c1.calculaRendimento());
        
    }
}
