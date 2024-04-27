
import javax.swing.JOptionPane;

public class Fornecedor {
    
    private String nomeFornecedor;
    private String nomeProduto;
    private String descricaoProduto;

    public Fornecedor() {
        this("", "", "");
    }

    public Fornecedor(String nomeFornecedor, String nomeProduto, String descricaoProduto) {
        this.nomeFornecedor = nomeFornecedor;
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    
    public void cadastrarFornecedor () {
    
        setNomeFornecedor(JOptionPane.showInputDialog("Informe o nome do fornecedor: "));
        setNomeProduto(JOptionPane.showInputDialog("Insira o nome do produto: "));
        setDescricaoProduto(JOptionPane.showInputDialog("Digite uma descrição para o produto: "));
        
    }
    
    public void listarFornecedor () {
    
        JOptionPane.showMessageDialog(null, "Dados do fornecedor: \n"
                                      + "Nome: " + getNomeFornecedor()
                                      + "\n Produto: " + getNomeProduto()
                                      + "\n Descrição do Produto: " + getDescricaoProduto());
        
    }
    
    
    
}
