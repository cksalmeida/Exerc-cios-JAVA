package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Usuario {
    private String nome;
    private String email;
    private String login;
    private String senha;

    Conexao con = new Conexao();
    
    public Usuario() {
    this("", "", "", "");
    }

    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    public void alterar(){
        
       String sql;
        sql = "update usuario set nome = '" + this.getNome() + "', email = '" + this.getEmail() +  "', login = '" + this.getLogin() +  "', senha = '" + this.getSenha() +"' where nome = " + this.getNome();
        JOptionPane.showMessageDialog(null, "Registro Alterado!!!");

    }
    public void excluir(){
        
      String sql;
       sql = "delete from usuario where nome='" + getNome() + "'";
       con.executeSQL(sql);
       JOptionPane.showMessageDialog(null, "Registro Excluído!!!");
    
    }   
}