package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Criar_BD {

    String sql = "CREATE DATABASE IF NOT EXISTS `sgn`;";
    String sql2 = " USE `sgn`;";
    String sql3 = "CREATE TABLE IF NOT EXISTS `cadastro` (`id_cadastro` int(11) NOT NULL AUTO_INCREMENT,`nome` varchar(50) NOT NULL, `cpf` varchar(50) NOT NULL, `telefone` varchar(50) NOT NULL, `dataNascimento` varchar(50) NOT NULL, `usuario` varchar(50) NOT NULL, `senha` varchar(50) NOT NULL, `estado` varchar(50) NOT NULL, `cidade` varchar(50) NOT NULL, `bairro` varchar(50) NOT NULL, `cep` varchar(50) NOT NULL, PRIMARY KEY (`id_cadastro`))";

    public void criarBD() {

        try (Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
                Statement stmt = conexao.createStatement();) {
            stmt.executeUpdate(sql);
            stmt.executeUpdate(sql2);
            stmt.executeUpdate(sql3);
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
