/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaodeexercicios;

import java.util.Scanner;

/**
 *
 * @author José Teixeira
 */
public class Exercicio_15 {
    /*
    A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... 
    Faça um programa capaz de gerar a série até o n−ésimo termo.
    */
    public static void main(String[] args){
        int numero1=0, numero2=1, serie=1;
        int quantidade;
        Scanner scan=new Scanner(System.in);
        System.out.println("Informe a quanteidade de elementos que deve conter na sequencia de Fibonacci: ");
        quantidade=scan.nextInt();
        for(int i=0;i<quantidade;i++){
            System.out.println(serie);
            serie=numero1+numero2;
            numero1=numero2;
            numero2=serie;
        }
    }
}
