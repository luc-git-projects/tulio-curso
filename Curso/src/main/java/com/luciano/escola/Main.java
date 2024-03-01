package com.luciano.escola;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Curso curso = new Curso();
        
        for(int i = 0; i < 5; i++){
            String nome = sc.next();
            double nota = sc.nextDouble();
            
            Estudante estudante = new Estudante();
            estudante.setNome(nome);
            estudante.setNota(nota);
            
            curso.adicionarEstudante(estudante);
        }
        
        
    }

}