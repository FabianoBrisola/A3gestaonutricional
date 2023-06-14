

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String URL = "jdbc:mysql://localhost:3306/sgn";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    public static Connection obterConexao() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    public static void main(String[] args) {
        try {
            
            Connection conexao = ConexaoBD.obterConexao();
            System.out.println("Conexao estabelecida com sucesso!");
            
            conexao.close(); 
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexao com o banco de dados:");
            e.printStackTrace();
        }
    }
}

