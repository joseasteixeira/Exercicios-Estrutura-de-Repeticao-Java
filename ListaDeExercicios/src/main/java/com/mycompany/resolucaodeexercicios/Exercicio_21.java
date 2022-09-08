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
public class Exercicio_21 {
    /*
    Faça um programa que peça um número inteiro e determine se ele é ou não 
    um número primo. Um número primo é aquele que é divisível somente por ele 
    mesmo e por 1.
    */
    public static void main(String[] args){
        int numero;
        boolean teste=false;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        numero=scan.nextInt();
        
        for(int i=(numero-1);i>1;i--){
            if(numero%i==0){
                teste=true;
                break;
            }
        }
        if(teste==true){
            System.out.println("Não é um número primo!");
        }
        
        else{
            System.out.println("È um número primo!");
        }
    }
}
