package Exercicio_Estoque;

public class Main {
	  public static void main(String[] args) {
		  Estoque estoque1 = new Estoque ("Caneta",100,1);
		  System.out.println(estoque1.getNome()+ " - Estoque atual: " + estoque1.getQtAtual() + " - Estoque minimo: "
		  		+ "" + estoque1.getQtdMinima());
		  estoque1.setNome("Caneta Azul");
		  System.out.println(estoque1.getNome());
		  estoque1.darBaixa(50);
		  System.out.println("Repor estoque? " + estoque1.precisaRepor());
		  System.out.println(estoque1.mostra());
		  estoque1.darBaixa(70);
		  
		  /*Estoque estoque2 = new Estoque();
		  estoque2.setNome(" Caneta red ");
		  estoque2.setQtAtual(2);
		  estoque2.setQtdMinima(10);
		  System.out.println(estoque2.getNome()+ " - Estoque atual: " + estoque1.getQtAtual() + " - Estoque minimo: "
			  		+ "" + estoque2.getQtdMinima());
		 */
		  
	}
	}
	