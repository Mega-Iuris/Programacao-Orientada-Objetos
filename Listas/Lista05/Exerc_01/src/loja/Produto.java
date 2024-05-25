package loja;
import java.util.Scanner;

public class Produto {

    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private static final Scanner sc = new Scanner(System.in);

    public Produto(int id, String nome, String descricao, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void cadastrarProduto() {
        System.out.println("Cadastre o produto: ");

        System.out.print("Id produto: ");
        setId(Integer.parseInt(sc.nextLine()));

        System.out.print("Nome do produto: ");
        setNome(sc.nextLine());

        System.out.print("Descrição: ");
        setDescricao(sc.nextLine());

        System.out.print("Preço: ");
        String precoStr = sc.nextLine().replace(",", ".");
        setPreco(Double.parseDouble(precoStr));

        System.out.print("Quantidade: ");
        setQuantidade(Integer.parseInt(sc.nextLine()));
    }

    public void imprimirProduto() {
        System.out.printf(
            "Id do produto: %d%nNome do produto: %s%nDescrição: %s%nPreço: %.2f%nQuantidade: %d%n",
            getId(), getNome(), getDescricao(), getPreco(), getQuantidade()
        );
    }
}
