package loja;
import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Produto> produtos;   
    private static final Scanner sc = new Scanner(System.in);

    public Loja(String nome, String endereco, String telefone, ArrayList<Produto> produtos){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.produtos = produtos;
    }

    public Loja(){
        this.produtos = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }
    public void setProdutos(ArrayList<Produto> produtos){
        this.produtos = produtos;
    }
   
    public void cadastrarLoja(){
        System.out.println("Digite os dados da Loja: ");

        System.out.print("Nome da loja: ");
        setNome(sc.nextLine());

        System.out.print("Endereço: ");
        setEndereco(sc.nextLine());

        System.out.print("Telefone: ");
        setTelefone(sc.nextLine());
    }

    public void imprimirLoja(){
        System.out.print(String.format(
            """
                Nome da Loja: %s,
                Endereço: %s,
                Telefone: %s,
            """,
                getNome(),
                getEndereco(),
                getTelefone()));
    }

    public void adicionarProduto(Produto produto) {
         produtos.add(produto);
    }

    public void receberCadastroProduto(){
        Produto novoProduto = new Produto();
        novoProduto.cadastrarProduto();
        adicionarProduto(novoProduto);
    }

    public void listarProdutos(){
        for (Produto produto : produtos) {
            produto.imprimirProduto();;
        }
    }

}
