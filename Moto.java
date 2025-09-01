package Heranca;

public class Moto extends Veiculo {
    private String cilindrada;

    public Moto(String marca, String modelo, int ano, String cor, String cilindrada){
        super(marca, modelo, ano, cor);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
}
