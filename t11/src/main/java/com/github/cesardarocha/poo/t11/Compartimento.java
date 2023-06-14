package com.github.cesardarocha.poo.t11;

import java.util.ArrayList;

public class Compartimento {
    public int qntLivro;
    public String livGuardados[];

    private ArrayList<Livro[]> livro = new ArrayList<Livro[]>();

    String[] guarda( Livro livro, int posicao){
        
        livGuardados[posicao] = livro.nome; 
        return livGuardados;

    }

    
    
}
