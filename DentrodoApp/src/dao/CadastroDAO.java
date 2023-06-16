package dao;

import Cadastro.Cadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroDAO {

    private final Connection connection;

    public CadastroDAO(Connection connection) {
        this.connection = connection;
    }
    // metodo de inserir usuario ao banco de dados 

    public void insert(Cadastro cadastro) throws SQLException {
        String sql = "INSERT INTO cadastro(nome,cpf,telefone,dataNascimento,usuario,senha,estado,cidade,bairro,cep) VALUES ('adm','adm','adm','adm','adm','adm','adm','adm','adm','adm');";
        PreparedStatement statmant = connection.prepareStatement(sql);
        statmant.execute();
        
    }

}
