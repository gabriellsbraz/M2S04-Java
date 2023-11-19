package exercicio3;

public class Produto implements Tributavel{

    private double valor;
    private double valorImposto;


    public Produto(double valor){
        this.valor = valor;
        this.valorImposto = calcularValorComImposto();
    }

    @Override
    public double calcularValorComImposto(){
        double taxa = 0.34;
        return valor * (1 + taxa);
    }

    public double getValorComImposto() {
        return valorImposto;
    }

    public double getValor() {
        return valor;
    }
}
