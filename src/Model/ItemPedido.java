package Model;

public class ItemPedido{
    private Produto product;
    private int amount;

    /*construtor padrão*/
    public ItemPedido() { }

    /*construtor completo */
    public ItemPedido(Produto product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Produto GetproductIPD() {
        return product;
    }
    
    public int GetamountIPD() {
        return amount;
    }

    public void SetproductIPD(Produto newProduct) {
        this.product = newProduct;
    }

    public void SetamountIPD(int newAmount) {
        if (newAmount < 1) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        this.amount = newAmount;
    }
}
