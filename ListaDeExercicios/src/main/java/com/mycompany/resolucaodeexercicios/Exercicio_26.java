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
public class Exercicio_26 {
    /*
    Numa eleição existem três candidatos. Faça um programa que peça o número
    total de eleitores. Peça para cada eleitor votar e ao final mostrar o 
    número de votos de cada candidato.
    */
    public static void main(String[] args){
        int eleitores, votos=0, votosC1=0, votosC2=0, votosC3=0, votosErrados=0;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Iforme a quantidade de eleitores: ");
        eleitores=scan.nextInt();
        
        for(int i=0;i<eleitores;i++){
            System.out.println((i+1)+"° pessoa, Escolha o candidato 1, 2 ou 3: ");
            votos=scan.nextInt();
            switch(votos){
                case 1: votosC1++;
                break;
                case 2: votosC2++;
                break;
                case 3: votosC3++;
                break;
                default: votosErrados++;
            }
        }
        System.out.println("O candidato 1 teve "+votosC1+" votos.");
        System.out.println("O candidato 2 teve "+votosC2+" votos.");
        System.out.println("O candidato 3 teve "+votosC3+" votos.");
        System.out.println(votosErrados+" pessoas votaram errado.");
        
        if(votosC1>votosC2&&votosC1>votosC3){
            System.out.println("O candidati 1 é o vençedor!");
        }
        else;
        if(votosC2>votosC1&&votosC2>votosC3){
            System.out.println("O candidati 2 é o vençedor!");
        }
        else;
        if(votosC3>votosC2&&votosC3>votosC1){
            System.out.println("O candidati 3 é o vençedor!");
        }
        else;
        if(votosC1==votosC2&&votosC1==votosC3&&votosC2==votosC3||
           (votosC1>votosC3&&votosC2>votosC3&&votosC1==votosC2)||
           (votosC1>votosC2&&votosC3>votosC2&&votosC1==votosC3)||
           (votosC3>votosC1&&votosC2>votosC1&&votosC3==votosC2)){
            System.out.println("Empate!");
        }
        else;
        
    }
}
