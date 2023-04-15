package aula08;

public class Ex3 {
    public static void main(String[] args) {
        Produto p1 = new ProdutosGenericos("Camisolas", 10, 3);
        Produto p2 = new ProdutosGenericos("Calças", 30, 1);
        Produto p3 = new ProdutosComDesconto("Sapatilhas", 50, 2, 50);
        Produto p4 = new ProdutosComDesconto("Casacos", 100, 1, 10);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(p1, 1);
        carrinho.adicionarProduto(p2, 5);
        carrinho.adicionarProduto(p3, 2);
        carrinho.adicionarProduto(p4, 1);

        System.out.println("Produtos:");
        carrinho.listarProdutos();
        System.out.println("\nTotal: " + carrinho.calcularTotal());
    }
}

