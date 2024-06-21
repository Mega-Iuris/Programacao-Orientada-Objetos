import eventos.Show;
import eventos.StandUp;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Show show = new Show("Culpa é do cabral", "Estádio Nacional", "25/07/2024", Arrays.asList("Fabiano Cambota ", "Nando Viana ", "Rodrigo Marques ", " e Thiago Ventura"));
        show.exibirInformacoes();
        show.comecarEvento(true);
        
        System.out.println();

        StandUp standUp = new StandUp("Comédia Noite", "Teatro Municipal", "26/07/2024", "Rafael Portugal ");
        standUp.exibirInformacoes();
        standUp.comecarEvento();
        System.out.println();
    }
}
