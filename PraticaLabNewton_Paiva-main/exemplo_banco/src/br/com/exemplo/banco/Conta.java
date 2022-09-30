package br.com.exemplo.banco;

public class Conta {
	private String numero;
	private double saldo;

	public Conta(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		// this.saldo = this.saldo + valor;

		this.saldo += valor;
	}

	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}

	}

}
