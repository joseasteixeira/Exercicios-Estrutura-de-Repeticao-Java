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
public class Exercicio_24 {
    /*
    Faça um programa que calcule o mostre a média aritmética de N notas.
    */
    public static void main(String[] args){
        int numeroDeNotas;
        float aux=0, media;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Informe a quantidade de notas que compoe a media: ");
        numeroDeNotas=scan.nextInt();
        
        for(int i=0;i<numeroDeNotas;i++){
            System.out.println("Informe a "+(i+1)+"° nota: ");
            aux+=scan.nextFloat();
            //aux2+=aux;
        }
        media=aux/numeroDeNotas;
        System.out.println("A média é: "+media);
    }
}
