Aviao.java
public class Aviao {
    String tipo;
    String cor;
    double velocidade;
    int qtdeAssentos;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    public int getQtdeAssentos() {
        return qtdeAssentos;
    }
    public void setQtdeAssentos(int qtdeAssentos){
        this.qtdeAssentos = qtdeAssentos;
    }
}








ObjetoAviao.java
import java.util.Scanner;
public class ObjetoAviao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aviao[] aviao1 = new Aviao[4];

        for (int i = 1; i < 4; i++) {
            aviao1[i]= new Aviao();

            System.out.println("Adicione os dados do " + i + "° avião");
            System.out.println("Digite o tipo de avião: ");
            String tipo = ler.nextLine();
            System.out.println("Digite a cor de avião: ");
            String cor = ler.nextLine();
            System.out.println("Digite a velocidade do avião: ");
            double velocidade = ler.nextDouble();
            System.out.println("Digite a quantidade de assentos do avião: ");
            int qtdeAssentos = ler.nextInt();
            ler.nextLine();

            aviao1[i].setTipo(tipo);
            aviao1[i].setCor(cor);
            aviao1[i].setVelocidade(velocidade);
            aviao1[i].setQtdeAssentos(qtdeAssentos);
        }
        for (int i = 1; i < 4; i++) {
            System.out.println("----CADASTRO " +i+ "° AVIAO----");
            System.out.println("O tipo do avião é: " + aviao1[i].getTipo());
            System.out.println("A cor do avião é: " + aviao1[i].getCor());
            System.out.println("A velocidade do avião é: " + aviao1[i].getVelocidade());
            System.out.println("A quantidades de assentos que o avião possui são: " + aviao1[i].getQtdeAssentos());
        }
    }
}
