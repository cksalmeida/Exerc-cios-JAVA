import javax.swing.JOptionPane;

public class Dobro {
    
    private double numero;
    private double calculo;
    
    public Dobro(){
        this(0, 0);
    }

    public Dobro(double numero, double calculo) {
        this.numero = numero;
        this.calculo = calculo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
    public void calcularDobro () {
    
        String inputNumero = JOptionPane.showInputDialog("Digite um número: ");
        setNumero(Double.parseDouble(inputNumero));
        
        calculo = numero * 2;
        
        JOptionPane.showMessageDialog(null, "O dobro deste número é: " + calculo);
        
    }
    
}
