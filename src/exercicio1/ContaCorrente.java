package exercicio1;

public class ContaCorrente extends Conta implements Operavel{
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);  // ta passando o valor inicial para Conta
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }

}
