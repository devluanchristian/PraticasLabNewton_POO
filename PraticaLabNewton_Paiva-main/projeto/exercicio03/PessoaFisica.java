package exercicio03;

import java.text.NumberFormat;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private double valorIR;

    public PessoaFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorIR() {
        return valorIR;
    }

    public void setValorIR(double valorIR) {
        this.valorIR = valorIR;
    }

    @Override
    public void calculaIR() {
        if (getRendaBruta() <= 1903.98) {
            this.valorIR = 0;

        } else if (getRendaBruta() >= 1903.98 && getRendaBruta() <= 2826.65) {
            this.valorIR = (getRendaBruta() * 0.75) - 142.80;
        } else if (getRendaBruta() >= 2826.65 && getRendaBruta() <= 3751.05) {
            this.valorIR = (getRendaBruta() * 0.15) - 354.80;
        } else if (getRendaBruta() >= 3751.05 && getRendaBruta() <= 4664.68) {
            this.valorIR = (getRendaBruta() * 0.225) - 636.13;
        } else if (getRendaBruta() >= 4664.68) {
            this.valorIR = (getRendaBruta() * 0.275) - 869.36;
        }

    }

    @Override
    public String imprimeIR() {
        return "Valor a ser pago de imposto: " + NumberFormat.getCurrencyInstance().format(this.valorIR);

    }
}
