
import javax.swing.JOptionPane;

public class Loja {
    
    private String razaoSocial;
    private String cpfCliente;
    private Double valorCompra;
    private Double qtdItens;
    private Double total;

    public Loja() {
        this("", "", 0.0, 0.0, 0.0);
    }

    public Loja(String razaoSocial, String cpfCliente, Double valorCompra, Double qtdItens, Double total) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItens = qtdItens;
        this.total = total;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Double getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(Double qtdItens) {
        this.qtdItens = qtdItens;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
    public void inserirDadosLoja() {
    
        setRazaoSocial(JOptionPane.showInputDialog("Digite a razão social da loja: "));
        setCpfCliente(JOptionPane.showInputDialog("Insira o CPF do cliente: "));
        valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor unitário do produto que deseja comprar: "));
        qtdItens = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade comprada desse tal produto: "));
        
    }
    
     public void calcularCompraLoja() {
         
        total = valorCompra * qtdItens;
    
    }
    
     public void mostrarDadosLoja() {
    
        calcularCompraLoja();
        JOptionPane.showMessageDialog(null, "Razão Social da loja: " + razaoSocial + "\n CPF do Cliente: " + cpfCliente + "\n Valor unitário do produto comprado: " + valorCompra + 
                                     "\n Quantidade comprada deste produto: " + qtdItens + "\n Valor total da compra R$" + total); 
        
    } 
    
}
