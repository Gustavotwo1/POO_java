package Model;

public class ItemPedido{
    private Produto produto;
    private int quantidade;

    public ItemPedido() { }

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto Getproduto() {
        return produto;
    }

    public void Setproduto(Produto novoProduto) {
        this.produto = novoProduto;
    }

    public int Getquantidade() {
        return quantidade;
    }

    public void Setquantidade(int novaQuantidade) {
        if (novaQuantidade < 1) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        this.quantidade = novaQuantidade;
    }
}
