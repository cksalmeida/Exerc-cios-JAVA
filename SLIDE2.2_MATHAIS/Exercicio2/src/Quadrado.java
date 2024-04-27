import javax.swing.JOptionPane;

public class Quadrado {
    
    private double numero;
    private double resultado;
    
    public Quadrado () {
        this(0, 0);
    }

    public Quadrado(double numero, double resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void calcularQuadrado() {
    
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));  
    resultado = numero * numero;
        
    }
    
    public void mostrarQuadrado() {
        
    calcularQuadrado();
    JOptionPane.showMessageDialog(null, "Este número elevado ao quadrado é igual a: " + resultado);
        
    }
    
}
