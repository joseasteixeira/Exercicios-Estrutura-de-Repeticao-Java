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
public class Exercicio_48 {
    /*
    Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero invertido.
    Exemplo:
      12376489
      => 98467321
    */
    public static void main(String[] args){
        int numero;
        Scanner scan=new Scanner(System.in);
        System.out.println("Digite um número:");
        numero=scan.nextInt();
        char[] caracteres = Integer.toString(numero).toCharArray();
        System.out.print("=> ");
        for(int i=(caracteres.length-1);i>=0;i--){
            System.out.print(caracteres[i]);
        }
    }
}
