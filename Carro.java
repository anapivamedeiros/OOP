public class Carro {
    private String placa;
    private String numChassi;

    public Carro (){
    }
    public Carro (String placa){
        this.placa=placa;
    }
    public Carro (String placa, String numChassi){
        this.placa=placa;
        this.numChassi=numChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(String numChassi) {
        this.numChassi = numChassi;
    }
}