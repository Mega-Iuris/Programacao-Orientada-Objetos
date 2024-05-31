package veiculos;

public class Carro implements Veiculo {
    private String marca;
    private String modelo;
    private String ano;

    public Carro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String acelerar() {
        return String.format("O novo %s %s %s, acelerou a mais de 200 pro hora Vruuum...", this.marca, this.modelo, this.ano);
    }

    @Override
    public String frear() {
        return String.format("O novo %s %s %s tem freios super ABS, perceba pelo som Eeeek...", this.marca, this.modelo, this.ano);
    }

}
