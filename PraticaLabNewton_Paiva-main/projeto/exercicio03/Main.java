package exercicio03;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String title = "Escolha uma opção";
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] Pessoa Fisica\n[2] Pessoa Jurídica", title, 3));

        String nome = JOptionPane.showInputDialog(null, "Informe o nome");
        double rendaBruta = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a renda bruta"));

        if (num == 1) {
            String cpf = JOptionPane.showInputDialog(null, "Informe o CPF");
            PessoaFisica pessoaFisica = new PessoaFisica(nome, rendaBruta, cpf);

            pessoaFisica.calculaIR();

            JOptionPane.showMessageDialog(null, pessoaFisica.imprimeIR());

        } else if (num == 2) {
            String cnpj = JOptionPane.showInputDialog(null, "Informe o CNPJ");
            PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, rendaBruta, cnpj);

            pessoaJuridica.calculaIR();
            JOptionPane.showMessageDialog(null, pessoaJuridica.imprimeIR());
        } else {
            JOptionPane.showMessageDialog(null, nome, "Opção invalida", 0);
        }

    }
}