package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.Cliente;//importando a classe Cliente

public class ClienteDao {
    /*salvar um novo cliente*/
    public void salvarCli(Cliente cliente){
        String sql = "insert into cliente(nome, email, endereco, telefone) values(?, ?, ?, ?)";

        try(Connection conectar = Conexao.getConnection();
            PreparedStatement comd = conectar.prepareStatement(sql)){
            comd.setString(1, cliente.getNameCl());
            comd.setString(2, cliente.getEmailCl());
            comd.setString(3, cliente.getAddressCl());
            comd.setString(4, cliente.getPhoneCl());

            //salvar
            comd.executeUpdate();

        }
        /*em caso de erro mostrar*/
        catch(SQLException erro){
            erro.printStackTrace();

        }

    }
    /*listar clientes*/
    public List<Cliente> listarCli(){
        List<Cliente> clientes = new ArrayList<>();
        String sql = "select * from cliente";

        try(Connection conectar = Conexao.getConnection();
            Statement comd = conectar.createStatement();
            ResultSet res =  comd.executeQuery(sql)){

            /*Percorre as linha do banco enquanto ainda houver.*/
            while(res.next()){
                Cliente cliente =  new Cliente();//guarda dados
                cliente.setidCl(res.getInt("id"));
                cliente.setnameCl(res.getString("nome"));
                cliente.setemailCl(res.getString("email"));
                cliente.setaddressCl(res.getString("endereco"));
                cliente.setphoneCl(res.getString("telefone"));
                //add cliente na lista
                clientes.add(cliente);

            }
        }
        /*mostra o erro caso tenha*/
        catch(SQLException erro){
            erro.getMessage();

        }

        return clientes;
    }

    /*atualizar cliente*/
    public void atualizarCli(Cliente cliente){
        String sql = "update cliente set nome = ?, email = ?, endereco = ?, telefone = ? where id = ?";

        try(Connection conectar = Conexao.getConnection();
            PreparedStatement comd = conectar.prepareStatement(sql)){
            comd.setString(1, cliente.getNameCl());
            comd.setString(2, cliente.getEmailCl());
            comd.setString(3, cliente.getAddressCl());
            comd.setString(4, cliente.getPhoneCl());
            comd.setInt(5, cliente.getIdCl());//id do cliente para atualizar

            //atualizar cliente
            comd.executeUpdate();

        }/*mostrar erro se acontecer*/
        catch(SQLException erro){
            erro.printStackTrace(); 

        }

    }
    //deletar um cliente
    public void deletarCli(int id){
        String sql = "delete from produto where id = ?";
        try(Connection conectar = Conexao.getConnection();
            PreparedStatement comd = conectar.prepareStatement(sql)){
            comd.setInt(1, id);

            //deletar cliente
            comd.executeUpdate();

        }
        /*mostrar erro caso tenha*/
        catch(SQLException erro){
            erro.printStackTrace();

        }

    }

}
