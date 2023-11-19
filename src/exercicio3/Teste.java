package exercicio3;

public class Teste {
    public static void main(String[] args) {

        Produto produto = new Produto(2565);

        double valorComImposto = produto.getValorComImposto();

        System.out.println(produto.getValor());
        System.out.println(produto.getValorComImposto());
    }
}
