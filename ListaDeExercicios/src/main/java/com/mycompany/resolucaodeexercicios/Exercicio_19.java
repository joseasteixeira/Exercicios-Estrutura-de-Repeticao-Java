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
public class Exercicio_19 {
    /*
    Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.
    */
     public static void main(String[] args) throws java.io.IOException{
        int quantidade,maior=0,menor=0,soma=0;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Informe a quantidade de núneros: ");
        quantidade=scan.nextInt();
        int[] numero=new int[quantidade];
        for(int i=0;i<quantidade;i++){
            System.out.println("Informe o "+(i+1)+"° núnero: ");
            numero[i]=scan.nextInt();
            if(numero[i]<0||numero[i]>1000){
                System.out.println("Numero invalido!");
                i--;
            }
        }
        maior=menor=numero[0];
        for(int i=0;i<quantidade;i++){
            if(numero[i]>maior){
                maior=numero[i];
            }
            if(numero[i]<menor){
                menor=numero[i];
            }
            soma=soma+numero[i];
        }
        System.out.println("Menor valor: "+menor);
        System.out.println("Maior valor: "+maior);
        System.out.println("Soma dos valores: "+soma);
    }
}
