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
public class Exercicio_50 {
    /*
    Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o 
    valor de H com N termos.
    */
    public static void main(String[] args){
        int n;
        float s=1f, a=1f;
        Scanner scan=new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0");
        
        System.out.println("Informe quantos elementos terá a sequência:");
        n=scan.nextInt();
        
        System.out.print("S = 1");
        for(int i=1;i<n;i++){
            a=a+1;
            //b=b+2;
            s=s+(1/a);
            System.out.print(" + "+1+"/"+formatter.format(a));
        }
        System.out.print(" = "+s);
    }
}
