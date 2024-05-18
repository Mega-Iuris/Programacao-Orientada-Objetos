import java.util.Scanner;

public class Carro {
    Scanner sc = new Scanner(System.in);
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public void receberInformacoesCar() {
        System.out.println("Informe os dados do carro (Marca, Modelo, Ano, Cor): ");
        System.out.println(String.format(marca=sc.nextLine(),
                modelo = sc.nextLine(), ano = sc.nextInt(),sc.nextLine(), cor=sc.nextLine()));
        System.out.println();
        System.out.println("Confira os dados do carro cadastrado!");
    }

    public void exibirInformacoesCar() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Ano " + ano);
        System.out.println("Cor " + cor);
    }

    public boolean classificarCarro() {

        if (ano <= 2016) {
            System.out.println("Seu carro é seminovo ou novo!");
            return true;
        } else {
            System.out.println("Seu carro eh seminovo ou ja tem mais de 10 ano de uso!");
            return false;
        }
    }
}
