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
public class Exercicio_25 {
    /*
    Faça um programa que peça para n pessoas a sua idade, ao final o 
    programa devera verificar se a média de idade da turma varia entre 
    0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, 
    adulta ou idosa, conforme a média calculada.
    */
    public static void main(String[] args){
        int numeroDeIdades;
        float aux=0, media;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Informe a quantidade de pessoa que compoe a media: ");
        numeroDeIdades=scan.nextInt();
        
        for(int i=0;i<numeroDeIdades;i++){
            System.out.println("Informe a "+(i+1)+"° nota: ");
            aux+=scan.nextFloat();
            //aux2+=aux;
        }
        media=aux/numeroDeIdades;
        System.out.println("A média é: "+media);
        if(media>=0&&media<=25){
            System.out.println("Turma jovem!");
        }
        else;
        if(media>=26&&media<=60){
            System.out.println("Turma adulta!");
        }
        else;
        if(media>60){
            System.out.println("Turma idosa!");
        }
        else;
    }
}
