package questao01;
public class Cidade {
    private String nomeCidade;
    private String uf;

    public Cidade(String nomeCidade, String uf) {
        this.nomeCidade = nomeCidade;
        this.uf = uf;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}