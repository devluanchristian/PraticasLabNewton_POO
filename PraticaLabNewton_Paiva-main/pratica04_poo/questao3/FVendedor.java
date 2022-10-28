package br.com.questao3;

public class FVendedor extends Funcionario {
  private double comissao;
  private int vendas;

  public FVendedor(String nome, String rg, double salarioBase, int vendas) {
    super(nome, rg, salarioBase);
    this.comissao = 0.05;
    this.vendas = vendas;
  }

  public int getVendas() {
    return vendas;
  }

  public void setVendas(int vendas) {
    this.vendas = vendas;
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  public void countVendas() {
    this.vendas++;
  }

  @Override
  public String imprimeSalario() {
    return "Salário final do funcionário " + getNome() + ": R$ " + (getSalarioBase() + (this.vendas * this.comissao));
  }
}
