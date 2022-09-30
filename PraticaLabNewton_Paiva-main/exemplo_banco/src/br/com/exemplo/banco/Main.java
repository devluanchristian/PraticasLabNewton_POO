package br.com.exemplo.banco;

public class Main {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente("123-8", 1000, 5000);
		System.out.println("Saldo: " + cc1.getSaldo());
		System.out.println("SaldoTotal: " + cc1.consultaSaldoTotal());
		
		ContaPoupanca cp1 = new ContaPoupanca("123-4", 1000.2);
		System.out.println("Saldo: "+ cp1.getSaldo());
		cp1.calculaRendimento();
		System.out.println("Saldo após o primeiro rendimento: "+ cp1.getSaldo());
	}

}
