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
    
    public static void main(String[] args) {
        
        piso Piso = new piso();

        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir valores do cômodo \n" + "2- Calcular preço por área\n" + "3- Mostrar valores\n" + "0- Sair\n"));

            switch (op) {
                
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando o programa!");
                    break;
                
                case 1:
                    Piso.inserirValores();
                    break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null, "Cálculo realizado!");
                    Piso.calcularPreco();
                    break;
                    
                case 3:
                    Piso.mostrarValores();
                    break;
               
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (op != 0);
    }  
}
