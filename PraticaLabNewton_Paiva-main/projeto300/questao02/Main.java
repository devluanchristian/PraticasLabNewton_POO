package questao02;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Michelle", "michele@newtonPaiva", "1234", 400, 12);

        professor.calculaSalario();

        System.out.println(professor.mostrarProfessor());

        Aluno aluno = new Aluno("Luan", "luan@newtonpaiva", "1234", 3, 504);
        System.out.println(aluno.mostrarAluno());
    }

}
