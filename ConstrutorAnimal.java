public class ConstrutorAnimal {
    public static void main (String [] args){
        Animal animal1= new Animal ();
        Animal animal2= new Animal (4.44);
        Animal animal3= new Animal (4.44, "Amarelo");

        System.out.println ("-------- Cadastro dos Animais: -------");
        System.out.println ("----- Animal 01-----");
        System.out.println ("----- Animal 02-----");
        System.out.println ("Tamanho: " + animal2.getTamanho());
        System.out.println ("----- Animal 03-----");
        System.out.println ("Tamanho: " + animal3.getTamanho());
        System.out.println ("Cor: " + animal3.getCor());
    }
}