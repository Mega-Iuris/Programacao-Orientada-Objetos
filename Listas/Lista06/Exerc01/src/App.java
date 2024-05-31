import veiculos.Carro;
import veiculos.Moto;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();

        Carro carro = new Carro("Chevrolet", "Camaro", "2024");
        System.out.println(carro.acelerar());
        System.out.println(carro.frear());

        System.out.println();

        Moto moto = new Moto("Yamaha MT-09", "10.000 rpm");
        System.out.println(moto.acelerar());
        System.out.println(moto.frear());

        System.out.println();
    }
}
