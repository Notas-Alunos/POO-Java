package com.mycompany.pessoa;
//pessoa fisica
public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco); // Chama o construtor da classe Pessoa
        this.cpf = cpf;
       
    }

    public void mostrarCPF() {
        System.out.println("CPF: " + cpf);
    }
}
