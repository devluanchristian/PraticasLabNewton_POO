package exercicio04;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Prata", "GKJ5004", "Kadet", 2003, 40, 2);
        Moto moto = new Moto("azul", "jhvg212", "Titan", 2022, 20, 10);

        System.out.println(carro.imprimeCarro());
        System.out.println(moto.imprimeMoto());

    }

}
