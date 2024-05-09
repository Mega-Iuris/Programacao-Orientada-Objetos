import java.util.Scanner;

public class App {

    static int anoAtual = 2024;
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Digite seu ano de nascimento:");
        int Nascimento = sc.nextInt();

        int idade = calcularIdade(Nascimento);
        System.out.printf("Ate o final de 2024 voce tera %d anos", idade);

    }

    public static int calcularIdade(int anoNascimento) {

        int idadeAtual = anoAtual - anoNascimento;
        return idadeAtual;
    }
}
