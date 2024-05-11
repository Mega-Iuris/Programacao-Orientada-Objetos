import java.util.Scanner;

public class App {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String nome1 = sc.nextLine();
        String nome2 = sc.nextLine();

       System.out.println(compararNomes(nome1, nome2));
    }

    public static String compararNomes(String nome1, String nome2) {
        
        if (nome1.equals(nome2)) {
            return "As palavras sao identicas";
        } else if (nome1.equalsIgnoreCase(nome2)) {
            return "As palavras sao iguais ignorando maiusculo e minusculo";
        } else {
            return "As palavras sao diferentes";
        }

    }
}
