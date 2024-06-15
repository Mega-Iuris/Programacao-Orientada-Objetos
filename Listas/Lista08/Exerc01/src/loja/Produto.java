package loja;

import java.util.Scanner;
import exceptions.NomeInvalidoException;
import exceptions.PrecoInvalidoException;

public class Produto {
    private static Scanner sc = new Scanner(System.in);
    private String nome;
    private double preco;

    public Produto() { }

    public Produto(String nome, double preco) throws NomeInvalidoException, PrecoInvalidoException {
        setNome(nome);
        setPreco(preco);
    }

    public void ler() {
        while (true) {
            try {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                setNome(nome);

                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                sc.nextLine(); // consume newline
                setPreco(preco);
                
                break;
            } catch (NomeInvalidoException | PrecoInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void exibirInformacoes() {
        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (preco > 0) {
            this.preco = preco;
        } else {
            throw new PrecoInvalidoException();
        }
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome != null && !nome.trim().isEmpty() && nome.length() >= 3) {
            this.nome = nome;
        } else {
            throw new NomeInvalidoException();
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
