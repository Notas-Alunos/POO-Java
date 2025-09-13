package com.mycompany.pessoa;
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Empresa X", "Av. Central");
        pessoa.apresentar();

        // Criando a classe interna
        Pessoa.PessoaJuridica pj = pessoa.new PessoaJuridica("12.345.678/0001-99", "Empresa X Ltda");
        pj.apresentarJuridica();
    }
}
