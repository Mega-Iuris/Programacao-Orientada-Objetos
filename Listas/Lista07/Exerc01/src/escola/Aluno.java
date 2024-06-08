package escola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Usuario {

    private String matricula;
    static Scanner sc = new Scanner(System.in);

    public Aluno(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    public static List<Aluno> cadastrarAlunos() {
        List<Aluno> alunos = new ArrayList<>();

        boolean parar;
        do {
            System.out.println("Cadastrar Novo Aluno(a): ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("E-mail: ");
            String email = sc.nextLine();

            System.out.print("Matricula: ");
            String matricula = sc.nextLine();

            Aluno aluno = new Aluno(nome, email, matricula);
            alunos.add(aluno);

            System.out.println("Cadastrar outroaluno? (S)Sim ou (N)Não ");
            String resposta = sc.nextLine();
            parar = resposta.equalsIgnoreCase("s");

        } while (parar);

        return alunos;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Matricula: " + getMatricula());
    }

    public void exibirInfor(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula) {
        if (exibirNome) {
            System.out.println("Nome: " + getNome());
        }
        if (exibirEmail) {
            System.out.println("E-mail: " + getEmail());
        }
        if (exibirMatricula) {
            System.out.println("Matricula: " + getMatricula());
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
