package aula08;

public class ProdutosComDesconto implements Produto{
    private String nome;
    private int quantidade;
    private double preco;
    private int desconto;

    public ProdutosComDesconto(String nome, int quantidade, double preco, int desconto) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDesconto() {
        return this.desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }
}
