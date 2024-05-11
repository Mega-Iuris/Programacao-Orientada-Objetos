import java.util.Scanner;

public class App {

    private static final int ANO_ATUAL = 2024;
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int anoNascimento = sc.nextInt();
        int idade = calcularIdade(anoNascimento);
        System.out.printf("Ate o final de 2024 voce tera %s anos", idade);
    }

    public static int calcularIdade(int anoNascimento){
        int resultado = ANO_ATUAL - anoNascimento;
        return resultado;
    }
}
