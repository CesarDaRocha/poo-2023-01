package com.github.cesardarocha.poo.t08;

public class Cidade {
    
    //Editora = Pais
   
    private País pais;
   
    


    public Cidade(País pais) {
        
        setPaís(pais);
        
    }
    public País getPaís() {
        return pais;
    }

    public void setPaís(País pais) {
        this.pais = pais;
    }
    
}
