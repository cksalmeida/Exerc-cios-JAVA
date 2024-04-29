
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
public class piso {
    
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoArea;
    private double custoTotal;

    public piso() {
        this(0.0, 0.0, 0.0, 0.0);
    }

    public piso(double comprimentoComodo, double larguraComodo, double precoArea, double custoTotal) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoArea = precoArea;
        this.custoTotal = custoTotal;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoArea() {
        return precoArea;
    }

    public void setPrecoArea(double precoArea) {
        this.precoArea = precoArea;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }
    
    public void inserirValores() {
    
        comprimentoComodo = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o comprimento do cômodo: "));
        setComprimentoComodo(comprimentoComodo);

        larguraComodo = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a largura do cômodo: "));
        setLarguraComodo(larguraComodo);

        precoArea = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o preço cobrado por área: "));
        setPrecoArea(precoArea);
        
    }
    
    public void calcularPreco () {
    
        setCustoTotal(getComprimentoComodo() * getLarguraComodo() * getPrecoArea());
        
    }
    
    public void mostrarValores() {
        
        JOptionPane.showMessageDialog(null, "Comprimento do cômodo: " + getComprimentoComodo() + "\n Largura do cômodo: " + getLarguraComodo() + "\n Preço área: " + getPrecoArea() + "\n Custo total: " + getCustoTotal());
        
    }
    
}