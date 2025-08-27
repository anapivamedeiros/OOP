public class ConstrutorCarro {
    public static void main (String [] args){
        Carro carro1= new Carro ();
        Carro carro2=new Carro ("FUI 2021");
        Carro carro3= new Carro ("FUI 2021", "9BWHE21JX24060960");

        System.out.println ("----------- Detalhes dos Carros: ---------");
        System.out.println ("-----Carro 01-----");
        System.out.println ("-----Carro 02-----");
        System.out.println ("Placa: " + carro2.getPlaca());
        System.out.println ("-----Carro 03-----");
        System.out.println ("PLaca: "+carro3.getPlaca());
        System.out.println ("Número do Chassi: "+carro3.getNumChassi());
    }
}