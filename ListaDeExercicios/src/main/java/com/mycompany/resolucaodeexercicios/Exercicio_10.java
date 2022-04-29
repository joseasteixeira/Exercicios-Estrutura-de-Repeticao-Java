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
public class Exercicio_10 {
    /*
    Faça um programa que receba dois números inteiros e gere os números 
    inteiros que estão no intervalo compreendido por eles.
    */
    
    public static void main(String[] args){
        int num1, num2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        num1=scan.nextInt();
        System.out.println("Informe o segundo número: ");
        num2=scan.nextInt();
        
        for(int i=num1;i<=num2;i++){
            System.out.print(i+" ");
        }
    }
}
