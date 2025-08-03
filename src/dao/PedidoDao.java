package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Model.Pedido;
import Model.Cliente;

public class PedidoDao {
    /*salvar um pedido do cliente */
    public void salvarPed(Pedido pedido){
        String sql = "insert into pedido (id_cliente, data_pedido, valor_total) values(?, ?, ?)";

        try(Connection conexao = Conexao.getConnection();                     //pegar chave primaria
            PreparedStatement comd = conexao.prepareStatement(sql,  Statement.RETURN_GENERATED_KEYS)){
            comd.setInt(1, pedido.GetCli().GetidCl());//pegar o id do cliente
            comd.setDate(2, new java.sql.Date(pedido.GetdatePed().getTime()));//converte a data pro sql
            comd.setDouble(3, pedido.GetvalorTotalPed());
            //salva
            comd.executeUpdate();

            /*pega o id gerado e define no objeto*/
            ResultSet res = comd.getGeneratedKeys();
            if (res.next()) {
                pedido.SetidPed(res.getInt(1));
                
            }

        /*mostra o erro caso tenha*/
        }catch(SQLException erro){
            erro.printStackTrace();

        }

    }
    /*listar pedidos */
    public List<Pedido> listar() {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "select * from pedido";

        try (Connection conexao = Conexao.getConnection();
             Statement comd = conexao.createStatement();
             ResultSet res = comd.executeQuery(sql)) {

            while (res.next()) {
                Pedido pedido = new Pedido();
                pedido.SetidPed(res.getInt("id"));
        
                /*continuar*/

            }

        } catch (SQLException erro) {
            erro.printStackTrace();
        }

        return pedidos;
    }
    


}
