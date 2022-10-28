import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];
        Scanner ler = new Scanner(System.in);
        int matricula;
        String nome;
        String buscar;

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite a matricula");
            matricula = ler.nextInt();

            System.out.println("Digite nome");
            nome = ler.nextLine();
            nome = ler.nextLine();

            alunos[i] = new Aluno(matricula, nome);
            System.out.println(alunos[i].mostrar());

        }

        System.out.println("Digite um nome para buscar");
        buscar = ler.nextLine();

        for (int i = 0; i < 2; i++) {
            if (alunos[i].getNome().equals(buscar)) {
                System.out.println("Nome encontrado com sucesso");
            }

        }

    }
}
