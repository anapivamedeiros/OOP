ObjetoComputador.java
import java.util.Scanner;
public class ObjetoComputador {
    public static void main (String[]args){
        Scanner ler = new Scanner(System.in);
        Computador[] computador1 = new Computador[3];

        for(int i = 0; i < 3; i++) {
            computador1[i] = new Computador();
            System.out.println("Insira as informações do " + (i + 1) + "° computador:");
            System.out.println("Digite  a cor do computador desejado: ");
            String cor = ler.nextLine();
            System.out.println("Digite  o modelo do computador desejado: ");
            String modelo = ler.nextLine();
            System.out.println("Digite  o preço do computador desejado: ");
            double preco = ler.nextDouble();
            ler.nextLine();
            System.out.println("Digite  a marca do computador desejado: ");
            String marca = ler.nextLine();
            System.out.println("Digite  o armazenamento do computador desejado: ");
            double armazenamento = ler.nextDouble();
            ler.nextLine();

            computador1[i].setCor(cor);
            computador1[i].setModelo(modelo);
            computador1[i].setPreco(preco);
            computador1[i].setMarca(marca);
            computador1[i].setArmazenamento(armazenamento);

        }
        for(int i = 0; i < 3; i++){
            System.out.println("----CADASTRO DO "+ (i+1)+"° COMPUTADOR----");
            System.out.println("A cor inserida foi: "+ computador1[i].getCor());
            System.out.println("O modelo inserido foi: "+ computador1[i].getModelo());
            System.out.println("O preço inserido foi: "+ computador1[i].getPreco());
            System.out.println("A marca inserida foi: "+ computador1[i].getMarca());
            System.out.println("O armazenamento inserido foi: "+ computador1[i].getArmazenamento());
        }
    }
}







Computador.java
public class Computador {
    String cor;
    String modelo;
    double preco;
    String marca;
    double armazenamento;

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public double getArmazenamento(){
        return armazenamento;
    }
    public void setArmazenamento(double armazenamento){
        this.armazenamento = armazenamento;
    }
}
