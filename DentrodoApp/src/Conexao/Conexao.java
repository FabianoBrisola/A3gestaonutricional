package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConnection() {
        Connection connection = null;

        try {
            // Configurações de conexão com o BD
            String url = "jdbc:mysql://localhost:3306/sgn";
            String user = "root";
            String password = "";

            // Estabelecer conexão com o BD
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }

        return connection;
    }
}
