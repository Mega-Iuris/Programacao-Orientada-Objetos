import java.util.Scanner;

public class Financiamento {

    Scanner sc = new Scanner(System.in);
    private double valor;
    private int parcelas;

    public double getValor() {
        return valor;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void informarDadosFinanciamento() {
        System.out.println("Informe os dados para financiamento:");

        System.out.print("Valor do carro: ");
        valor = sc.nextDouble();
        sc.nextLine();

        System.out.print("Em quantas parcelas (10, 16 ou 24) voce deseja: ");
        parcelas = sc.nextInt();
        sc.nextLine();

        System.out.println("\nConfira os dados do financiamento!");
    }

    public void exibirDadosFinanciamento() {

        System.out.println("Valor: " + valor);
        System.out.println("Parcelas: " + parcelas);
    }

    public double calcularParcela() {
        double taxaJurosAnual = 0;

        if (parcelas == 10) {
            taxaJurosAnual = 0.02;
        } else if (parcelas == 16) {
            taxaJurosAnual = 0.05;
        } else if (parcelas == 24) {
            taxaJurosAnual = 0.07;
        }

        double taxaJurosMensal = taxaJurosAnual / 12;
        double i = taxaJurosMensal;
        int quantParcelas = parcelas;
        double prestacao = (valor * i) / (1 - Math.pow(1 + i, -quantParcelas));

        double resultado = Math.round(prestacao * 100.0) / 100.0;
        
        return resultado;
    }
}
