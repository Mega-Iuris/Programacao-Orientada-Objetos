package escola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Usuario {

    private String disciplina;
    private static Scanner sc = new Scanner(System.in);

    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        this.disciplina = disciplina;
    }

    public static List<Professor> cadastrarProfessores() {
        List<Professor> professores = new ArrayList<>();
        boolean parar;

        do {
            System.out.println("Cadastrar Novo Professor(a): ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("E-Mail: ");
            String email = sc.nextLine();

            System.out.print("Disciplina: ");
            String disciplina = sc.nextLine();

            Professor professor = new Professor(nome, email, disciplina);
            professores.add(professor);

            System.out.println("Cadastrar novo professor? (S)Sim ou (N)Não ");
            String resposta = sc.nextLine();

            parar = resposta.equalsIgnoreCase("s");
        } while (parar);
        return professores;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        this.disciplina = getDisciplina();
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirDisciplina) {
        if (exibirNome) {
            System.out.println("Nome: " + getNome());
        }
        if (exibirEmail) {
            System.out.println("Email: " + getEmail());
        }
        if (exibirDisciplina) {
            System.out.println("Disciplina: " + getDisciplina());
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}
