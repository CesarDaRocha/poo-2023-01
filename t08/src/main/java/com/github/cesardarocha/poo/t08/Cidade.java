package com.github.cesardarocha.poo.t08;

public class Cidade {
    // cidade = livro
    
    private Pais pais;

    
    public Cidade(Pais pais) {
      
        setPais(pais);
       
    }


    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
  
}
