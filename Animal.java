public class Animal {
    private double tamanho;
    private String cor;

    public Animal (){
    }
    public Animal (double tamanho){
        this.tamanho=tamanho;
    }
    public Animal (double tamanho, String cor){
        this.tamanho=tamanho;
        this.cor=cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}