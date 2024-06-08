import java.util.List;

import escola.Aluno;
import escola.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Aluno> alunos = Aluno.cadastrarAlunos();
        System.out.println();

        System.out.println("Alunos cadastrados: ");
        for (Aluno aluno : alunos) {
            aluno.exibirInfo();
            System.out.println("/---------------------/");

            aluno.exibirInfor(true, false, true);
            System.out.println();
        }
          
        List<Professor> professores = Professor.cadastrarProfessores();
        System.out.println();
        
        System.out.println("Professores cadastrados: ");
        for (Professor professor : professores) {
            professor.exibirInfo();
            System.out.println("/---------------------/");

            professor.exibirInfo(true, false, true);
            System.out.println();
        }

    }

}

