ObjetoCadeira.java
  import java.util.Scanner;
public class ObjetoCadeira {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cadeira[] cadeira1 = new Cadeira[3];

        for (int i = 0; i < 3; i++) {
            cadeira1[i]= new Cadeira();

            System.out.println("Adicione os dados da " + (i+1) + "° cadeira");
            System.out.println("Digite o tipo de material que deseja: ");
            String material = ler.nextLine();
            System.out.println("Digite a marca da cadeira que deseja: ");
            String marca = ler.nextLine();
            System.out.println("Digite a cor da cadeira que deseja:: ");
            String cor = ler.nextLine();
            System.out.println("Digite o ambiente de uso da cadeira desejável: ");
            String ambienteDeUso = ler.nextLine();
            System.out.println("Digite o valor da cadeira que você deseja: ");
            double valor = ler.nextDouble();
            ler.nextLine();

            cadeira1[i].setMaterial(material);
            cadeira1[i].setMarca(marca);
            cadeira1[i].setCor(cor);
            cadeira1[i].setAmbienteDeUso(ambienteDeUso);
            cadeira1[i].setValor(valor);

        }
        for (int i = 0; i < 3; i++) {
            System.out.println("----CADASTRO da " +(i+1)+ "° CADEIRA----");
            System.out.println("O material da cadeira é: " + cadeira1[i].getMaterial());
            System.out.println("A marca da cadeira é: " + cadeira1[i].getMarca());
            System.out.println("A cor da cadeira é: " + cadeira1[i].getCor());
            System.out.println("O ambiente de uso da cadeira é: " + cadeira1[i].getAmbienteDeUso());
            System.out.println("A faixa do valor que desejo é: " + cadeira1[i].getValor());
        }
    }
}








Cadeira.java
public class Cadeira {
    String material;
    String marca;
    String cor;
    String ambienteDeUso;
    double valor;

    public String getMaterial() {
        return material;

    }
    public void setMaterial(String material){

        this.material = material;
    }
    public String getMarca() {

        return marca;
    }
    public void setMarca(String marca){

        this.marca = marca;
    }
    public String getCor() {

        return cor;
    }
    public void setCor(String cor){

        this.cor = cor;
    }
    public String getAmbienteDeUso() {

        return ambienteDeUso;
    }
    public void setAmbienteDeUso(String ambienteDeUso){

        this.ambienteDeUso = ambienteDeUso;
    }
    public double getValor(){

        return valor;
    }
    public void setValor(double valor){

        this.valor = valor;
    }
}
