package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Usuario {
    
    private String nome;
    private String login;
    private String senha;
    private String email;

    Conexao con = new Conexao();
    
    public Usuario() {
        this("", "", "", "");
    }

    public Usuario(String nome, String login, String senha, String email) {
        this.nome = nome;
        this.email = login;
        this.login = senha;
        this.senha = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void cadastrar(){
        
        String sql;
        sql = "insert into usuario(nome, email, login, senha) values"+
               "('" + getNome() + "' , '" + getEmail() + "' , '" + getLogin() + "' , '" + getSenha() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com Sucesso!");
        
    }
    
    public ResultSet consultar(){
        
        ResultSet tabela;
        tabela = null;
        String sql= "Select * from usuario";
        tabela = con.RetornarResultset(sql);
        return tabela;   
        
    }    
}