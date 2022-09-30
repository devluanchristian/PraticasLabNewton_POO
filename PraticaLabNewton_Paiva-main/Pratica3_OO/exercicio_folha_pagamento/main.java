package exercicio_folha_pagamento;

public class main {
    public static void main(String[] args) {
        FPadrao fp1 = new FPadrao(123, "Luan", 8000);
        System.out.println("Total Proventos: " + fp1.calcularProventos());

        FComissionado fc1 = new FComissionado(123, "Lara", 4000, 1, 5000);
        System.out.println("Total provvendos Func. Comissionado: " + fc1.calcularProventos());

        FProdutividade fp2 = new FProdutividade(123, "Lucas", 1000, 0.1, 5000);
        System.out.println("Total provendos Func. Produtividade: " + fp2.calcularProventos());
    }
}
