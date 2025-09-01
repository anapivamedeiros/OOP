package Heranca;

public class ObjetoPrincipal {
    public static void main(String[] args) {

        // Criando uma Pessoa
        Pessoa pessoa = new Pessoa("João da Silva", "(11) 9994-9999");
        System.out.println("\nPessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());

        // Criando uma Pessoa Física
        PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", "(11) 9999-9999", "123.456.789-00", "300.456.989-X");
        System.out.println("\nPessoa Física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Telefone: " + pessoaFisica.getTelefone());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("RG: " + pessoaFisica.getRg());

        // Criando uma Pessoa Jurídica
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(11) 9999-9999", "12.345.678/0001-23");
        System.out.println("\nPessoa Jurídica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("Telefone: " + pessoaJuridica.getTelefone());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
    }
}
