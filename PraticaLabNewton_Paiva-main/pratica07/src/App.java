import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {

        int opcao;
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                "[1] Cadastrar Livro\n[2] Pesquisar Livro por Peço\n[3] Pesquisar Livro Por Titulo\n[4] Excluir Livro\n[5] Sair"));

        while (opcao != 5) {

            switch (opcao) {
                case 1:
                    InserirRegistroLivro insert = new InserirRegistroLivro();
                    insert.insertRecord();
                    break;

                case 2:
                    double vl_preco = Double.parseDouble(
                            JOptionPane.showInputDialog(null, "Qual o valor do livro que deseja pesquisar?"));
                    PesquisaLivro pesquisaLivroPreco = new PesquisaLivro();
                    JOptionPane.showMessageDialog(null, pesquisaLivroPreco.selectRecordByPreco(vl_preco));
                    break;

                case 3:
                    String nm_titulo = JOptionPane.showInputDialog(null,
                            "Informe o nome do titulo do livro que deseja pesquisar: ");
                    PesquisaLivro pesquisaLivroTitulo = new PesquisaLivro();
                    JOptionPane.showMessageDialog(null, pesquisaLivroTitulo.selectRecordByTitulo(nm_titulo));
                    break;
                case 4:
                    String id_isbm = JOptionPane.showInputDialog(null,
                            "Informe o codigo ISBM do livro que deseja excluir: ");
                    Delete del = new Delete();
                    JOptionPane.showMessageDialog(null, del.deleteRecord(id_isbm));
                    break;
                default:
                    opcao = 5;
                    break;

            }

        }

    }
}