package exercicio03;

import java.text.NumberFormat;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private double valorIR;

    public PessoaJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;

    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorIR() {
        return valorIR;
    }

    public void setValorIR(double valorIR) {
        this.valorIR = valorIR;
    }

    @Override
    public void calculaIR() {
        this.valorIR = getRendaBruta() * 0.10;

    }

    @Override
    public String imprimeIR() {
        return "Valor a ser pago de imposto: " + NumberFormat.getCurrencyInstance().format(this.valorIR);

    }

}
