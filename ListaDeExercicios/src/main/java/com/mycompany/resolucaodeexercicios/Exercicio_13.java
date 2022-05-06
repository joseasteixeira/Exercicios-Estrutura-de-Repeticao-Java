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
public class Exercicio_13 {
    /*
    Faça um programa que peça dois números, base e expoente, calcule e 
    mostre o primeiro número elevado ao segundo número. Não utilize a 
    função de potência da linguagem.
    */
    public static void main(String[] args){
        int base=1, expoente, total=base;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Informe a base: ");
        base=scan.nextInt();
        System.out.println("Informe o expoente: ");
        expoente=scan.nextInt();
        
        for(int i=1;i<=expoente;i++){
            total=total*base;
        }
        System.out.println("Resultado: "+total);
    }
}
