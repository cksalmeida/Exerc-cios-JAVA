import javax.swing.JOptionPane;

public class Multiplicacao {
    
    private int valor;
    private int resultado;

    public Multiplicacao() {
        this(0, 0);
        
    }

    public Multiplicacao(int valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void multiplicacao4() {
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));  
        resultado = valor * 4;
        
        JOptionPane.showMessageDialog(null, "Este número multiplicado por 4 resulta no número: " + resultado);
        
    }
    
}
