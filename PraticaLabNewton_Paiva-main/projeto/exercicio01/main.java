import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double mensalidade;
        int numIrmao;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da mensalidade: ");
        mensalidade = ler.nextDouble();

        System.out.println("Digite a quantidade de irmãos: ");
        numIrmao = ler.nextInt();

        Aluno aluno = new Aluno(mensalidade, numIrmao);

        if (numIrmao != 0) {
            aluno.calculaMensalidadeDesconto();
            System.out.println("Valor da mensalidade com desconto: " + aluno.getMensalidade());
        } else {
            System.out.println("Valor da mensalidade " + aluno.getMensalidade());
        }

    }

}
