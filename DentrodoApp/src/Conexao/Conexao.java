package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static void main(String[] args) throws SQLException {
        Connection connect;
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/sgn?zeroDateTimeBehavior=convertToNull", "root", "");
        System.out.println("Conectado com o servidor!");
        connect.close();

    }
}
