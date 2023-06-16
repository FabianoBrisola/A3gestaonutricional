package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public Connection getConnection() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/sgn?zeroDateTimeBehavior=convertToNull", "root", "");
        System.out.println("conectado");
        return conexao;
    }
}
