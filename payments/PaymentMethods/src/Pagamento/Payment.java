package Pagamento;

public class Payment {
    private double valorPago = 0;
    private double valorCobrar = 0;
    private double resultado = 0;

    public Payment(double valorPago, double valorCobrar){
        this.valorPago = valorPago;
        this.valorCobrar = valorCobrar;
    }

    private void pay(double valorPago, double valorCobrar){
        if(valorPago == 0){
            System.out.println("Nenhum valor para pagamento inserido!");
        } else if(valorPago > valorCobrar){
            this.resultado = calculaPagamento(valorPago, valorCobrar);
            System.out.println("Troco: " + this.resultado);
        } else if(valorCobrar == valorPago){
            System.out.println("Pagamento realizado!");
        }
    }

    private double calculaPagamento(double valor, double aPagar){
        return aPagar - valor;
    }
}
