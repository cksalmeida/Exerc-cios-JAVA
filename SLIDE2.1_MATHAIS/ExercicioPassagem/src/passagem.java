import javax.swing.JOptionPane;

public class passagem {
    
    private String nomePassageiro;
    private String telefone; 
    private String rg;
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;
    
    public passagem () {
        
        this (" ", " ", " ", " ", " ", " ", " "); 
        
    }

    public passagem(String nomePassageiro, String telefone, String rg, String localViagem, String data, String horario, String numPoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.telefone = telefone;
        this.rg = rg;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numPoltrona = numPoltrona;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(String numPoltrona) {
        this.numPoltrona = numPoltrona;
    }
    
    public void cadastrarDadosPassageiros () {
    
        setNomePassageiro(JOptionPane.showInputDialog("Digite o nome do passageiro: ")); 
        setTelefone(JOptionPane.showInputDialog("Digite o número de telefone do passageiro: ")); 
        setRg(JOptionPane.showInputDialog("Informe o seu RG: "));        
              
    }
    
    public void cadastrarDadosPassagem () {
    
        setLocalViagem(JOptionPane.showInputDialog("Informe o local da sua viagem: "));
        setData(JOptionPane.showInputDialog("Informe a data da sua viagem: "));
        setHorario(JOptionPane.showInputDialog("Informe o horário da sua viagem: "));
        setNumPoltrona(JOptionPane.showInputDialog("Informe o número da sua poltrona: "));
        
    }
    
    public void mostraDadosPassageiro () {
    
        System.out.println("Dados Passageiro: Nome: " + getNomePassageiro() + "\n" +
                           "Telefone: " +getTelefone() + "\n"
                           + "RG: " + getRg () + "\n" );
        
    }
    
    public void mostraDadosPassagem () {
    
        System.out.println("Dados Passagem: Local da Viagem: " + getLocalViagem() + "\n" +
                           "Data da Viagem: " +getData() + "\n"
                           + "Horário da Viagem: " + getHorario () + "\n"
                           + "Número da Poltrona: " + getNumPoltrona () + "\n");
        
    }
      
}
