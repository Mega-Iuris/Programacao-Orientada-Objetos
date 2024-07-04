package musica;
import java.util.HashMap;
import java.util.Map;
import exception.MusicaNaoEncontradaException;

public class BibliotecaMusical {
    Map<String, Musica> acervo = new HashMap<>();

    public void adicionarMusica(String titulo, Musica musica) {
        acervo.put(titulo, musica);
    }

    public void listaMusicas() {
        for (Musica titulo : acervo.values()) {
            System.out.println(titulo);
        }
    }

    public Musica buscarMusica(String titulo)throws MusicaNaoEncontradaException {
        if(!acervo.containsKey(titulo)){
            throw new MusicaNaoEncontradaException("A musica não foi encontrada");
        }
        return acervo.get(titulo);
    }


    public Map<String,Musica> getAcervo() {
        return this.acervo;
    }

    public void setAcervo(Map<String,Musica> acervo) {
        this.acervo = acervo;
    }
}