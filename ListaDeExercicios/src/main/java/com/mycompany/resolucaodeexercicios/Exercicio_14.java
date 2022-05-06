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
public class Exercicio_14 {
    /*
    Faça um programa que peça 10 números inteiros, calcule e mostre a 
    quantidade de números pares e a quantidade de números impares.
    */
    public static void main(String[] args){
        int numero, numerosPares=0, numerosImpares=0;
        Scanner scan=new Scanner(System.in);
        
        for(int i=1;i<=10;i++){
            System.out.println("Informe o "+i+"° número: ");
            numero=scan.nextInt();
            if(numero%2==0){
                numerosPares++;
            }
            else{
                numerosImpares++;
            }
        }
        System.out.println(numerosPares+" números pares.");
        System.out.println(numerosImpares+" números impares.");
    }
}
