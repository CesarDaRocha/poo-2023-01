package com.github.cesardarocha.poo.t08;

public class Emprego {
    private float salario;
    private String inicio;
    private String fim;
    private Pessoa pessoa;


    public Emprego() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
