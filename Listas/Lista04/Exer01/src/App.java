public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.receberInformacoesPessoa();
        pessoa1.exibirCadastroPessoa();
        
        if (pessoa1.alugarCarro()) {
            System.out.println(pessoa1.getNome() + " sua idade atual é sua renda de " + pessoa1.getRenda() + " permite o financiamento de um carro.");
            System.out.println();
        } else{
            System.out.println(pessoa1.getNome() + " nosso sistema constatou que seu score atual não atende os requisitos para o financiamento do carro.");
            System.out.println();
        }

        Carro carro1 = new Carro();
        carro1.receberInformacoesCar();
        carro1.exibirInformacoesCar();
        carro1.classificarCarro();
        
        System.out.println();

        Financiamento financiar1 = new Financiamento();
        financiar1.informarDadosFinanciamento();
        financiar1.exibirDadosFinanciamento();
        System.out.println("Valor da parcela R$ " + financiar1.calcularParcela());
    }
}
