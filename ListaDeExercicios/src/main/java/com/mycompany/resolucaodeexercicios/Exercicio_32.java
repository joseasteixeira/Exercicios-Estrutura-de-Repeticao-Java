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
public class Exercicio_32 {
    /*
    Faça um programa que calcule o fatorial de um número inteiro fornecido 
    pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo 
    abaixo:
    Fatorial de: 5
    5! =  5 . 4 . 3 . 2 . 1 = 120
    */
    public static void main(String[] args){
        int numero,total=1;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        numero=scan.nextInt();
        for(int i=numero;i>0;i--){
            total*=i;
        }
        System.out.print(numero+"! = ");
        for(int i=numero;i>0;i--){
            System.out.print(i);
            if(i>1){
                System.out.print(" . ");
            }
        }
        System.out.println(" = "+total);
    }
}
