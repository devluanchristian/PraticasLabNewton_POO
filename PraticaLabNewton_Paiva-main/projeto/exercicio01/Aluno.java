public class Aluno {
    private double mensalidade;
    private int numIrmao;

    public Aluno(double mensalidade, int numIrmao) {
        this.mensalidade = mensalidade;
        this.numIrmao = numIrmao;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public int getNumIrmao() {
        return numIrmao;
    }

    public void setNumIrmao(int numIrmao) {
        this.numIrmao = numIrmao;
    }

    public void calculaMensalidadeDesconto() {
        if (this.numIrmao == 1) {
            this.mensalidade = this.mensalidade - (this.mensalidade * 0.05);
        } else if (this.numIrmao == 2) {
            this.mensalidade = this.mensalidade - (this.mensalidade * 0.10);

        } else if (this.numIrmao > 2) {
            this.mensalidade = this.mensalidade - (this.mensalidade * 0.15);
        }

    }

}