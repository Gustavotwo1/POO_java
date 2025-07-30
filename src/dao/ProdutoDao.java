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
            comd.setString(1, produto.GetnamePr());
            comd.setDouble(2, produto.GetpricePr());
            comd.setString(3, produto.GetdescriptionPr());
            comd.setInt(4, produto.GetstockPr());

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
        String sql = "select from * produto";

        /*guardar resultado da consulta*/
        try(Connection conectar = Conexao.getConnection();
            Statement comd = conectar.createStatement();
            ResultSet res = comd.executeQuery(sql)){
            /*adiciona cada objeto na lista*/
            while(res.next()){
                Produto prod = new Produto();

                prod.SetidPr(res.getInt("id"));
                prod.SetnamePr(res.getString("nome"));
                prod.SetpricePr(res.getDouble("preco"));
                prod.SetdescriptionPr(res.getString("descricao"));
                prod.SetstockPr(res.getInt("estoque"));  

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
            comd.setString(1, produto.GetnamePr());
            comd.setDouble(2, produto.GetpricePr());
            comd.setInt(3, produto.GetstockPr());
            comd.setInt(4, produto.GetidPr());//id do produto a ser atualizado
            
            //atualizar
            comd.executeUpdate();
            
        }/*mostrar erro caso aconteça*/
        catch(SQLException erro){
            erro.printStackTrace();

        }

    }
}
