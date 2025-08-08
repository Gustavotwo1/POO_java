package Model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Pedido {
    private int idPed;
    private Cliente cliente;
    private Date datePed;
    private List<ItemPedido> listProd;
    private double valueTotalPed;

    //construtor padrão
    public Pedido() {
        this.listProd = new ArrayList<>();
    }

    //construtor completo
    public Pedido(int idPed, Cliente cliente, Date datePed, List<ItemPedido> listProd) {
        this.idPed = idPed;
        this.cliente = cliente;
        this.datePed = datePed;
        this.listProd = listProd;
        calcularValorTotal();//calcula ao criar
    }

    //getters
    public int getidPed() {
        return idPed;
    }

    public Cliente getCli() {
        return cliente;
    }

    public Date getdatePed() {
        return datePed;
    }

    public List<ItemPedido> getlistProd() {
        return listProd;
    }

    public double getvalorTotalPed() {
        return valueTotalPed;
    }

    //setters
    public void setidPed(int newidPed) {
        this.idPed = newidPed;
    }

    public void setCli(Cliente newCli) {
        this.cliente = newCli;
    }

    public void setdataPedido(Date newdatePed) {
        this.datePed = newdatePed;
    }

    public void setlistaProdutos(List<ItemPedido> newlistProd) {
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
                total += item.getproductIPD().getpricePr() * item.getamountIPD();
            }
        }
        this.valueTotalPed = total;
    }
}
