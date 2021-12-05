import java.util.ArrayList;

public class Classe {
    private ArrayList<Aluno> alunos;

    Classe() {
        this.alunos = new ArrayList();
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public double getMedia() {
        double somaNotas = 0;
        for (Aluno aluno : this.alunos) {
            somaNotas += aluno.nota;
        }
        return (somaNotas / this.alunos.size());
    }

    public void listaAlunosAcimaDaMedia() {
        for (Aluno aluno : this.alunos) {
            if (aluno.nota > getMedia()) {
                System.out.println("Matrícula: " + aluno.matricula + " - Nome: " + aluno.nome + " - Nota: " + aluno.nota);
            }
        }
    }
}
