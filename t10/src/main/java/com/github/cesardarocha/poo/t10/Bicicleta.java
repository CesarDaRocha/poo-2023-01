package com.github.cesardarocha.poo.t10;

public class Bicicleta {
    String modelo;
    String cor;
    int aro;
    String marca;
    Pessoa pessoa;

    String possuiDono(Pessoa pessoa){
        String dono = pessoa.nome;
        return dono;
    }
}
