package exercicio1;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    protected double obterSaldoAtual() {
        return saldo;
    }
}




