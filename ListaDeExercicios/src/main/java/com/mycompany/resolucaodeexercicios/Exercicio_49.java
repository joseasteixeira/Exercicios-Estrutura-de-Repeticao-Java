/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resolucaodeexercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_49 {
    /*
    Faça um programa que mostre os n termos da Série a seguir:
    S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 
    Imprima no final a soma da série.
    */
    public static void main(String[] args){
        int n;
        float s=0.5f, a=1f, b=1f;
        Scanner scan=new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0");
        
        System.out.println("Informe quantos elementos terá a sequência:");
        n=scan.nextInt();
        
        System.out.print("S = 1/1");
        for(int i=1;i<n;i++){
            a=a+1;
            b=b+2;
            s=s+(a/b);
            System.out.print(" + "+formatter.format(a)+"/"+formatter.format(b));
        }
        System.out.print(" = "+s);
    }
}
