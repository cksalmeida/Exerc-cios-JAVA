import javax.swing.JOptionPane;

public class Cliente {
    
    private String Nome;
    private String Endereco;
    private String Rg;

    public Cliente () {
    
        this ("", "", "");
        
    }

    public Cliente (String Nome, String Endereco, String Rg) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Rg = Rg;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }
    
    public void cadastrarCliente () {
    
        setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));
        setEndereco(JOptionPane.showInputDialog("Informe o endereço do cliente: "));
        setRg(JOptionPane.showInputDialog("Informe o RG do cliente: "));
        
    }
    
    public void listarCliente () {
    
         JOptionPane.showMessageDialog(null, "Dados do cliente: \n"
                                      + "Nome: " + getNome()
                                      + "\n Endereço: " + getEndereco()
                                      + "\n RG: " + getRg());
        
    }
    
    
    
}
