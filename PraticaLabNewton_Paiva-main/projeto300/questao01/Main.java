package questao01;

public class Main {

    public static void main(String[] args) {
        Corrente cc = new Corrente("Belo Horizonte", "MG", "Luan", "Rua cascais", "34910830", 2501, 21, 2000, 1);

        cc.depositar(8000);
        System.out.println(cc.getSaldo());

        cc.saque(7000);
        System.out.println(cc.getSaldo());
////////////////////////////////////////////////////////

        Poupanca pp = new Poupanca("Belo Horizonte", "Mg", "Lucas", "Rua estoril", "25230064", 8041, 13, 9000, 2);
        
        pp.depositar(2000);
        System.out.println(pp.getSaldo());

        pp.saque(45);
        System.out.println(pp.getSaldo());

    }
}
