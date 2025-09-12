package com.mycompany.pessoa;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public void mostrarCPF() {
        System.out.println("CPF: " + cpf);
    }
}

