package br.com.questao3;

public class FAdministrativo extends Funcionario {
  private double horas;

  public FAdministrativo(String nome, String rg, double salarioBase, double horas) {
    super(nome, rg, salarioBase);
    this.horas = horas;
  }

  public double getHoras() {
    return horas;
  }

  public void setHoras(double horas) {
    this.horas = horas;
  }
  
  @Override
  public String imprimeSalario() {
    return "Salário final do funcionário " + getNome() + ": R$" + getSalarioBase() + ((getSalarioBase() * 0.01) * this.horas);
  }
}
