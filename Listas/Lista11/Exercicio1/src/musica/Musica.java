package musica;
import exception.MusicaNaoEncontradaException;

public class Musica {
    private String titulo;
    private String artista;
    private String album;

    
    public Musica(String titulo, String artista, String album) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
    }

    @Override
    public String toString() {
        return "Musica - titulo: " + titulo + ", artista: " + artista + ", album: " + album;
    }

    public String getTitulo() throws MusicaNaoEncontradaException {
        if (this.titulo == null) {
            throw new MusicaNaoEncontradaException("A musica não foi encontrada");
        }
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
