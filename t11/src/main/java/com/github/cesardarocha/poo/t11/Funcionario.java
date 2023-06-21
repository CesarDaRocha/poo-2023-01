package com.github.cesardarocha.poo.t11;

public class Funcionario {
    public Lanchonete lanchonete;
    public String nome;

    Lanchonete gerencia(String name[], Lanchonete lanchonete, int posicao ){

        lanchonete.gerenciador = name[posicao];

        return lanchonete;
        
    }


}
