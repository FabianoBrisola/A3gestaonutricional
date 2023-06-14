

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_banco_de_dados";
    private static final String USUARIO = "seu_usuario";
    private static final String SENHA = "sua_senha";

    public static Connection obterConexao() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    public static void main(String[] args) {
        try {
            
            Connection conexao = ConexaoBD.obterConexao();
            System.out.println("Conexão estabelecida com sucesso!");
            // Faça operações com o banco de dados usando a conexão
            // ...
            conexao.close(); // Feche a conexão quando não for mais necessária
        } catch (SQLException e) {
            System.out.println("Erro ao estabelecer conexão com o banco de dados:");
            e.printStackTrace();
        }
    }
}

