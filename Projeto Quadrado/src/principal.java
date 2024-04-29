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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        quadrado Quad = new quadrado();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Calcular Área do Quadrado \n" + "2 - Calcular Perímetro do Quadrado \n" + "3 - Mostrar valores \n" + "0 - Sair\n"));

            switch (op) {
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o programa!");
                    break;
                
                case 1:
                    Quad.calcularArea(0);
                    break;
                    
                case 2:
                    Quad.calcularPerimetro(0);
                    break;
                    
                case 3:
                    Quad.mostraValores();
                    break;
               
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (op != 0);
    }  
}
