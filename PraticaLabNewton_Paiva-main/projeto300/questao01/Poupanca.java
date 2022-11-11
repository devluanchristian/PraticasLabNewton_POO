package questao01;
public class Poupanca extends Contas {
    private int tipo;

    public Poupanca(String nomeCidade, String uf, String nomCliente, String endereco, String telefone, int agencia,
            int numConta, double saldo, int tipo) {
        super(nomeCidade, uf, nomCliente, endereco, telefone, agencia, numConta, saldo);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
