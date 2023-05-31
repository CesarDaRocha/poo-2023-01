package com.github.cesardarocha.poo.t08;
import java.util.TreeSet;

public class Paragrafo {
    private TreeSet sentencas = new TreeSet<>();
     public void novaSentenca(Sentenca c){
        sentencas.add(c);

     }

     public Paragrafo (Sentenca c){
        sentencas.add(c);
     }
    
}
