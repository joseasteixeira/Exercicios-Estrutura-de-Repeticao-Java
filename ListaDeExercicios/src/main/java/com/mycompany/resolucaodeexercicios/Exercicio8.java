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
public class Exercicio8 {
    /*
    Faça um programa que leia 5 números e informe a soma e a média dos números.
    */
    public static void main(String[] args){
        int numero;
        int soma=0, media=0;
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Digite o "+(i+1)+"° número: ");
            numero=scan.nextInt();
            soma=soma+numero;
        }
        media=soma/5;
        System.out.println("A soma dos número é "+soma+".");
        System.out.println("A média dos número é "+media+".");
    }
}
