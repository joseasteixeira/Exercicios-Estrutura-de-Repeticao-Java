    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaodeexercicios;

import java.util.Scanner;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_27 {
    /*
    Faça um programa que calcule o número médio de alunos por turma. 
    Para isto, peça a quantidade de turmas e a quantidade de alunos 
    para cada turma. As turmas não podem ter mais de 40 alunos.
    */
    public static void main(String[] args){
        int quantidadeTurmas, quantidadeAlunos, aux=0;
        float media;
        Scanner scan=new Scanner(System.in);
        System.out.println("Informe a quantidade de turmas: ");
        quantidadeTurmas=scan.nextInt();
        
        for(int i=0;i<quantidadeTurmas;i++){
            System.out.println("Informe a quantidade de alunos na "+(i+1)+"° turma: ");
            quantidadeAlunos=scan.nextInt();
            if(quantidadeAlunos>0){
                aux+=quantidadeAlunos;
            }
            if(quantidadeAlunos>40||quantidadeAlunos<0){
                System.out.println("Quantidade de alunos invalida!");
                i--;
                if(quantidadeAlunos>40){
                    aux-=quantidadeAlunos;
                }
            }
        }
        media=aux/quantidadeTurmas;
        System.out.println("A média de alunos nas turmas é: "+media);
    }
}
