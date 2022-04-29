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
public class Exercicio1 {
    /*
    Faça um programa que peça uma nota, entre zero e dez. 
    Mostre uma mensagem caso o valor seja inválido e continue 
    pedindo até que o usuário informe um valor válido.
    */
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int nota;
        do{
            System.out.println("Informe uma nota entra 0 e 10: ");
            nota=scan.nextInt();
            if(nota<0||nota>10){
                System.out.println("Nota Invalida!");
            }
        }
        while(nota<0||nota>10);
    }
}
