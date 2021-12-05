import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProjNotas {

    public static void main(String[] args) {
        Classe classe = new Classe();

        try {
            // Abre o arquivo .txt
            FileReader data = new FileReader("alunos.txt");
            BufferedReader linha = new BufferedReader(data);
            String aux = linha.readLine();

            while (aux != null) {
                // extrai dados do arquivo .txt
                String[] dadosAluno = aux.split(";");

                // extrai as variáveis
                int matricula = Integer.parseInt(dadosAluno[0]);
                String nome = dadosAluno[1];
                double nota = Double.parseDouble(dadosAluno[2]);

                // cria um objeto do tipo aluno
                Aluno aluno = new Aluno(matricula, nome, nota);

                // adiciona aluno a uma classe de aula
                classe.addAluno(aluno);

                aux = linha.readLine();
            }
        } catch (IOException ex){
            System.out.println("Erro na abertura do arquivo");
        }

        System.out.println("A média das notas da classe é " + classe.getMedia());

        System.out.println("\nOs alunos com notas acima da média da classe são:");

        classe.listaAlunosAcimaDaMedia();

    }
}
