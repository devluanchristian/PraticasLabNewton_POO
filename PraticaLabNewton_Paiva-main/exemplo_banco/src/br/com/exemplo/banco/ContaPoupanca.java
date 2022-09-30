package br.com.exemplo.banco;

public class ContaPoupanca extends Conta {
	private double rendimento;

	public ContaPoupanca(String numero, double saldo) {
		super(numero, saldo);

	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public void calculaRendimento() {
		setSaldo(getSaldo()* rendimento/100+getSaldo());
	}

}

