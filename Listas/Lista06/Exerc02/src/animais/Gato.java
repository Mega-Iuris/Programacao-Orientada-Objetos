package animais;

public class Gato implements SonsDeGatos{
    String nome;
    String raca;

    public Gato(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String miado() {
        return String.format("O gatinho %s da raça %s, quando está sozinho começa a fazer Miau, miau, miau...", this.nome, this.raca);
    }

    @Override
    public String comer() {
        return String.format("O gatinho %s da raça %s, quando ver o seu dono com a comida fica andando entre as pernas do seu dono", this.nome, this.raca);
    }

}
