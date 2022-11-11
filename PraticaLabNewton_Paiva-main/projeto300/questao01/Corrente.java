package questao01;
public class Corrente extends Contas {
    private double tarifa;

    public Corrente(String nomeCidade, String uf, String nomCliente, String endereco, String telefone, int agencia,
            int numConta, double saldo, double tarifa) {
        super(nomeCidade, uf, nomCliente, endereco, telefone, agencia, numConta, saldo);
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

}
