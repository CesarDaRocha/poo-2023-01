package com.github.cesardarocha.poo.t08;

public class Permissao {
//cidade = permissao
//pais = arquivo

private Arquivo arquivo;

    // Construtor da Cidade

    public Permissao() {
    }

    // Métodos de acesso para o País

    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }
}
