package com.luciano.escola;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    private List<Estudante> listaEstudantes;
    
    public Curso(){
        listaEstudantes = new ArrayList<>();
        
   }
    
   public double somaNotas(){
       double soma = 0.0;
       for(Estudante et : listaEstudantes){
           soma += et.getNota();
       }
       return soma;
   }
   
   public double mediaNotas(){
       double media = somaNotas() / listaEstudantes.size();
       return media;
   }
   
   public Estudante estudanteMaiorNota(){
       
       Estudante estudanteMaiorNota = listaEstudantes.get(0); 
       
       for(int i = 1; i < listaEstudantes.size(); i++){
           Estudante estudante = listaEstudantes.get(i);
          
           if(estudante.getNota() > estudanteMaiorNota.getNota() ){
               
               estudanteMaiorNota = estudante;
           }
       }
       
       return estudanteMaiorNota;
               
   }
   
   public void adicionarEstudante(Estudante estudante){
       listaEstudantes.add(estudante);
   }
   
    
}