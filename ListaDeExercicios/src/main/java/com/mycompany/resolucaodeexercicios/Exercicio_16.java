/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaodeexercicios;

/**
 *
 * @author José Teixeira
 */
public class Exercicio_16 {
    /*
    A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,... 
    Faça um programa que gere a série até que o valor seja maior que 500.
    */
    public static void main(String[] args){
        int numero1=0, numero2=1, serie=1;
        System.out.println(serie);
        do{
            serie=numero1+numero2;
            numero1=numero2;
            numero2=serie;
            System.out.println(serie);
        }
        while(serie<500);
    }
}
