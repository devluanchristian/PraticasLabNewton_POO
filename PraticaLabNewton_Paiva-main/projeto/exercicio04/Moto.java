package exercicio04;

public class Moto extends Veiculo {
    private int qtdeCilindradas;

    public Moto(String cor, String placa, String modelo, int ano, double comb, int qtdeCilindradas) {
        super(cor, placa, modelo, ano, comb);
        this.qtdeCilindradas = qtdeCilindradas;
    }

    public int getQtdeCilindradas() {
        return qtdeCilindradas;
    }

    public String imprimeMoto() {
        return "Moto modelo " + getModelo() + "\nCor " + getCor() + "\nPlaca: " + getPlaca()
                + "\nQuantidade de cilindradas: " + getQtdeCilindradas();

    }

}
