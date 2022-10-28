package br.com.questao3;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Informe o nome do funcionário");
    String rg = JOptionPane.showInputDialog("Informe o rg do funcionário " + nome);
    double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário base"));
    int opcao = Integer.parseInt(
        JOptionPane.showInputDialog("Informe o departamento do funcionário \n(1) - Vendedor \n(2) - Administrativo"));

    switch (opcao) {
      case 1:
        int qtdVendas = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de vendas do " + nome));
        Funcionario fVendedor = new FVendedor(nome, rg, salarioBase, qtdVendas);
        JOptionPane.showMessageDialog(null, fVendedor.imprimeSalario(), "Calculo do salário",
            JOptionPane.INFORMATION_MESSAGE);
        break;
      case 2:
        int totalHora = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de horas extras do " + nome));
        Funcionario fAdministrativo = new FAdministrativo(nome, rg, salarioBase, totalHora);
        JOptionPane.showMessageDialog(null, fAdministrativo.imprimeSalario(), "Calculo do salário",
            JOptionPane.INFORMATION_MESSAGE);
        break;
      default:
        break;
    }
  }
}
