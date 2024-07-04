import musica.BibliotecaMusical;
import musica.Musica;
import java.util.Scanner;
import exception.MusicaNaoEncontradaException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Bem vindo a sua biblioteca musical!\n");
        Musica[] musicas = {
                new Musica("Staying Alive", "Bee Gees", "Survivor"),
                new Musica("Imagine", "John Lennon", "Imagine"),
                new Musica("Hotel California", "Eagles", "Hotel California"),
                new Musica("Paradise", "Coldplay", "X&Y"),
                new Musica("Wonderwall", "Oasis", "Blizzard of Ozz")
        };

        BibliotecaMusical bibliotecaMusica = new BibliotecaMusical();

        for (Musica musica : musicas) {
            bibliotecaMusica.adicionarMusica(musica.getTitulo(), musica);
        }

        bibliotecaMusica.listaMusicas();

        System.out.println();
        System.out.print("Busque uma musica pelo titulo: ");
        String tituloBusca = sc.nextLine();

        try {
            Musica musicaEncontrada = bibliotecaMusica.buscarMusica(tituloBusca);
            System.out.println("\nMúsica encontrada:");
            System.out.println("Título: " + musicaEncontrada.getTitulo());
            System.out.println("Artista: " + musicaEncontrada.getArtista());
            System.out.println("Álbum: " + musicaEncontrada.getAlbum());
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}