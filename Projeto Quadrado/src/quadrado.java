
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
public class quadrado {
    
    private double areaQuadrado;
    private double perimetroQuadrado;

    public quadrado() {
        this(0.0, 0.0);
    }

    public quadrado(double areaQuadrado, double perimetroQuadrado) {
        this.areaQuadrado = areaQuadrado;
        this.perimetroQuadrado = perimetroQuadrado;
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }
    
    public void calcularArea (double ladoA) {
        
         ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o comprimento do lado A do quadrado: "));
         setAreaQuadrado(Math.pow(ladoA,2));
        
    }
    
    public void calcularPerimetro (double ladoA) {
        
        ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o comprimento do lado A do quadrado: "));
        setPerimetroQuadrado(4 * ladoA);
        
    }
    
    public void mostraValores () {
    
        JOptionPane.showMessageDialog(null, "A área do quadrado é igual a: " + getAreaQuadrado() + "\n O perímetro do quadrado é igual a: " + getPerimetroQuadrado());
        
    }
    
}
