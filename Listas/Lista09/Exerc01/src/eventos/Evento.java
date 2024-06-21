package eventos;

public abstract class Evento {
    private String nome;
    private String local;
    private String data;

    public Evento(String nome, String local, String data) {
        this.nome = nome;
        this.local = local;
        this.data = data;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Local: " + local);
        System.out.println("Data: " + data);
    }

    public abstract void comecarEvento();
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
