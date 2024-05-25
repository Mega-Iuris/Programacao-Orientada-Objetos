import java.util.Scanner;
import loja.Loja;

public class App {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Loja loja1 = new Loja();

        loja1.cadastrarLoja();
        System.out.println();
        boolean outroProduto;

        do {
            loja1.receberCadastroProduto();
            System.out.println("Cadastrar outro produto ('S' ou 'N')");
            String resposta = sc.nextLine();
            System.out.println();

            if (resposta.equalsIgnoreCase("s")) {
                outroProduto = true;
            }else{
                outroProduto= false;
            }
        } while (outroProduto);
        
        System.out.println();
        loja1.imprimirLoja();
        System.out.println();
        loja1.listarProdutos();
    }
}
