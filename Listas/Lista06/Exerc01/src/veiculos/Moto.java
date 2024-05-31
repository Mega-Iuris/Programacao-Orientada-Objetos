package veiculos;

public class Moto implements Veiculo {
    private String modelo;
    private String potencia;

    public Moto(String modelo, String potencia) {
        this.modelo = modelo;
        this.potencia = potencia;
    }

    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPotencia() {
        return potencia;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    @Override
    public String acelerar() {
        return String.format("Moto %s de %s cilindradas, acelerabdo muito rapido, Vruuum...", this.modelo, this.potencia);
    }

    @Override
    public String frear() {
        return String.format("Moto %s de %s cilindradas freando, Eeeek...", this.modelo, this.potencia);
    }

}
