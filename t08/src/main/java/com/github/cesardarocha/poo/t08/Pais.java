package com.github.cesardarocha.poo.t08;


public class Pais {
    private Cidade cidade;

    // Construtor do País

    public Pais() {
        cidade = new Cidade();
        cidade.setPaís(this);
    }

    // Métodos de acesso para a Cidade

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}

