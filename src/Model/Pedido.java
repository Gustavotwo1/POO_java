package Model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Pedido {
    private int idPed;
    private Cliente idCli;
    private Date datePed;
    private List<ItemPedido> listProd;
    private double valorTotalPed;

    //Construtor padrão
    public Pedido() {
        this.listProd = new ArrayList<>();
    }

    //Construtor completo
    public Pedido(int idPed, Cliente idCli, Date datePed, List<ItemPedido> listProd) {
        this.idPed = idPed;
        this.idCli = idCli;
        this.datePed = datePed;
        this.listProd = listProd;
        calcularValorTotal(); //já calcula ao criar
    }

    //Getters
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
        return valorTotalPed;
    }

    //Setters
    public void SetidPed(int idPed) {
        this.idPed = idPed;
    }

    public void SetidCli(Cliente idCli) {
        this.idCli = idCli;
    }

    public void SetdataPedido(Date newdatePed) {
        this.datePed = newdatePed;
    }

    public void SetlistaProdutos(List<ItemPedido> newlistProd) {
        this.listProd = newlistProd;
        calcularValorTotal();
    }

    //Método para adicionar um item individualmente
    public void adicionarItem(ItemPedido item) {
        if (this.listProd == null) {
            this.listProd = new ArrayList<>();
        }
        this.listProd.add(item);
        calcularValorTotal();
    }

    //Método para calcular o valor total com base na lista
    private void calcularValorTotal() {
        double total = 0.0;
        if (listProd != null) {
            for (ItemPedido item : listProd) {
                total += item.Getproduto().GetpricePr() * item.Getquantidade();
            }
        }
        this.valorTotalPed = total;
    }
}
