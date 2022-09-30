package Exercicio_Rendimento;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial");
		double vrInicial = ler.nextDouble();
		
		System.out.println("Digite a taxa de juros");
		double txJuros = ler.nextDouble();
		
		System.out.println("Valor inicial do rendimento");
		int numMes = ler.nextInt();
		
		
		Rendimento r1 = new Rendimento(vrInicial, txJuros, numMes);//cria objeto com os paramentros no construtor
		r1.calculaRendimento();
	}

}
