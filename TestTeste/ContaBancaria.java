import java.lang.Math;

public class ContaBancaria {
	String nomeTitular;
	String cpfCnpj;
	String conta;
	String agencia;
	double saldo = 0;
	double taxa = 0.2;
	double rendimento;

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void redimento() {
		rendimento = saldo * Math.pow((1+taxa), 12);
	}
}