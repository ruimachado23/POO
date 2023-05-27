package avaliacao2;
import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private static int contadorPedidos = 0;
    private int id;
    private List<Item> composicao;
    private String idLoja;
    private String idCliente;
    private LocalDate dataHoraPedido;
    private boolean pedidoExpresso;

    public Pedido(List<Item> composicao, String idLoja, String idCliente, LocalDate dataHoraPedido, boolean pedidoExpresso) {
        this.id = ++contadorPedidos;
        this.composicao = composicao;
        this.idLoja = idLoja;
        this.idCliente = idCliente;
        this.dataHoraPedido = dataHoraPedido;
        this.pedidoExpresso = pedidoExpresso;
    }
    
    public int getId() {
        return id;
    }

    public List<Item> getComposicao() {
        return composicao;
    }

    public void setComposicao(List<Item> composicao) {
        this.composicao = composicao;
    }

    public String getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(String idLoja) {
        this.idLoja = idLoja;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(LocalDate dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public boolean isPedidoExpresso() {
        return pedidoExpresso;
    }

    public void setPedidoExpresso(boolean pedidoExpresso) {
        this.pedidoExpresso = pedidoExpresso;
    }
}
