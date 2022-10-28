package ContaInteface;

import javax.swing.JOptionPane;

public class GeradorExtratos {
    public void geradorConta(Conta conta) {
        JOptionPane.showMessageDialog(null, "Saldo em conta: " + conta.getSaldo(), "Saldo Atual", 0);
    }

}
