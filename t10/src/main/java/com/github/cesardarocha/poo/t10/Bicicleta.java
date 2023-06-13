package com.github.cesardarocha.poo.t10;

public class Bicicleta {
    String modelo;
    String cor;
    int aro;
    String marca;
    Pessoa pessoa;

    void possuiDono(Pessoa pessoa){
        String dono = pessoa.nome;
    }
}
