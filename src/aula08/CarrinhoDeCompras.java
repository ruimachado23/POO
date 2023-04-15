package aula08;

public class CarrinhoDeCompras implements Compra{
    private Produto[] produtos;
    private int quantidade;
    private double total;

    public CarrinhoDeCompras() {
        this.produtos = new Produto[10];
        this.quantidade = 0;
        this.total = 0;
    }

    @Override
    public void adicionarProduto(Produto produto, int quantidade) {
        this.produtos[this.quantidade] = produto;
        this.quantidade++;
        this.total += produto.getPreco() * quantidade;
    }

    @Override
    public void listarProdutos() {
        for (int i = 0; i < this.quantidade; i++) {
            System.out.println(this.produtos[i].getNome());
        }
    }

    @Override
    public double calcularTotal() {
        return this.total;
    }
}
