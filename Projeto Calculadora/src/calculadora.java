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

public class calculadora {
    
    private double n1;
    private double n2;
    private double r;

    public calculadora() {
        this(0.0, 0.0, 0.0);
    }

    public calculadora(double n1, double n2, double r) {
        this.n1 = n1;
        this.n2 = n2;
        this.r = r;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public void somar (){
        
         r = n1 + n2;
         
    }
    
    public void subtrair (double a, double b){
        
        r = a - b; 
        
    }
    
    public void multiplicar () {
        
        r = n1 * n2; 
        
    }
    
    public double dividir (double a, double b) {
        
       return a / b; 
        
    }
    
    public void resultado () {
    
        int op = -1;
        
        while (op != 0){
            
          op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1 - Soma " + "\n 2 - Subtração " + "\n 3 - Multiplicação " + "\n 4 - Divisão " + "\n 0 - Sair"));
          
          if (op == 0) {
            JOptionPane.showMessageDialog(null, "Finalizando o programa!");
            break; 
        }
          
          n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número:"));
          n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número:"));
          
          switch (op) {
          
              case 1: somar();
                  break;
                  
              case 2: subtrair(n1, n2);
                  break;
                  
              case 3: multiplicar();
                  break;
                  
              case 4: r = dividir(n1, n2);
                  break;
                  
              default: JOptionPane.showMessageDialog(null, "Opção Inválida!");
             }         
          
             JOptionPane.showMessageDialog(null, "O resultado desta operação é: " + r);
          
        }
                
    }
    
}