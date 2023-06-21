package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login_DAO {

    Connection log;

    public ResultSet autenticarUsuario(String usuario, String senha) throws SQLException {

        log = new ConexaoDAO().getConnection();

        try {
            String sql = "SELECT * FROM cadastro where usuario = ? and senha = ?";

            PreparedStatement preparar = log.prepareStatement(sql);
            preparar.setString(1, usuario);
            preparar.setString(2, senha);
            ResultSet resultado = preparar.executeQuery();
            return resultado;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " userLogDAO" + e);
            return null;
        }

    }
}
