package com.github.cesardarocha.poo.t11;

public class Cadeira {
    private String dono;
    
    Pessoa pessoa = new Pessoa();

public String possuiDono(Pessoa pessoa){
    dono = pessoa.nome;
  return dono;

}


}
