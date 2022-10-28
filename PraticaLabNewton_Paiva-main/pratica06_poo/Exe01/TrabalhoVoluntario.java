package Exe01;
public class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim,
            String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio,
            String dataFim) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);

    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto() {

        if (duracaoTrabalho > 2) {
            return true;
        } else {
            return false;
        }
    }

    public String imprimeProjeto() {

        return "Nome do projeto: " + getNomeProjeto() + "\nDescricao: " + getDescricao() + "\nData de inicio: "
                + getDataInicio() + "\nData final: " + getDataFim() + "\nTipo do trabalho: " + getTipoTrabalho()
                + "\nDuração: " + getDuracaoTrabalho();
    }

}