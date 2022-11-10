package exercicio04;

public class Veiculo {
    private String cor;
    private String placa;
    private String modelo;
    private int ano;
    private double qtdeCombustivel;

    public Veiculo(String cor, String placa, String modelo, int ano, double qtdeCombustivel) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.qtdeCombustivel = qtdeCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQtdeCombustivel() {
        return qtdeCombustivel;
    }

    public void setQtdeCombustivel(double qtdeCombustivel) {
        this.qtdeCombustivel = qtdeCombustivel;
    }

}