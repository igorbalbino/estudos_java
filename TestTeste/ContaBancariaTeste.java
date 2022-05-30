import junit.framework.*;

public class ContaBancariaTeste extends TestCase {
	
	public ContaBancariaTeste(){
		ContaBancaria conta = new ContaBancaria();
		conta.deposito(1000);
		assertEqual(1000, conta.saldo, 0);
	}
	
	public static void main(String[] args) {
		new ContaBancariaTeste();
	}
}