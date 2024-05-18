import java.util.Scanner;

public class Pessoa {
    Scanner sc = new Scanner(System.in);

    private String nome;
    private int idade;
    private String endereco;
    private double renda;

    public String getNome() {
        return nome;

    }

    public Double getRenda() {
        return renda;
    }

    public void receberInformacoesPessoa() {
        System.out.println("Informe os dados para cadastro:");
        
        System.out.print("Nome: ");
        nome = sc.nextLine();
        
        System.out.print("Idade: ");
        idade = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Endereco: ");
        endereco = sc.nextLine();
        
        System.out.print("Renda: ");
        renda = sc.nextDouble();       
        sc.nextLine();

        System.out.println("\nConfira seus dados cadastrados!");
    }

    public void exibirCadastroPessoa() {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereco: " + endereco);
        System.out.println("Renda: " + renda);
    }

    public boolean alugarCarro() {
        return idade >= 18 && renda >= 2500;
    }

}
