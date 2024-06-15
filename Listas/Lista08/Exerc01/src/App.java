import loja.Produto;
import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Produto produto = new Produto();
            produto.ler();
            produto.exibirInformacoes();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
