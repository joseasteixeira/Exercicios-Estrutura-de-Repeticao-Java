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
public class Exercicio_34 {
    /*
    Os números primos possuem várias aplicações dentro da Computação, por 
    exemplo na Criptografia. Um número primo é aquele que é divisível apenas 
    por um e por ele mesmo. Faça um programa que peça um número inteiro e 
    determine se ele é ou não um número primo.
    */
    public static void main(String[] args){
        int numero;
        boolean teste=false;
        Scanner scan=new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero=scan.nextInt();
        
        for(int i=(numero-1);i>1;i--){
            if(numero%i==0){
                teste=true;
            }
        }
        if(teste==false){
            System.out.println(numero+" é primo!");
        }
        else{
            System.out.println(numero+" não é primo!");
        }
        
    }
}
