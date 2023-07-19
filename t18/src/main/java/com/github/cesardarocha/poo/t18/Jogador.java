package com.github.cesardarocha.poo.t18;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Lance> lances;

    public Jogador(String nome) {
        this.nome = nome;
        this.lances = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarLance(Lance lance) {
        lances.add(lance);
    }

    public List<Lance> getLances() {
        return lances;
    }

}
