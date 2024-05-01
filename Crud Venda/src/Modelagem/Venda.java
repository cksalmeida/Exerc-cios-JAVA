
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Venda {
    
    private int codigo;
    private String nomeVendedor;
    private String produtoVendido;

    Conexao con = new Conexao();
    
    public Venda() {
        this(0,"","");
    }

    public Venda(int codigo, String nomeVendedor, String produtoVendido) {
        
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.produtoVendido = produtoVendido;
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
       this.produtoVendido = produtoVendido;
    }
    
    public void cadastrarVenda(){
        
        String sql;
        sql = "insert into venda (codigo, nomeVendedor, produtoVendido) values"
               + "(" + getCodigo() + " , '" + getNomeVendedor() + "' , '" + getProdutoVendido() + "')"; 
                con.executeSQL(sql);
                JOptionPane.showMessageDialog(null, "Registrado com Sucesso!");
                
    }
    
    public ResultSet consultarVenda(){
        
        ResultSet tabela;
        tabela = null;
        
        String sql = "select * from venda";
        tabela = con.RetornarResultset(sql);
        return tabela;  
        
    }
    
    public void alterarVenda() {
        
    String sql;
    sql = "update venda set nomeVendedor = '" +this.getNomeVendedor() + "', produtoVendido = '" + this.getProdutoVendido() + "' where codigo = " +this.getCodigo();
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Registro alterada com sucesso!");
    
    }
    
    public void excluirVenda(){
        
    String sql;
    sql = "DELETE FROM venda WHERE codigo = " + getCodigo();
    con.executeSQL(sql);
    JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
    
    }
    
}
