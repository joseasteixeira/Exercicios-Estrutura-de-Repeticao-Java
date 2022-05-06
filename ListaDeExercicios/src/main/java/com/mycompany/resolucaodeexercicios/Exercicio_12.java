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
public class Exercicio_12 {
    /*
    Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer 
    número inteiro entre 1 a 10. O usuário deve informar de qual numero ele 
    deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
    Tabuada de 5:
    5 X 1 = 5
    5 X 2 = 10
    ...
    5 X 10 = 50
    */
    public static void main(String[] args){
        int numero;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        numero=scan.nextInt();
        System.out.println("Tabuada do "+numero+": ");
        for(int i=1;i<=10;i++){
            System.out.println(numero+"*"+i+"="+(numero*i));
        }
    }
}
