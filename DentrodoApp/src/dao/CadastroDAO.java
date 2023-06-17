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
    // inserir usuario ao banco de dados 

    public CadastroDAO() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void insert(Cadastro cadastro) throws SQLException {
        String sql = "INSERT INTO cadastro(nome,cpf,telefone,dataNascimento,usuario,senha,estado,cidade,bairro,cep) VALUES ('" + cadastro.getNome() + "','" + cadastro.getCpf() + "','" + cadastro.getTelefone() + "','" + cadastro.getDataNascimento() + "','" + cadastro.getUsuario() + "','" + cadastro.getSenha() + "','" + cadastro.getEstado() + "','" + cadastro.getCidade() + "','" + cadastro.getBairro() + "','" + cadastro.getCep() + "');";
        PreparedStatement statmant = connection.prepareStatement(sql);
        statmant.execute();
        connection.close();
    }

}
