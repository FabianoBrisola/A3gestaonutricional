
package Cadastro;


public class Cadastro {
   private int id;
   private String nome;
   private String cpf;
   private String telefone;
   private String dataNascimento;
   private String usuario;
   private String senha;
   private String estado;
   private String cidade;
   private String bairro;
   private String cep;
   
   
   //metodo construtor

    public Cadastro(int id, String nome, String cpf, String telefone, String dataNascimento, String usuario, String senha, String estado, String cidade, String bairro, String cep) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.usuario = usuario;
        this.senha = senha;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
    }
   
   //segundo metodo construtor

    public Cadastro(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    //adicionar get e set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
}
