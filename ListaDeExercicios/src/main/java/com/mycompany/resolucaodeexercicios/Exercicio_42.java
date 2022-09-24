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
public class Exercicio_42 {
    /*
    Faça um programa que leia uma quantidade indeterminada de números 
    positivos e conte quantos deles estão nos seguintes intervalos: [0-25], 
    [26-50], [51-75] e [76-100]. A entrada de dados deverá terminar quando 
    for lido um número negativo.
    */
    public static void main(String[] args){
        int numeros=1, intervalo1=0, intervalo2=0, intervalo3=0, intervalo4=0;
        Scanner scan=new Scanner(System.in);
        
        while(numeros>=0){
            System.out.println("Digite um número: ");
            numeros=scan.nextInt();
            
            if(numeros>0&&numeros<=25){
                intervalo1++;
            }
            else;
            if(numeros>=26&&numeros<=50){
                intervalo2++;
            }
            else;
            if(numeros>=51&&numeros<=75){
                intervalo3++;
            }
            else;
            if(numeros>=76&&numeros<=100){
                intervalo4++;
            }
            else;
        }
        System.out.println("Possui "+intervalo1+" números no intervalo [1-25]!"
                           +"\nPossui "+intervalo2+" números no intervalo [26-50]!"
                           +"\nPossui "+intervalo3+" números no intervalo [51-75]!"
                           +"\nPossui "+intervalo4+" números no intervalo [76-100]!");
    }
}
