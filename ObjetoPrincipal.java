
    package Heranca;

    public class ObjetoPrincipal {
        public static void main(String [] args) {

            Veiculo veiculo = new Veiculo("Ferrari", "12Cilindr", 2025, "Vermelha");
            System.out.println("Veiculo:");
            System.out.println("Marca:" + veiculo.getMarca());
            System.out.println("Modelo:" + veiculo.getModelo());
            System.out.println("Ano:" + veiculo.getAno());
            System.out.println("Cor:" + veiculo.getCor());

            Automovel automovel = new Automovel("Porsche", "718 Boxster", 2016, "Rosa", 2, "motores 2.0 turbo de 4 cilindros e motores aspirados de 4.0 litros com 6 cilindros");
            System.out.println("\nAutomóvel:");
            System.out.println("Marca:" + automovel.getMarca());
            System.out.println("Modelo:" + automovel.getModelo());
            System.out.println("Ano:" + automovel.getAno());
            System.out.println("Cor:" + automovel.getCor());
            System.out.println("Numero de portas:" + automovel.getNumPortas());
            System.out.println("Motor:" + automovel.getMotor());

            Moto moto = new Moto("Ducati", "Diavel V4", 2025, "Vermelha", "1.158 cc de cilindrada");
            System.out.println("\nMoto:");
            System.out.println("Marca:" + moto.getMarca());
            System.out.println("Modelo:" + moto.getModelo());
            System.out.println("Ano:" + moto.getAno());
            System.out.println("Cor:" + moto.getCor());
            System.out.println("Cilindrada:" + moto.getCilindrada());

        }
    }

