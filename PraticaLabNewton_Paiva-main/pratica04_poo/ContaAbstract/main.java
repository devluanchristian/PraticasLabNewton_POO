package ContaAbstract;

public class main {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        cp.setSaldo(2021);
        cp.imprimeExtrato();

    }

}
