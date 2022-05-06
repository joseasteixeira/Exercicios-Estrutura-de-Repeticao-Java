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
public class Exercicio_20 {
    /*
    Altere o programa de cálculo do fatorial, permitindo ao usuário calcular 
    o fatorial várias vezes e limitando o fatorial a números inteiros 
    positivos e menores que 16.
    */
    public static void main(String[] args){
        int numero=1,total;
        Scanner scan=new Scanner(System.in);
        int controle=1;
        while(controle==1){
            if(controle==1){
                numero=-1;
            }
            total=1;
            while(numero<0||numero>16){
                System.out.println("Digite um número: ");
                numero=scan.nextInt();
                if(numero<0||numero>16){
                    System.out.println("Numero invalido!");
                }
            }
            
            if(numero==0){
                total=1;
            }
            while(numero>0){
                total=total*numero;
                numero--;
            }
            System.out.println("Fatorial: "+total);
            System.out.println("Digite '1' para contituar ou '0' finalizar!");
            controle=scan.nextInt();
        }
        
    }
}
