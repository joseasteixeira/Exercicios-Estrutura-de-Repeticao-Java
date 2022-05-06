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
public class Exercicio_11 {
    /*
    Altere o programa anterior para mostrar no final a soma dos números.
    */
     public static void main(String[] args){
        int num1, num2, somatorio=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        num1=scan.nextInt();
        System.out.println("Informe o segundo número: ");
        num2=scan.nextInt();
        
        for(int i=num1;i<=num2;i++){
            System.out.print(i+" ");
            somatorio=somatorio+i;
        }
        System.out.println("\nA soma de todos os números é "+somatorio);
    }
}
