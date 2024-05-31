package animais;

public class Cachorro implements SonsDeCachorros{
    String nome;
    String raca;

    public Cachorro(String nome, String raca) {
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
    public String latido() {
        return String.format("O cachorro %s da raça %s, quando está bravo começa a latir Au au, Au au, Au au...", this.nome, this.raca);
    }

    @Override
    public String comer() {
        return String.format("O cachorro %s da raça %s, quando ver o seu dono com a comida começa a abanar o rabo e fica pulando", this.nome, this.raca);
    }

}
