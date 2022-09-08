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
public class Exercicio_23 {
    /*
    Faça um programa que mostre todos os primos entre 1 e N sendo N um 
    número inteiro fornecido pelo usuário. O programa deverá mostrar 
    também o número de divisões que ele executou para encontrar os números 
    primos. Serão avaliados o funcionamento, o estilo e o número de testes 
    (divisões) executados.
    */
    public static void main(String[] args){
        int numero;
        boolean teste=false;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Informe o numero de parada: ");
        numero=scan.nextInt();
        
        for(int i=1;i<=numero;i++){
            teste=false;
            for(int j=(i-1);j>1;j--){
            if(i%j==0){
                teste=true;
                break;
            }
        }
        if(teste==true){
            //System.out.println(i+" não é primo!");
        }
        
        else{
            System.out.println(i+" é primo! ");
        }
            
        }
        
    }
}
