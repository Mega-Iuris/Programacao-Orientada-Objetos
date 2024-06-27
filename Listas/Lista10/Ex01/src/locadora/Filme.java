package locadora;
import java.util.ArrayList;
import java.util.List;

public class Filme implements AudioVisual{

    private String titulo;
    private String diretor;
    private List<String> atores = new ArrayList<>();

    public Filme (String titulo, String diretor, List<String> atores) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.atores = atores;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Filme: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Atores: ");
        for (String ator : atores) {
            System.out.println("- " + ator);
        }
    }

    public void addAtor(String ator) {
        atores.add(ator);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public List<String> getAtores() {
        return this.atores;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }

}
