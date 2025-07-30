package Model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Pedido {
    private int idPed;
    private Cliente idCli;
    private Date datePed;
    private List<ItemPedido> listProd;
    private double valueTotalPed;

    //construtor padrão
    public Pedido() {
        this.listProd = new ArrayList<>();
    }

    //construtor completo
    public Pedido(int idPed, Cliente idCli, Date datePed, List<ItemPedido> listProd) {
        this.idPed = idPed;
        this.idCli = idCli;
        this.datePed = datePed;
        this.listProd = listProd;
        calcularValorTotal();//calcula ao criar
    }

    //getters
    public int GetidPed() {
        return idPed;
    }

    public Cliente GetidCli() {
        return idCli;
    }

    public Date GetdatePed() {
        return datePed;
    }

    public List<ItemPedido> GetlistProd() {
        return listProd;
    }

    public double GetvalorTotalPed() {
        return valueTotalPed;
    }

    //setters
    public void SetidPed(int newidPed) {
        this.idPed = newidPed;
    }

    public void SetidCli(Cliente newidCli) {
        this.idCli = newidCli;
    }

    public void SetdataPedido(Date newdatePed) {
        this.datePed = newdatePed;
    }

    public void SetlistaProdutos(List<ItemPedido> newlistProd) {
        this.listProd = newlistProd;
        calcularValorTotal();
    }

    //adiciona um item individualmente
    public void adicionarItem(ItemPedido item) {
        if (this.listProd == null) {
            this.listProd = new ArrayList<>();
        }
        this.listProd.add(item);
        calcularValorTotal();
    }

    //calcula o valor total da lista
    private void calcularValorTotal() {
        double total = 0.0;
        if (listProd != null) {
            for (ItemPedido item : listProd) {
                total += item.GetproductIPD().GetpricePr() * item.GetamountIPD();
            }
        }
        this.valueTotalPed = total;
    }
}
