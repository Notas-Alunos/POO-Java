package com.mycompany.pessoa;
//pessoa
public class Pessoa {
    protected String nome;
    protected String endereco;

    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
    }

  //pessoa juridica
    public class PessoaJuridica {
        private String cnpj;
        private String razaoSocial;

        public PessoaJuridica(String cnpj, String razaoSocial) {
            this.cnpj = cnpj;
            this.razaoSocial = razaoSocial;
        }

        public void apresentarJuridica() {
            System.out.println("Razão Social: " + razaoSocial);
            System.out.println("CNPJ: " + cnpj);
        }
    }
}

