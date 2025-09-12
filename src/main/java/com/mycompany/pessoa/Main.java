package com.mycompany.pessoa;
public class Main {
  public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João", "Rua A", "123.456.789-00");
        pf.apresentar();
        pf.mostrarCPF();

        System.out.println();

        PessoaJuridica pj = new PessoaJuridica("Empresa X", "Av. Central", "12.345.678/0001-99");
        pj.apresentar();
        pj.mostrarCNPJ();
    }
}
