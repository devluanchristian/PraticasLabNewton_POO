package Exe01;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String titlee = "Escolha uma opção";
        int entrada;

        do {
            entrada = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "[1] Cadastrar projeto Distribuir Alimentos. \n[2] Cadastrar Projeto Trabalho Voluntário. \n[3] Sair",
                    titlee, 3));

            if (entrada == 1) {
                String nomeProjeto;
                String descricao;
                String endereco;
                String dataInicio;
                String dataFim;
                String descAlimento;
                int qtde;

                nomeProjeto = JOptionPane.showInputDialog(null, "Insira o nome do Projeto");
                descricao = JOptionPane.showInputDialog(null, "Insira a descrição");
                endereco = JOptionPane.showInputDialog(null, "Insira o endereço ");
                dataInicio = JOptionPane.showInputDialog(null, "Insira a data de inicio");
                dataFim = JOptionPane.showInputDialog(null, "Insira a data final");
                descAlimento = JOptionPane.showInputDialog(null, "Insira a descrição do alimento");
                qtde = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de alimento"));

                DistribuicaoAlimento distA = new DistribuicaoAlimento(nomeProjeto, descricao, endereco, dataInicio,
                        dataFim, descAlimento, qtde);
                distA.validaProjeto();

                JOptionPane.showMessageDialog(null, distA.imprimeProjeto(), "Cadastrado sucesso", -1);

            } else if (entrada == 2) {
                String nomeProjeto;
                String descricao;
                String endereco;
                String dataInicio;
                String dataFim;
                String tipoTrabalho;
                int duracaoTrabalho;

                nomeProjeto = JOptionPane.showInputDialog(null, "Insira o nome do Projeto");
                descricao = JOptionPane.showInputDialog(null, "Insira a descrição");
                endereco = JOptionPane.showInputDialog(null, "Insira o endereço ");
                dataInicio = JOptionPane.showInputDialog(null, "Insira a data de inicio");
                dataFim = JOptionPane.showInputDialog(null, "Insira a data final");
                tipoTrabalho = JOptionPane.showInputDialog(null, "Insira o tipo do trabalho");
                duracaoTrabalho = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Insira a duração duração de trabalho"));

                TrabalhoVoluntario trabalhaV = new TrabalhoVoluntario(nomeProjeto, descricao, endereco, dataInicio,
                        dataFim, tipoTrabalho, duracaoTrabalho);

                trabalhaV.validaProjeto();

                JOptionPane.showMessageDialog(null, trabalhaV.imprimeProjeto(), "Cadastrado sucesso", -1);

            }
        } while (entrada != 3);

    }

}
