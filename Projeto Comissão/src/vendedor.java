import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Davi
 */

public class vendedor {
    
    private String nome;
    private double salarioBase;
    private double valorVendido;
    private double novoSalario;

    public vendedor() {
        this(" ", 0.0, 0.0, 0.0);
    }

    public vendedor(String nome, double salarioBase, double valorVendido, double novoSalario) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.valorVendido = valorVendido;
        this.novoSalario = novoSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
    
    public double comissao (){
        
        return ((getValorVendido() * 10) / 100) + getSalarioBase();
    
    }
    
    public void entrarNome (){
    
        nome = JOptionPane.showInputDialog("Digite o nome do vendedor: ");
        setNome(nome);
        
    }
    
    public void entrarSalarioBase () {
    
        salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário base deste vendedor: "));
        setSalarioBase(salarioBase);
 
        valorVendido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor vendido pelo vendedor: "));
        setValorVendido(valorVendido);
        
    }
    
}