package exercicio_carnaval;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        double valor;
        double valorAdicional;
        String localizacao;
        int opcao;

        Normal ingressoNormal = null;
        Vip ingressoVip = null;
        Camarote ingressoCamarote = null;

        do {
            opcao = Integer.parseInt(JOptionPane
                    .showInputDialog(" (1) INGRESSO NORMAL\n (2) INGRESSO VIP\n (3) INGRESSO CAMAROTE \n (4) SAIR"));
            switch (opcao) {

                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
                    ingressoNormal = new Normal(valor);
                    JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso(), "Mensagem", -1);
                    break;

                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Valor adicional: "));
                    ingressoVip = new Vip(valor, valorAdicional);

                    JOptionPane.showMessageDialog(null, ingressoVip.imprimeIngresso());
                    break;
                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Valor adicional: "));
                    localizacao = JOptionPane.showInputDialog("Localizacao: ");

                    ingressoCamarote = new Camarote(valor, valorAdicional, localizacao);
                    JOptionPane.showInputDialog(null, ingressoCamarote.imprimeIngresso(), "Mensagem", -1);
                    break;
                case 4:

                    JOptionPane.showMessageDialog(null, "Numero de ingresso VIP: " + ingressoVip.numeroVip());
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha correntamente");
                    break;

            }
        } while (opcao != 4);

    }
}