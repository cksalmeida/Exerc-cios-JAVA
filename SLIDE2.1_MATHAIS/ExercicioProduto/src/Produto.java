import javax.swing.JOptionPane;

public class Produto {
    
    private String nome;
    private int qtde;
    private double valor;
    private double total;
    
    public Produto() {
        this("", 0, 0, 0);
    }
     

    public Produto(String nome, int qtde, double valor, double total) {
        this.nome = nome;
        this.qtde = qtde;
        this.valor = valor;
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void calcularTotal() {
        
        setNome(JOptionPane.showInputDialog("Insira o nome do produto: "));
        setQtde(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do tal produto: ")));       
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor deste produto: ")));
        
        total = qtde * valor;
        
        JOptionPane.showMessageDialog(null, "O total da compra deste foi produto foi de: R$" + total);
    }

    
}
