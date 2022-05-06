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
public class Exercicio_17 {
    /*
    Faça um programa que calcule o fatorial de um número inteiro fornecido 
    pelo usuário. Ex.: 5!=5.4.3.2.1=120
    */
    public static void main(String[] args){
        int numero,total=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero=scan.nextInt();
        if(numero==0){
            total=1;
        }
        while(numero>0){
            total=total*numero;
            numero--;
        }
        System.out.println("Fatorial: "+total);
    }
}
