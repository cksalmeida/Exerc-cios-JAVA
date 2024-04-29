import javax.swing.JOptionPane;

public class principal {
    public static void main(String[] args) {
       vendedor Vendedor = new vendedor();
       
        Vendedor.entrarNome();
        Vendedor.entrarSalarioBase();
        Vendedor.comissao();
        
        while (true) {
            
            int op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1 - Nome do Vendedor " + "\n 2 - Salário Base " + "\n 3 - Valor Vendido " + "\n 4 - Calcular Comissão " + "\n 0 - Sair"));

            if (op == 0){
            JOptionPane.showMessageDialog(null, "Finalizando o programa!");
            break;
            }
            
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Nome do vendedor: " + Vendedor.getNome());
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Salário base do vendedor: " + Vendedor.getSalarioBase());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Valor vendido pelo vendedor: " + Vendedor.getValorVendido());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Salário do vendedor somado com a comissão: " + Vendedor.comissao());
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}