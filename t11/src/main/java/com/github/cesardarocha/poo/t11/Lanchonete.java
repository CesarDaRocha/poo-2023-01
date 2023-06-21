package com.github.cesardarocha.poo.t11;

public class Lanchonete {
    public String nome;
    public String gerenciador;
    public Funcionario funcionarios[];
    public String nomeFuncionario[];

    String[] emprega(String nomeFuncionario[], Funcionario funcionario, int posicao){

        nomeFuncionario[posicao] = funcionarios[posicao].nome;
         
        return nomeFuncionario;

    }



}
