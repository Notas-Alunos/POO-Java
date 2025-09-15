package com.mycompany.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Empresa X", "Av. Central");
        pessoa.apresentar();
        
        Pessoa.PessoaJuridica pj = pessoa.new PessoaJuridica("12.345.678/0001-99", "Empresa X Ltda");
        pj.apresentarJuridica();

        pj.setCnpj("98.765.432/0001-00");
        pj.setRazaoSocial("Nova Empresa S.A.");
        
        System.out.println("\n--- Dados Atualizados ---");
        System.out.println("Novo CNPJ: " + pj.getCnpj());
        System.out.println("Nova Razão Social: " + pj.getRazaoSocial());

        System.out.println("\n--- Apresentação atualizada ---");
        pj.apresentarJuridica();
    }
}
