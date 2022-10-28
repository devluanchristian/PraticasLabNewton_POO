package ContaInteface;


public class main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200.20);
        cc.sacar(100);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(2000);
        cp.sacar(24);

        GeradorExtratos gerador = new GeradorExtratos();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);

    }
}