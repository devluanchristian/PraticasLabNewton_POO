package exercicio_folha_pagamento;

public class FComissionado extends Funcionario {
    private double percentual;
    private double vendas;

    public FComissionado(int matricula, String nome, double salario, double percentual, double vendas) {
        super(matricula, nome, salario);
        this.percentual = percentual;
        this.vendas = vendas;

    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public double calcularProventos() {

        return getSalario()*getPercentual()/100 + getSalario();
    }

}
