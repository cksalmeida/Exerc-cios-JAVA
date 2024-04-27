import javax.swing.JOptionPane;

public class IdadePessoa {
    
    private int ano;
    private int idade;
    private int presente = 2024;

    public IdadePessoa() {
        this(0, 0);
    }

    public IdadePessoa(int ano, int idade) {
        this.ano = ano;
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void calcularIdade() {
    
       ano = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
       idade = presente - ano;
        
    }
    
    public void mostrarIdade() {
    
        calcularIdade();
        JOptionPane.showMessageDialog(null, "Você tem " +idade + " anos!!!");
        
    }
    
}
