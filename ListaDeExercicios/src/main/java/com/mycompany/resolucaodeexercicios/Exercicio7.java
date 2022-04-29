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
public class Exercicio7 {
    /*
    Faça um programa que leia 5 números e informe o maior número.
    */
    public static void main(String[] args){
        int numero;
        int maior=0;
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Digite o "+(i+1)+"° número: ");
            numero=scan.nextInt();
            if(numero>maior){
                maior=numero;
            }
        }
        System.out.println("O maior número é "+maior+".");
    }
}
