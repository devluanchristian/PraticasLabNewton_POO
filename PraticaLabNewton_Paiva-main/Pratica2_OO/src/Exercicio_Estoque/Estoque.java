package Exercicio_Estoque;

public class Estoque {
    private String nome;
    private int qtAtual;
    private int qtdMinima;
	private int qtdAtual;
	public Estoque(String nome, int qtAtual, int qtdMinima) {
		super();
		this.nome = nome;
		this.qtAtual = qtAtual;
		this.qtdMinima = qtdMinima;	
		
	}
	public Estoque() {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtAtual() {
		return qtAtual;
	}
	public void setQtAtual(int qtAtual) {
		this.qtAtual = qtAtual;
	}
	public int getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;  
}
	public void darBaixa(int qtde) { 	
		if (qtde<=this.qtAtual)
			this.qtAtual -= qtde;  
		else  
			System.out.println("Operação não permitida");
}
	public boolean precisaRepor() {
       if (this.qtdAtual<=this.qtdMinima)
    	   return true;
       else 
    	   return false;
       
}
	
	public String mostra() {
		return "Produto: " + getNome() + "\nEstoque Atual: " + 
getQtdMinima();	
		}

}