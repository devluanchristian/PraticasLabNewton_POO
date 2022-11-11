package questao01;
public class Clientes extends Cidade {
    private String nomCliente;
    private String endereco;
    private String telefone;
    
    public Clientes(String nomeCidade, String uf, String nomCliente, String endereco, String telefone) {
        super(nomeCidade, uf);
        this.nomCliente = nomCliente;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
    

