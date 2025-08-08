package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.Produto;//importando a classe produto

public class ProdutoDao {
    /*salvar um novo produto*/
    public void salvarProd(Produto produto){
        String sql = "insert into produto(nome, preco, descricao, estoque) values (?, ?, ?, ?) ";

        /*buscando valores para salvar*/
        try(Connection conectar = Conexao.getConnection();
            PreparedStatement comd = conectar.prepareStatement(sql)){

            //substitui os ? pelas strings e executa insert
            comd.setString(1, produto.getNamePr());
            comd.setDouble(2, produto.getPricePr());
            comd.setString(3, produto.getDescriptionPr());
            comd.setInt(4, produto.getStockPr());

            //inserir
            comd.executeUpdate();

        }
        /*mostra o erro caso aconteça*/
        catch(SQLException erro){
            erro.printStackTrace();

        }

    }

    /*mostrar toda lista de produtos*/
    public List<Produto> listarProd(){
        List<Produto> produtos = new ArrayList<>();//guardar produtos
        String sql = "select * from produto";

        /*guardar resultado da consulta*/
        try(Connection conectar = Conexao.getConnection();
            Statement comd = conectar.createStatement();
            ResultSet res = comd.executeQuery(sql)){
            /*adiciona cada objeto na lista*/
            while(res.next()){
                Produto prod = new Produto();

                prod.setidPr(res.getInt("id"));
                prod.setnamePr(res.getString("nome"));
                prod.setpricePr(res.getDouble("preco"));
                prod.setdescriptionPr(res.getString("descricao"));
                prod.setstockPr(res.getInt("estoque"));  

                //adicionar
                produtos.add(prod);
            }

        }
        /*mostra o erro caso aconteça*/
        catch(SQLException erro){
            erro.printStackTrace(); 

        }

        return produtos;
    }

    /*deletar um produto pelo id*/
    public void deletarProd(int id){
        String sql = "delete from produto where id = ?";

        try(Connection conectar = Conexao.getConnection();
            PreparedStatement comd = conectar.prepareStatement(sql)){
            comd.setInt(1, id);

            //deletar
            comd.executeUpdate();
                
        }
        /*mostra o erro caso aconteça*/
        catch(SQLException erro){
            erro.printStackTrace();

        }

    }

    /*atualizar um produto*/
    public void atualizarProd(Produto produto){
        String sql = "update produto set nome = ?, preco = ?, estoque = ? where = ?";

        try(Connection conectar = Conexao.getConnection();
            PreparedStatement comd = conectar.prepareStatement(sql)){
            comd.setString(1, produto.getNamePr());
            comd.setDouble(2, produto.getPricePr());
            comd.setInt(3, produto.getStockPr());
            comd.setInt(4, produto.getIdPr());//id do produto a ser atualizado
            
            //atualizar
            comd.executeUpdate();
            
        }/*mostrar erro caso aconteça*/
        catch(SQLException erro){
            erro.printStackTrace();

        }

    }
}
