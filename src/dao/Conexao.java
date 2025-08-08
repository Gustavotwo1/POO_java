package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:sqlserver://127.0.0.1:1433; databaseName=ecommerce; encrypt=false; trustServerCertificate=true;";
    private static final String USER = "sa";
    private static final String PASSWORD = "desde1914";

    public static Connection getConnection() {
        try {
            // Carrega o driver do SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Tenta a conexão
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado!");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco!");
            e.printStackTrace();
            return null;
        }
    
    }
}

