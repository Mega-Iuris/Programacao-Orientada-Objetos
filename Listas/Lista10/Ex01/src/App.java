import java.util.ArrayList;
import java.util.List;
import locadora.AudioVisual;
import locadora.Filme;
import locadora.Jogo;
import locadora.Locadora;

public class App {
    public static void main(String[] args) {

        List<String> atoresBadBoys4 = new ArrayList<>();
        String[] atoresFilme1 = {"Will Smith", "Martin Lawrence","Paola Núñez", "Vanessa Hudgens"};  
        for (String ator : atoresFilme1) {
            atoresBadBoys4.add(ator);
        }
        Filme filme1 = new Filme("Bad Boys 4", "Lindsay Graham", atoresBadBoys4);
        

        List<String> atoresBandida = new ArrayList<>();
        String[] atoresFilme2 = {"Michely Gabriely", "Natália Deodato", "Alex Wolff", "Natália Lage", "Milhem Cortaz"};
        for (String ator : atoresFilme2) {
            atoresBandida.add(ator);
        } 
        Filme filme2 = new Filme("Bandida - A Número Um", "João Wainer", atoresBandida);

        List<String> atoresUmLugarSilenciosoDiaUm = new ArrayList<>();
        String[] atoresFilme3 = {"Lupita Nyong'o", "Joseph Quinn", "Alex Wolff", "Djimon Hounsou", "Jennifer Woodward"};       
        for (String ator : atoresFilme3) {
            atoresUmLugarSilenciosoDiaUm.add(ator);
        }
        Filme filme3 = new Filme("Um Lugar Silencioso: Dia Um", "Michael Sarnoski", atoresUmLugarSilenciosoDiaUm);


        Jogo theLastOfUs = new Jogo("The Last of Us", "PlayStation");
        
        Locadora<AudioVisual> LocFilmesJogos = new Locadora<>();

        LocFilmesJogos.adicionarItem(filme1);
        LocFilmesJogos.adicionarItem(filme2);
        LocFilmesJogos.adicionarItem(filme3);
        LocFilmesJogos.adicionarItem(theLastOfUs);

        System.out.println("Itens disponíveis na locadora:");
        System.out.println();
        LocFilmesJogos.listarItens();

        String tituloBuscado = "Bad Boys 4";
        System.out.println("\nBuscando o filme '" + tituloBuscado + "' na locadora:");
       
        System.out.println();
        AudioVisual itemEncontrado = LocFilmesJogos.buscarItem(tituloBuscado);
        if (itemEncontrado != null) {
            System.out.println("Item encontrado:");
            itemEncontrado.exibirInfo();
        } else {
            System.out.println("Nenhum item encontrado com o título: " + tituloBuscado);
        }
    }
}